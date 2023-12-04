package br.com.brunoamadei.bank;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // criar conta (agencia, conta, nome)
        Bank jBank = new Bank("0001");
        while (true) {
            System.out.println("O que deseja fazer? C-Criar conta, E-Sair");
            String op = scanner.nextLine();

            if (op.equals("C")) {
                System.out.println("Digite seu nome: ");
                String name = scanner.nextLine();
                Account account = jBank.generateAccount(name);
                jBank.insertAccount(account);

                operateAccount(account);
            } else if (op.equals("E")) {
                break;
            } else {
                System.out.println("Comando Inválido, tente novamente!");
            }
        }

        List<Account> accountList = jBank.getAccounts(); 
        for(Account cc: accountList){
            System.out.println(cc);
       }
    }

    // Ações na conta
    static void operateAccount(Account account) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Qual operação deseja realizar? D-Depósito | S-Saque | E-Exit(sair)");
            String op = scanner.nextLine();

            if (op.equals("D")) {
                System.out.println("Qual valor deseja depositar?");
                double value = scanner.nextDouble();
                account.deposit(value);
            } else if (op.equals("S")) {
                System.out.println("Qual valor deseja Sacar?");
                double value = scanner.nextDouble();
                account.withDraw(value);
            } else if (op.equals("E")) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Comando Inválido, tente novamente!");
            }
            scanner = new Scanner(System.in);
        }
    }
}
