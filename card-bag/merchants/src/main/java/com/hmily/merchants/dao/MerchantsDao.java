package com.hmily.merchants.dao;

import com.hmily.merchants.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName MerchantsDao
 * @Description Merchants Dao 接口
 * @Author Hmily
 * @Date 2019/6/16 11:15
 **/
public interface MerchantsDao extends JpaRepository<Merchants, Integer> {

    /**
     * 根据 id 获取商户对象
     * @param id
     * @return
     */
    Merchants findById(Integer id);

    /**
     * 根据商户名称获取商户对象
     * @param name
     * @return
     */
    Merchants findByName(String name);
}
