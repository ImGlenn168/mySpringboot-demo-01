package com.java.controller.impl;

import com.java.controller.AccountController;
import com.java.domain.ar.AccountAr;
import com.java.domain.dto.AccountDto;
import com.java.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountControllerImpl implements AccountController {

    @Autowired
    private AccountServiceImpl accountService;

    public List<AccountDto> findAll(){
        List<AccountAr> arList = accountService.findAll();
        List<AccountDto> accountDtos = new ArrayList<>();
        for (AccountAr account : arList) {
            accountDtos.add(new AccountDto(account.getId(), account.getName(), account.getMoney()));
        }
        return accountDtos;
    }

    @Override
    public String test01() {
        return "测试成功！！！";
    }
}
