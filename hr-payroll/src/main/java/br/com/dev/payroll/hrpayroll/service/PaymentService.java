package br.com.dev.payroll.hrpayroll.service;

import br.com.dev.payroll.hrpayroll.entity.Payment;
import br.com.dev.payroll.hrpayroll.entity.Worker;
import br.com.dev.payroll.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, Integer days){
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment (worker.getName(), worker.getDailyIncome(), days);
    }
}
