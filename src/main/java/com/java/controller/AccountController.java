package com.java.controller;

import com.java.domain.dto.AccountDto;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface AccountController {

    @GetMapping ("/find")
    List<AccountDto> findAll();

    @GetMapping("/test")
    String test01();

}
