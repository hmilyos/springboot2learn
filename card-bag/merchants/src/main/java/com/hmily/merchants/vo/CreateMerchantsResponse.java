package com.hmily.merchants.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CreateMerchantsResponse
 * @Description 创建商户响应对象
 * @Author Hmily
 * @Date 2019/6/16 11:39
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsResponse {

    /** 商户 id: 创建失败则为 -1 */
    private Integer id;
}
