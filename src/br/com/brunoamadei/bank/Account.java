package br.com.brunoamadei.bank;

public class Account {
    // variáveis
    private static final int MAX_LENGTH = 12;
    private String ag;
    private String cc;
    private String name;
    private double balance;
    private Log logger;

    // construtor de conta 
    public Account(String ag, String cc, String name) {
        this.ag = ag;
        this.cc = cc;
        setName(name);
        logger = new Log();
    }

    // definindo nome de usuario + caracteres limitados
    public void setName(String name) {
        if (name.length() > MAX_LENGTH) {
            this.name = name.substring(0, MAX_LENGTH);
        } else {
            this.name = name;
        }
    }

    // depositando valores 
    public void deposit(double value) {
        balance += value;
        logger.out("Depósito realizado R$" + value);
        logger.out("Saldo atual: R$" + balance);
    }

    // teste se valor é menor ou igual ao saldo 
    public boolean withDraw(double value) {
        if (balance < value) {
            logger.out("Saldo insuficiente para saque, disponivel: R$" + balance);
            return false;
        } else {
            balance -= value;
            logger.out("Saque realizado de R$" + value + " | Saldo atual: R$" + balance);
            return true;
        }
    }
    
    // retornando info da conta
    public String toString() {
        return "A conta " +this.name + "| Agência = " + this.ag + "| Conta = " + this.cc + "| Possui R$" + balance;
    }
}
