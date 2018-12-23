package com.itheima.service;

import com.itheima.domain.Account;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface AccountService {

    List<Account> findAll();
    void save(Account account);

}
