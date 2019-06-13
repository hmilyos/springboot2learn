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
            {1, "一等奖", 0.0001},
            {2, "不要灰心", 39.9994},
            {3, "祝您好运", 20.0},
            {4, "二等奖", 0.0002},
            {5, "再接再厉", 20.0},
            {6, "运气先攒着", 10.0},
            {7, "三等奖", 0.0003},
            {8, "谢谢参与", 10.0}
    };
    Object result[] = award(prizeArr);//抽奖后返回奖品等级及奖品描述

    //抽奖后返回奖品等级及奖品描述
    public static Object[] award(Object[][] prizeArr) {
        //概率数组
        float obj[] = new float[prizeArr.length];
        for (int i = 0; i < prizeArr.length; i++) {
            obj[i] = Float.parseFloat(prizeArr[i][2].toString());
        }
        Integer prizeId = getRand(obj); //根据概率获取奖项号码
        String msg = (String) prizeArr[prizeId][1];//奖品信息
        Integer prizeIds = prizeId + 1;
        System.out.println("奖品号: " + prizeIds + " 获奖等级:" + msg);

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
        DataRow data = new DataRow();//此处DataRow为封装了的 HashMap
        List<DataRow> resultList = new ArrayList<DataRow>();
        for (int i = 0; i < 6; i++) {
            int k = 1;
            Object result[] = award(prizeArr);//抽奖后返回角度和奖品等级
            String prize = "";
            String comment = "";
            for (Object object : result) {
                if (k == 1) {
                    prize = object.toString();
                } else if (k == 2) {
                    comment = object.toString();
                }
                k++;
            }
            if (k == 3) {
                data.set("prize", Integer.valueOf(prize) + 1);
                data.set("comment", comment);
                resultList.add(data);
            }
        }
    }

    public static int compareMethod(BigDecimal a, BigDecimal b) {
        return a.compareTo(b);
    }

}
