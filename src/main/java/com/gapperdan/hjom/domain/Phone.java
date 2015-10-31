package com.gapperdan.hjom.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Phone {

    @Getter @Setter
    private String type;

    @Getter @Setter
    private String number;
}
