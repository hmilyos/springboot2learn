package com.hmily.sharddemo.controller;

import com.hmily.sharddemo.domain.Member;
import com.hmily.sharddemo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MemberController
 * @Description TODO
 * @Date 2019/5/29 14:44
 **/
@RestController
@RequestMapping("/member/")
public class MemberController {

    @Autowired
    private MemberService memberService;

    private Integer id = 0;

    @GetMapping("save")
    public String saveMember() {
        Member member = new Member(++id, "tom" + id, id);
        boolean res = memberService.save(member);
        return res ? "success" : "falied";
    }

}
