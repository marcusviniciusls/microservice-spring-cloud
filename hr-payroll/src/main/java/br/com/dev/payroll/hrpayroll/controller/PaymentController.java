package br.com.dev.payroll.hrpayroll.controller;

import br.com.dev.payroll.hrpayroll.entity.Payment;
import br.com.dev.payroll.hrpayroll.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @HystrixCommand(fallbackMethod = "getPaymentAlternative")
    @GetMapping(value = "/{workedId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workedId, @PathVariable Integer days){
        Payment payment = paymentService.getPayment(workedId, days);
        return ResponseEntity.ok(payment);
    }

    public ResponseEntity<Payment> getPaymentAlternative(@PathVariable Long workedId, @PathVariable Integer days){
        Payment payment = new Payment("Brann", BigDecimal.valueOf(400.0), days);
        return ResponseEntity.ok(payment);
    }

}
