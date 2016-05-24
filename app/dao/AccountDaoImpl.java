package dao;

import models.Account;

import java.util.List;

/**
 * Created by Ramneek on 20/05/2016.
 */
public class AccountDaoImpl extends Dao<Integer, Account> implements AccountDao {
    public AccountDaoImpl(){
        super(Integer.class, Account.class);
    }

    @Override
    public boolean isAccountExist(int id) {
        return false;
    }

    @Override
    public boolean isAccountExist(String username) {
        return false;
    }

    @Override
    public Account findAccountById(int id) {
        return null;
    }

    @Override
    public Account findAccountByUsername(String username) {
        return null;
    }

    @Override
    public Account findAccountByEmail(String email) {
        return null;
    }

    @Override
    public List<Account> getAllAccounnts() {
        return null;
    }

    @Override
    public void create(Account account) {

    }

    @Override
    public void remove(Account account) {

    }

    @Override
    public void update(Account account) {

    }
}
