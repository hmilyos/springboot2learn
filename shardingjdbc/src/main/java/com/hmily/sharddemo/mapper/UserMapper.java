package com.hmily.sharddemo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.hmily.sharddemo.domain.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description TODO
 * @Date 2019/5/29 9:37
 **/
@Mapper
public interface UserMapper {
    /**
     * 根据主键删除对象
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增对象
     *
     * @param record
     */
    Integer insert(UserEntity record);

    /**
     * 根据主键获取对象
     *
     * @param id
     */
    UserEntity selectByPrimaryKey(Integer id);

    /**
     * 获取全部对象
     *
     */
    List<UserEntity> selectAll();

    /**
     * 根据主键来更新对象
     *
     * @param record
     */
    int updateByPrimaryKey(UserEntity record);
}
