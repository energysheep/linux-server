package com.example.linux.service;


import com.example.linux.domain.entity.Member;
import com.example.linux.domain.request.MemberRequest;
import com.example.linux.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LinuxService {

    private final MemberRepository memberRepository;

    public void save(MemberRequest memberRequest){
        Member member = memberRequest.toEntity();
        memberRepository.save(member);
    }

    public List<Member> getAll(){
        return memberRepository.findAll();
    }
}