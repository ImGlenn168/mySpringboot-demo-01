package com.java.service.impl;

import com.java.domain.ar.AccountAr;
import com.java.domain.dto.AccountDto;
import com.java.domain.entity.Account;
import com.java.mapper.IAccountMapper;
import com.java.mapper.po.AccountPO;
import com.java.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountMapper accountMapper;

    @Override
    public List<AccountAr> findAll() {
        List<AccountPO> accounts = accountMapper.findAll();
        List<AccountAr> accountDtArs = new ArrayList<>();
        for (AccountPO account : accounts) {
            accountDtArs.add(new AccountAr(account.getId(), account.getName(), account.getMoney()));
        }
        return accountDtArs;
    }}
