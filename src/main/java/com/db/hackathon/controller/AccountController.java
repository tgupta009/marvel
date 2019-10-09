package com.db.hackathon.controller;


import com.db.hackathon.model.Account;
import com.db.hackathon.model.Employee;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class AccountController {

    @GetMapping("/account")
    public List<Account> getAccountList() {
        List<Account> employeesList = new ArrayList<>();
        employeesList.add(new Account(1, "saving account"));
        return employeesList;
    }
}
