package br.com.dev.payroll.hrpayroll.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class SuperEntity{

    private Long id;
    private LocalDateTime dateCreation;
    private LocalDateTime dateUpdate;
    private boolean status;

    public SuperEntity() {
        LocalDateTime now = LocalDateTime.now();
        dateCreation = now;
        status = true;
    }
}
