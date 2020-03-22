package cn.hbz.service.impl;

import cn.hbz.dao.AccountDao;
import cn.hbz.domain.Account;
import cn.hbz.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AccountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("查询用户。。");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("保存用户。。");
        accountDao.saveAccount(account);
    }
}
