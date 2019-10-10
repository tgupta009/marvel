package com.db.hackathon.controller;

import java.time.Instant;
import java.util.List;
import java.util.Map;

import com.db.hackathon.service.AccountService;
import com.db.hackathon.sqlObject.Txn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @Autowired
    HttpSession httpSession;

    @Autowired
    AccountService accountService;
    
    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        return "index";
    }    
    

    @RequestMapping("/welcome")
    public String home2(Map<String, Object> model) {
        model.put("message", "MyBankApplication.");
        model.put("custName", "John");
        model.put("loginTime", Instant.now());
        return "index";
    }

    @RequestMapping("/viewTxnDtls")
    public String viewTxnDtls(Map<String, Object> model) {
        List<Txn> txnList = accountService.getTxDtls(101);
        model.put("txnList", txnList);
        model.put("message", "Thank you for opting sustainability-initiatives.");
        httpSession.setAttribute("txnList",txnList);
        return "viewTxnDtls";
    }

    @RequestMapping("/activateGreenInitiative")
    public String activateGreenInitiative(Map<String, Object> model) {
        List<Txn> txnList = accountService.getTxDtls(101);
        model.put("txnList", txnList);
        model.put("message", "Thank you for opting sustainability-initiatives.");
        return "activateGreenInitiative";
    }
}
