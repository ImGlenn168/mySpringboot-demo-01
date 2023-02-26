package com.java.service;

import com.java.domain.ar.AccountAr;
import com.java.domain.entity.Account;

import java.util.List;

public interface IAccountService {

    List<AccountAr> findAll();
}
