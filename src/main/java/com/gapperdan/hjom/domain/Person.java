package com.gapperdan.hjom.domain;

import com.gapperdan.hjom.domain.Address;
import com.gapperdan.hjom.domain.Phone;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private int age;

    @Getter @Setter
    private Address address;

    @Getter @Setter
    private List<Phone> phones;

}
