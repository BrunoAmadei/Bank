package br.com.brunoamadei.bank;

public class App {
    public static void main(String[] args) {

        // criar conta (agencia, conta, nome)
        Account account = new Account("0001", "1234", "Madruguinha Oliver");

        // sacar valores (não pode sacar mais do que tem)
        boolean success = account.withDraw(200.00);
        // if (!success) {
        // System.out.println("Não há saldo suficiente para sacar");
        // }
        // depositar
        account.deposit(150);
        account.deposit(50);
        account.deposit(100);

        if (!account.withDraw(150.00)) {
            System.out.println("Não há saldo suficiente para sacar");
        } else {
            System.out.println("saque efetuado");
        }

        if (!account.withDraw(200.00)) {
            System.out.println("Não há saldo suficiente para sacar");
        } else {
            System.out.println("saque efetuado");
        }

        // informar operações para usuario
    }
}
