package com.example.audit;

import com.example.audit.as.as.model.StoreActivationSimRequest;
import com.example.audit.as.as.model.StoreChangeProductRequest;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestAuditable {

    @PostConstruct
    public void init() {
        activate("activate iccid", "activate msisdn", "activate region");
    }

    @Audit(auditRequest = StoreActivationSimRequest.class)
    public void activate(String iccid, String msisdn, String region) {
        System.out.println("inside activate");
    }

    @Audit(auditRequest = StoreChangeProductRequest.class)
    public void changePassword(String iccid, String msisdn, String productId) {
        throw new RuntimeException("inside changePassword");
    }
}