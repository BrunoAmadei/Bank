package br.com.brunoamadei.bank;

public class App {
    public static void main(String[] args) {

        // criar conta (agencia, conta, nome)
        Account account = new Account("0001", "1234", "Madruguinha Oliver");

        // sacar valores (não pode sacar mais do que tem)
        boolean success = account.withDraw(200.00);
        if(!success){
            System.out.println("Não há saldo suficiente para sacar");
        }
        // depositar
        // informar operações para usuario
    }
}
