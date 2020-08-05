package com.example.audit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

@Controller
public class NaherController {
    @Autowired
    TestAuditable obj;

    @GetMapping("/her")
    @ResponseBody
    public String naher() {
        obj.changePassword("changePassword iccid", "changePassword msisdn", "changePassword productId");
        return "her";
    }

    @GetMapping("/good")
    @ResponseBody
    public String good() {
        obj.activate("activate iccid", "activate msisdn", "activate region");
        return "good";
    }
}
