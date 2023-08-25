package com.side.cakeproject.domain;

import com.side.cakeproject.common.Address;
import com.side.cakeproject.entity.Member;
import com.side.cakeproject.entity.Shop;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class ShopDTO {
    private long id;
    private Member member;
    private String name;
    private String call;
    private Address address;
    private int openTime;
    private int closeTime;
    private Timestamp registDate;

    public Shop toEntity(){
        return Shop.ShopBuilder()
                .name(name)
                .call(call)
                .address(address)
                .openTime(openTime)
                .closeTime(closeTime)
                .build();
    }
}
