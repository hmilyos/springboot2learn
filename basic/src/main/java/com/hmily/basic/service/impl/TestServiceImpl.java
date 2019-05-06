package com.hmily.basic.service.impl;

import com.hmily.basic.domain.JsonBean;
import com.hmily.basic.service.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestServiceImpl implements ITestService {

    @Override
    public JsonBean getJson(long id) {
        log.info("id: {}", id);
        return new JsonBean(id, "hot ser name: " + id + " json");
    }



}
