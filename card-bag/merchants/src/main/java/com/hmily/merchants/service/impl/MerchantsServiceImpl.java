package com.hmily.merchants.service.impl;

import com.alibaba.fastjson.JSON;
import com.hmily.merchants.constant.Constants;
import com.hmily.merchants.constant.ErrorCode;
import com.hmily.merchants.dao.MerchantsDao;
import com.hmily.merchants.entity.Merchants;
import com.hmily.merchants.service.IMerchantsService;
import com.hmily.merchants.vo.CreateMerchantsRequest;
import com.hmily.merchants.vo.CreateMerchantsResponse;
import com.hmily.merchants.vo.PassTemplate;
import com.hmily.merchants.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName MerchantsServiceImpl
 * @Description 商户服务接口实现
 * @Author Hmily
 * @Date 2019/6/16 11:46
 **/
@Slf4j
@Service
public class MerchantsServiceImpl implements IMerchantsService {


    /** Merchants 数据库接口 */
    private final MerchantsDao merchantsDao;

    /** kafka 客户端 */
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public MerchantsServiceImpl(MerchantsDao merchantsDao,
                             KafkaTemplate<String, String> kafkaTemplate) {
        this.merchantsDao = merchantsDao;
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    @Transactional
    public Response createMerchants(CreateMerchantsRequest request) {
        Response response = new Response();
        CreateMerchantsResponse merchantsResponse = new CreateMerchantsResponse();

        ErrorCode errorCode = request.validate(merchantsDao);
        if (errorCode != ErrorCode.SUCCESS) {
            merchantsResponse.setId(-1);
            response.setErrorCode(errorCode.getCode());
            response.setErrorMsg(errorCode.getDesc());
        } else {
            Integer id = merchantsDao.save(request.toMerchants()).getId();
            merchantsResponse.setId(id);
        }

        response.setData(merchantsResponse);
        return response;
    }

    @Override
    public Response buildMerchantsInfoById(Integer id) {
        Response response = new Response();

        Merchants merchants = merchantsDao.findById(id);
        if (null == merchants) {
            response.setErrorCode(ErrorCode.MERCHANTS_NOT_EXIST.getCode());
            response.setErrorMsg(ErrorCode.MERCHANTS_NOT_EXIST.getDesc());
        }

        response.setData(merchants);

        return response;
    }

    @Override
    public Response dropPassTemplate(PassTemplate template) {
        Response response = new Response();
        ErrorCode errorCode = template.validate(merchantsDao);

        if (errorCode != ErrorCode.SUCCESS) {
            response.setErrorCode(errorCode.getCode());
            response.setErrorMsg(errorCode.getDesc());
        } else {
            String passTemplate = JSON.toJSONString(template);
            kafkaTemplate.send(
                    Constants.TEMPLATE_TOPIC,
                    Constants.TEMPLATE_TOPIC,
                    passTemplate
            );
            log.info("DropPassTemplates: {}", passTemplate);
        }

        return response;
    }
}
