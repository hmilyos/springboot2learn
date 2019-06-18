package com.hmily.passbook.service;

import com.hmily.passbook.vo.PassTemplate;

/**
 * @ClassName IHBasePassService
 * @Description Pass Hbase 服务
 * @Author ouShiMing
 * @Date 2019/6/18 8:41
 **/

public interface IHBasePassService {
    /**
     * 将 PassTemplate 写入 HBase
     * @param passTemplate
     * @return
     */
    boolean dropPassTemplateToHBase(PassTemplate passTemplate);

}
