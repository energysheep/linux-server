package com.example.linux.domain.request;

import com.example.linux.domain.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberRequest {

    private String name;
    private String description;

    public Member toEntity(){
        return Member.builder().name(name).description(description).build();
    }

}