package br.com.brunoamadei.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String ag;
    private List<Account> accounts;
    private int lastAccount = 001;

    public Bank(String ag) {
        this.ag = ag;
        this.accounts = new java.util.ArrayList<>();
    }

    public List<Account> getAccounts(){
        return accounts;
    }

    public void insertAccount(Account account) {
        accounts.add(account);
    }

    public Account generateAccount(String name) {
        Account account = new Account(ag, "" + lastAccount++, name);
        return account;
    }
}
