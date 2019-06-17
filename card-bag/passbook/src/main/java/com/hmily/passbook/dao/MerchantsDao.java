package com.hmily.passbook.dao;

import com.hmily.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ClassName MerchantsDao
 * @Description Merchants Dao 接口
 * @Author Hmily
 * @Date 2019/6/17 8:32
 **/
public interface MerchantsDao extends JpaRepository<Merchants, Integer> {

    /**
     * 通过 id 获取商户对象
     * @param id 商户 id
     * */
    Merchants findById(Integer id);

    /**
     * 根据商户名称获取商户对象
     * @param name 商户名称
     * */
    Merchants findByName(String name);

    /**
     * 根据商户 ids 获取商户对象
     * @param ids 商户 ids
     * */
    List<Merchants> findByIdIn(List<Integer> ids);
    
}
