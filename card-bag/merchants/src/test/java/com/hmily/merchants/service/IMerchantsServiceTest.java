package com.hmily.merchants.service;

import com.alibaba.fastjson.JSON;
import com.hmily.merchants.vo.CreateMerchantsRequest;
import com.hmily.merchants.vo.PassTemplate;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * 商户服务测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class IMerchantsServiceTest {

    @Autowired
    private IMerchantsService merchantsService;

    @Test
    public void createMerchants() {
        CreateMerchantsRequest request = new CreateMerchantsRequest();
        request.setName("hmily001");
        request.setLogoUrl("www.hmily.com");
        request.setBusinessLicenseUrl("www.hmily.com");
        request.setPhone("1234567890");
        request.setAddress("GZ");

        System.out.println(JSON.toJSONString(merchantsService.createMerchants(request)));
    }

    @Test
    public void buildMerchantsInfoById() {
        System.out.println(JSON.toJSONString(merchantsService.buildMerchantsInfoById(1)));
    }

    // bin/kafka-console-consumer.sh --zookeeper localhost:2181 --topic merchants-template --from-beginning
    @Test
    public void dropPassTemplate() {
        PassTemplate passTemplate = new PassTemplate();
        passTemplate.setId(1);
        passTemplate.setTitle("hmily-1");
        passTemplate.setSummary("简介: hmily");
        passTemplate.setDesc("详情: hmily desc");
        passTemplate.setLimit(10000L);
        passTemplate.setHasToken(false);
        passTemplate.setBackground(2);
        passTemplate.setStart(DateUtils.addDays(new Date(), -10));
        passTemplate.setEnd(DateUtils.addDays(new Date(), 10));

        System.out.println(JSON.toJSONString(
                merchantsService.dropPassTemplate(passTemplate)
        ));
    }
}