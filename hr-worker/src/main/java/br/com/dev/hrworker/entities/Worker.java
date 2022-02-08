package br.com.dev.hrworker.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.ConstructorParameters;
import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "TB_WORKER")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Worker extends SuperEntities{

    private String name;
    private BigDecimal dailyIncome;
}
