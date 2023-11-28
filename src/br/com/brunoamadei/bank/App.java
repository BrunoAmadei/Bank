package br.com.brunoamadei.bank;

public class App {
    public static void main(String[] args) {

        // criar conta (agencia, conta, nome)
        Account account = new Account("0001", "1234", "Madruguinha Oliver");

        
        // depositar
        account.deposit(150);
        account.deposit(50);
        account.deposit(100);
        
        // sacar valores (não pode sacar mais do que tem)
        if (!account.withDraw(150.00)) {
            System.out.println("Não há saldo suficiente para sacar");
        }

        if (!account.withDraw(85.45)) {
            System.out.println("Não há saldo suficiente para sacar");
        }
        // informar usuario sobre a conta
        System.out.println(account);
    }
}
