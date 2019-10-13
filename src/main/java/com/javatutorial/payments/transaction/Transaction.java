package com.javatutorial.payments.transaction;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter(AccessLevel.PRIVATE)
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_generator")
    @SequenceGenerator(name = "transaction_generator", sequenceName = "transaction_id")
    private Long id;

    private BigDecimal amount;
    //    private User sender;
    private String sender;
    //    private User receiver;
    private String receiver;
    private LocalDateTime timestamp;
    private boolean valid;

}
