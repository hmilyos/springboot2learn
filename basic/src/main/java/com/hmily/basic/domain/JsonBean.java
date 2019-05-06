package com.hmily.basic.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonBean implements Serializable {

    private long id;//主键.

    private String name;//测试名称.

}
