package com.example.linux.controller;


import com.example.linux.domain.entity.Member;
import com.example.linux.domain.request.MemberRequest;
import com.example.linux.service.LinuxService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api")
@CrossOrigin("http://loacalhost:3000") //3000만 지정하는게 정석이다
public class LinuxController {
    private final LinuxService linuxService;
    @PostMapping
    public void save(@RequestBody MemberRequest memberRequest){
        linuxService.save(memberRequest);
    }

    @GetMapping
    public List<Member> getAll(){
        return  linuxService.getAll();
    }
}