package com.side.cakeproject.common;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Getter
@Setter
@Embeddable
public class Address {
    private String zipCode;
    private String localAddress;
    private String townAddress;
}
