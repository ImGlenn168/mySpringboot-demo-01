package com.java.test;

import com.java.domain.entity.Account;
import com.java.mapper.IAccountMapper;
import com.java.mapper.po.AccountPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountMapperTest {

    @Autowired
    private IAccountMapper accountMapper;

    @Test
    public void getAll(){
        List<AccountPO> list = accountMapper.findAll();
        for (AccountPO account : list) {
            System.out.println(account);
        }
    }

    @Test
    public void test(){
        List<AccountPO> all = accountMapper.findAll();
        for (AccountPO account : all) {
            System.out.println(account);
        }
    }
}
