package com.side.cakeproject.domain;

import com.side.cakeproject.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

public class MemberDTO {


    @Getter
    @Setter
    @NoArgsConstructor
    public static class Requset {
        @NotNull
        @Size(min = 4, max = 20)
        private String id;
        @NotNull
        private String password;
        @NotNull
        private String name;
        @Email
        private String email;
        private String image;

        public Member toEntity() {
            return Member.MemberBuilder()
                    .id(id)
                    .password(password)
                    .name(name)
                    .email(email)
                    .image(image)
                    .build();
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor
    public static class Response{
        private long no;
        private String id;
        private String password;
        private String name;
        private String email;
        private String image;
        private Timestamp registDate;

        public Response(Member member){
            this.no = member.getNo();
            this.id = member.getId();
            this.password = member.getPassword();
            this.name = member.getName();
            this.email = member.getEmail();
            this.registDate = member.getRegistDate();
        }
    }

}
