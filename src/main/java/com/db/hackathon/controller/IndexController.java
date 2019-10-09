package com.db.hackathon.controller;

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
    private HttpSession httpSession;

    @Autowired
    AccountService accountService;

    @RequestMapping("/welcome")
    public String home(Map<String, Object> model) {
        model.put("message", "MyBankApplication !!");
        return "index";
    }

    @RequestMapping("/next")
    public String next(Map<String, Object> model) {
        List<Txn> txnList = accountService.getTxDtls(101);
       // httpSession.setAttribute("txnList", txnList);
        model.put("txnList", txnList);
        model.put("message", "Thank you for opting sustainability-initiatives.");
        return "next";
    }

}