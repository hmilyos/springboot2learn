package com.hmily.sharddemo.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName("member")
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;
}
