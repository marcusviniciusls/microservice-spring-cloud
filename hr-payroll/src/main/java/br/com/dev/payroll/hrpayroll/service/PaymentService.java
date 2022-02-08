package br.com.dev.payroll.hrpayroll.service;

import br.com.dev.payroll.hrpayroll.entity.Payment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentService {

    public Payment getPayment(Long workerId, Integer days){
        return new Payment ("Antonio", BigDecimal.valueOf(300.0), days);
    }
}
