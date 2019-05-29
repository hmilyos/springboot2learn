package com.hmily.sharddemo.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hmily.sharddemo.domain.Member;
import com.hmily.sharddemo.mapper.MemberMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MemberService extends ServiceImpl<MemberMapper, Member> {

    @Transactional(rollbackFor = Exception.class)
    public boolean save(Member member) {
        return super.insertOrUpdate(member);
    }

    public List<Member> findAll(){
        Wrapper<Member> query = new EntityWrapper<>();
        query.gt("id", 0);
        return super.selectList(query);
    }
}