package dao;

import models.Account;

import java.util.List;

/**
 * Created by Ramneek on 20/05/2016.
 */
public interface AccountDao {
    boolean isAccountExist(int id);
    boolean isAccountExist(String username);
    Account findAccountById(int id);
    Account findAccountByUsername(String username);
    Account findAccountByEmail(String email);
    List<Account> getAllAccounnts();
    void create(Account account);
    void remove(Account account);
    void update(Account account);
}
