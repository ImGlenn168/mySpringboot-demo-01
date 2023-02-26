package com.java.mapper;

import com.java.mapper.po.AccountPO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface IAccountMapper {

    List<AccountPO> findAll();
}
