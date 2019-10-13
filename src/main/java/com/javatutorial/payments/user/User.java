package com.javatutorial.payments.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter(AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name = "user_generator", sequenceName = "user_id")
    private Long id;

    private String firstname;
    private String lastname;
    private String phoneNumber;
    private String email;
    private BigDecimal balance;

}
