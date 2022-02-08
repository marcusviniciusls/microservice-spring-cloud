package br.com.dev.payroll.hrpayroll.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@Setter
@Getter
public class Payment {

    private String name;
    private BigDecimal dailyIncome;
    private Integer days;

    public Payment(String name, BigDecimal dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public BigDecimal getTotal(){
        return this.dailyIncome.multiply(BigDecimal.valueOf(this.days));
    }
}
