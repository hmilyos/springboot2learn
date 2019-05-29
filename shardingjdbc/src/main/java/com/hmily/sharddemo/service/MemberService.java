package com.hmily.sharddemo.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.hmily.sharddemo.domain.Member;
import com.hmily.sharddemo.mapper.MemberMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService extends ServiceImpl<MemberMapper, Member> {

    @Transactional(rollbackFor = Exception.class)
    public boolean save(Member member) {
        return super.insertOrUpdate(member);
    }
}