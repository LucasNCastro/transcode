package services;

import models.Account;

/**
 * Created by Ramneek on 20/05/2016.
 */
public interface AccountService {
    Account Authenticate(Account account);
    void Create(Account account);
}