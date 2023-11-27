package br.com.brunoamadei.bank;

public class Account {
    private String ag;
    private String cc;
    private String name;

    private static final int MAX_LENGTH = 12;

    private double balance;

    public Account(String ag, String cc, String name) {
        this.ag = ag;
        this.cc = cc;
        setName(name);
    }

    public void setName(String name) {
        if (name.length() > MAX_LENGTH) {
            this.name = name.substring(0, MAX_LENGTH);
        } else {
            this.name = name;
        }
        System.out.println(this.name);
    }

    public void deposit(double value) {
        balance += value;
    }

    public boolean withDraw(double value) {
        if (balance < value) {
            return false;
        } else {
            balance -= value;
            return true;
        }
    }
}
