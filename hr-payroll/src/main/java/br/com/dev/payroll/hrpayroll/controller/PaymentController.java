package br.com.dev.payroll.hrpayroll.controller;

import br.com.dev.payroll.hrpayroll.entity.Payment;
import br.com.dev.payroll.hrpayroll.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping(value = "/{workedId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable Long workedId, @PathVariable Integer days){
        Payment payment = paymentService.getPayment(workedId, days);
        return ResponseEntity.ok(payment);
    }

}
