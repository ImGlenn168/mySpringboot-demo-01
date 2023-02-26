package com.java.mapper.impl;

import com.java.domain.ar.AccountAr;
import com.java.domain.dto.AccountDto;
import com.java.domain.entity.Account;
import com.java.mapper.IAccountMapper;
import com.java.mapper.po.AccountPO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AccountMapperImpl implements IAccountMapper {

    @Autowired
    private IAccountMapper accountMapper;

    @Override
    public List<AccountPO> findAll() {
        List<AccountPO> arList = accountMapper.findAll();
        List<AccountAr> accountArs = new ArrayList<>();
        for (AccountPO account : arList) {
            accountArs.add(new AccountAr(account.getId(), account.getName(), account.getMoney()));
        }
        return arList;
    }
}
