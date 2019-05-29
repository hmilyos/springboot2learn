package com.hmily.sharddemo.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName UserEntity
 * @Description
 * @Date 2019/5/29 8:34
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("user")
public class UserEntity implements Serializable {

    private static final long serialVersionUID = -6171110531081112401L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;

}
