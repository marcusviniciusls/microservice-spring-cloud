package br.com.dev.payroll.hrpayroll.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Worker extends SuperEntity{

    private String name;
    private BigDecimal dailyIncome;
}