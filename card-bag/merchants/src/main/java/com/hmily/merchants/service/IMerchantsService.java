package com.hmily.merchants.service;

import com.hmily.merchants.vo.CreateMerchantsRequest;
import com.hmily.merchants.vo.PassTemplate;
import com.hmily.merchants.vo.Response;

/**
 * @ClassName IMerchantsService
 * @Description 对商户服务接口定义
 * @Author Hmily
 * @Date 2019/6/16 11:41
 **/
public interface IMerchantsService {

    /**
     * 创建商户服务
     * @param request
     * @return
     */
    Response createMerchants(CreateMerchantsRequest request);

    /**
     * 根据 id 构造商户信息
     * @param id
     * @return
     */
    Response buildMerchantsInfoById(Integer id);

    /**
     * 投放优惠券
     * @param template
     * @return
     */
    Response dropPassTemplate(PassTemplate template);
}
