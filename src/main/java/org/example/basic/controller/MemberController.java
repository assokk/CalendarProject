package org.example.basic.controller;


import lombok.RequiredArgsConstructor;
import org.example.basic.dto.MemberRequestDto;
import org.example.basic.dto.MemberResponseDto;
import org.example.basic.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/members")
    public MemberResponseDto createMember(@RequestBody MemberRequestDto memberRequestDto) {
        return memberService.save(memberRequestDto);
    }

    @GetMapping("/members")
    public List<MemberResponseDto> getMembers() {
        return memberService.findAll();
    }
}
