package com.gtbecoder.assignment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account {

    @Id
    private Long id;

    private Long customerId;

    private Long ibanNo;

    private int currentBalance;

    @Enumerated (EnumType.STRING)
    private CurrencyTypeEnum currencyTypeEnum;

    @Enumerated (EnumType.STRING)
    private AccountTypeEnum accountTypeEnum;

    public enum CurrencyTypeEnum {
        TL,
        EURO,
        DOLLAR;
    }

    public enum AccountTypeEnum {
        DRAWING,
        DEPOSIT;
    }


}




