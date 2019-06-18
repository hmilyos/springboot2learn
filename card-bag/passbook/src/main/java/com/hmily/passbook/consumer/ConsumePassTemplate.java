package com.hmily.passbook.consumer;

import com.alibaba.fastjson.JSON;
import com.hmily.passbook.constant.Constants;
import com.hmily.passbook.service.IHBasePassService;
import com.hmily.passbook.vo.PassTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @ClassName ConsumePassTemplate
 * @Description 消费 Kafka 中的 PassTemplate
 * @Author Hmily
 * @Date 2019/6/18 8:39
 **/

@Slf4j
@Component
public class ConsumePassTemplate {

    private final IHBasePassService passService;

    @Autowired
    public ConsumePassTemplate(IHBasePassService passService) {
        this.passService = passService;
    }

    @KafkaListener(topics = {Constants.TEMPLATE_TOPIC})
    public void receive(@Payload String passTemplate,
                        @Header(KafkaHeaders.RECEIVED_MESSAGE_KEY) String key,
                        @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
                        @Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
        log.info("Consumer Receive PassTemplate: {}", passTemplate);

        PassTemplate pt;

        try {
            pt = JSON.parseObject(passTemplate, PassTemplate.class);
        } catch (Exception ex) {
            log.error("Parse PassTemplate Error: {}", ex.getMessage());
            return;
        }

        log.info("DropPassTemplateToHBase: {}", passService.dropPassTemplateToHBase(pt));
    }
}
