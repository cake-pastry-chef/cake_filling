package com.side.cakeproject.domain;

import com.side.cakeproject.entity.Member;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class MemberDTO {
    private long no;
    private String id;
    private String password;
    private String name;
    private String email;
    private String image;
    private Timestamp registDate;

    public Member toEntity(){
        return Member.MemberBuilder()
                .id(id)
                .password(password)
                .name(name)
                .email(email)
                .image(image)
                .build();
    }
}
