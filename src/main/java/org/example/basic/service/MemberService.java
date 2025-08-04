package org.example.basic.service;

import lombok.RequiredArgsConstructor;
import org.example.basic.dto.MemberRequestDto;
import org.example.basic.dto.MemberResponseDto;
import org.example.basic.entity.Member;
import org.example.basic.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberResponseDto save(MemberRequestDto memberRequestDto) {
        Member member = new Member(memberRequestDto.getName(), memberRequestDto.getPassword());
        Member savedMember = memberRepository.save(member);
        return new MemberResponseDto(
                savedMember.getId(),
                savedMember.getName(),
                savedMember.getCreatedAt(),
                savedMember.getModifiedAt()
        );
    }

    @Transactional(readOnly = true)
    public List<MemberResponseDto> findAll() {
        List<Member> members = memberRepository.findAll();
        List<MemberResponseDto> memberResponseDtos = new ArrayList<>();
        for (Member member : members) {
            memberResponseDtos.add(new MemberResponseDto(
                    member.getId(),
                    member.getName(),
                    member.getCreatedAt(),
                    member.getModifiedAt()
            ));
        }
        return memberResponseDtos;
    }
}
