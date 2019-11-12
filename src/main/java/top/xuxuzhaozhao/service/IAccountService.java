package top.xuxuzhaozhao.service;

import top.xuxuzhaozhao.domain.Account;

import java.util.List;

public interface IAccountService {
    List<Account> findAll();

    void saveAccount(Account account);
}
