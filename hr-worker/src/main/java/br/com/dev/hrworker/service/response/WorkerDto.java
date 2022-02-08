package br.com.dev.hrworker.service.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WorkerDto {

    private Long id;
    private String name;
    private BigDecimal dailyIncome;
}
