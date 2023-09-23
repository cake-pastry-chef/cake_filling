package com.side.cakeproject.entity;

import com.side.cakeproject.domain.MemberDTO;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class MemberTest {

    @Test
    @DisplayName("Member Builder 작동 테스트")
    void createMember(){
        MemberDTO.Requset memberDTO = new MemberDTO.Requset();
        memberDTO.setId("ung6860");
        memberDTO.setEmail("test");

        final Member member = memberDTO.toEntity();

        Assertions.assertThat(member.getEmail()).isEqualTo("test");
        Assertions.assertThat(member.getId()).isEqualTo(null);
    }
}
