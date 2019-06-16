package com.hmily.merchants.controller;

import com.alibaba.fastjson.JSON;
import com.hmily.merchants.service.IMerchantsService;
import com.hmily.merchants.vo.CreateMerchantsRequest;
import com.hmily.merchants.vo.PassTemplate;
import com.hmily.merchants.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName MerchantsCtl
 * @Description 商户服务 Controller
 * @Author Hmily
 * @Date 2019/6/16 15:57
 **/

@Slf4j
@RestController
@RequestMapping("/merchants")
public class MerchantsCtl {
    @Autowired
    private IMerchantsService merchantsService;

    @ResponseBody
    @PostMapping("/create")
    public Response createMerchants(@RequestBody CreateMerchantsRequest request) {

        log.info("CreateMerchants: {}", JSON.toJSONString(request));
        return merchantsService.createMerchants(request);
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Response buildMerchantsInfo(@PathVariable Integer id) {

        log.info("BuildMerchantsInfo: {}", id);
        return merchantsService.buildMerchantsInfoById(id);
    }

    /**
     * DropPassTemplates: {"background":1,"desc":"详情: 慕课 second",
     * "end":1528202373202,"hasToken":false,"id":9,"limit":1000,
     * "start":1527338373202,"summary":"简介: 慕课","title":"title: 慕课"}
     * */
    @ResponseBody
    @PostMapping("/drop")
    public Response dropPassTemplate(@RequestBody PassTemplate passTemplate) {

        log.info("DropPassTemplate: {}", passTemplate);
        return merchantsService.dropPassTemplate(passTemplate);
    }
}
