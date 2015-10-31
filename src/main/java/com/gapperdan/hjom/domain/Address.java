package com.gapperdan.hjom.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {

    @Getter @Setter
    private String number;

    @Getter @Setter
    private String street;

    @Getter @Setter
    private String zipCode;

}
