package com.side.cakeproject.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private long no;

    @Column(name = "id", nullable = false, length = 20)
    @Comment("회원 아이디")
    private String id;

    @Column(name = "password", nullable = false, length = 64)
    @Comment("회원 비밀번호")
    private String password;

    @Column(name = "name", nullable = false, length = 10)
    @Comment("회원이름")
    private String name;

    @Column(name = "email", nullable = false, length = 30)
    @Comment("회원 이메일")
    private String email;

    @Column(name = "image", length = 50)
    @Comment("프로필 이미지명")
    private String image;

    @Column(name = "regist_date")
    @CreationTimestamp
    @Comment("회원가입 등록일")
    private Timestamp registDate;

    @Builder(builderClassName = "MemberBuilder", builderMethodName = "MemberBuilder")
    public Member(String id, String password, String name, String email, String image){

        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.image = image;
    }
}
