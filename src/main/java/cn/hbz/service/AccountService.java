package cn.hbz.service;

import cn.hbz.domain.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();

    public void saveAccount(Account account);
}
