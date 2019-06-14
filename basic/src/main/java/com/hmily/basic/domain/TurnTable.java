package com.hmily.basic.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TurnTable
 * @Description TODO
 * @Author ouShiMing
 * @Date 2019/6/13 23:14
 **/
public class TurnTable {

    static Object[][] prizeArr = new Object[][]{
            //里面的指针转动
            {101, "P30 pro 碎片", 0.1},
            {102, "商品1 碎片", 15.0},
            {103, "商品2 碎片", 15.0},
            {104, "五元返现券", 5.0},
            {105, "商品3 碎片", 15.0},
            {106, "商品4 碎片", 14.9},
            {107, "五元返现券", 5.0},
            {108, "金豆 88 ", 30.0}
    };

    private static int bigCount = 0;
    private static int bigCount2 = 0;
    private static int bigCount3 = 0;
    private static int bigCount4 = 0;
    private static int bigCount5 = 0;
    private static int bigCount6 = 0;
    private static int bigCount7 = 0;
    private static int bigCount8 = 0;

    //抽奖后返回奖品等级及奖品描述
    public static Object[] award(Object[][] prizeArr) {
        //概率数组
        float obj[] = new float[prizeArr.length];
        for (int i = 0; i < prizeArr.length; i++) {
            obj[i] = Float.parseFloat(prizeArr[i][2].toString());
        }
        //根据概率获取奖项号码
        Integer prizeId = getRand(obj);
        //奖品信息
        String msg = (String) prizeArr[prizeId][1];
        Integer prizeIds = prizeId + 1;
        System.out.println("奖品id: " + prizeArr[prizeId][0] + " 奖品名称:" + msg);
        switch ((Integer) prizeArr[prizeId][0]){
            case 101: bigCount++;
                break;
            case 102: bigCount2++;
                break;
            case 103: bigCount3++;
                break;
            case 104: bigCount4++;
                break;
            case 105: bigCount5++;
                break;
            case 106: bigCount6++;
                break;
            case 107: bigCount7++;
                break;
            case 108: bigCount8++;
                break;
        }
        return new Object[]{prizeId, msg};
    }


    //根据概率获取奖项
    public static Integer getRand(float obj[]) {
        Integer result = null;
        try {
            float sum = 0.0f;//概率数组的总概率精度
            float min = 0.0f;//
            for (int i = 0; i < obj.length; i++) {
                BigDecimal beforSum = new BigDecimal(Float.toString(sum));
                BigDecimal objValue = new BigDecimal(Float.toString(obj[i]));
                sum = beforSum.add(objValue).floatValue();
            }

            for (int i = 0; i < obj.length; i++) {//概率数组循环
                BigDecimal db = new BigDecimal(Math.random() * (sum - min) + min);
                BigDecimal b = new BigDecimal(Float.toString(obj[i]));
                if (compareMethod(db, b) == -1) {//中奖
                    result = i;
                    break;
                } else {
                    sum -= obj[i];
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        /**
         * 奖品控制代码,这里可以控制我们的奖品的等级
         * **/
        return result;
    }


    public static void main(String[] args) {
//        DataRow data = new DataRow();//此处DataRow为封装了的 HashMap
//        List<DataRow> resultList = new ArrayList<DataRow>();
        for (int i = 0; i < 60000; i++) {
//            调整概率，若抽中的大奖超过多少就把大奖概率调整为0
//            if(bigCount > 10){
//                prizeArr[0][2] = 0.0;
//            }

//            int k = 1;
//            Object result[] = award(prizeArr);//抽奖后返回角度和奖品等级
            award(prizeArr);
//            String prize = "";
//            String comment = "";
//            for (Object object : result) {
//                if (k == 1) {
//                    prize = object.toString();
//                } else if (k == 2) {
//                    comment = object.toString();
//                }
//                k++;
//            }
//            if (k == 3) {
//                data.set("prize", Integer.valueOf(prize) + 1);
//                data.set("comment", comment);
//                resultList.add(data);
//            }
        }
        System.out.println("==========bigCount: " + bigCount * 100/60000);
        System.out.println("==========bigCount2: " + bigCount2 * 100/60000);
        System.out.println("==========bigCount3: " + bigCount3 * 100/60000);
        System.out.println("==========bigCount4: " + bigCount4 * 100/60000);
        System.out.println("==========bigCount5: " + bigCount5 * 100/60000);
        System.out.println("==========bigCount6: " + bigCount6 * 100/60000);
        System.out.println("==========bigCount7: " + bigCount7 * 100/60000);
        System.out.println("==========bigCount8: " + bigCount8 * 100/60000);


    }

    public static int compareMethod(BigDecimal a, BigDecimal b) {
        return a.compareTo(b);
    }

}
