package br.com.brunoamadei.bank;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // criar conta (agencia, conta, nome)
        Account account = new Account("0001", "1234", "Madruguinha Oliver");

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
            }
        }
    }
}
