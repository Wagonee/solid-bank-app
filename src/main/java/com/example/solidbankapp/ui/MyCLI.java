package com.example.solidbankapp.ui;

import com.example.solidbankapp.domain.model.AccountType;

import java.util.Scanner;

public class MyCLI implements CLUI {

    private final Scanner scanner;

    MyCLI(Scanner scanner) {
        this.scanner = scanner;
    }

    public double requestClientAmount() {
        System.out.print("Write a initial balance: ");
        try {
            double balance = scanner.nextDouble();
            if (balance < 0) {
                throw new RuntimeException("The initial balance must be over zero!");
            }
            return balance;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error in input!");
        }
        return 0;
    }

    public String requestAccountNumber() {
        System.out.print("Write a AccountNumber: ");
        if (scanner.hasNext()) {
            return scanner.next();
        }
        return null;
    }

    @Override
    public AccountType requestAccountType() {
        System.out.println("Fixed account is 1");
        System.out.println("Saving account is 2");
        System.out.println("Checking account is 3");
        System.out.print("Write a number from 1 to 3: ");
        int res;
        try {
            res = scanner.nextInt();
            if (res >= 1 && res <= 3) {
                switch (res) {
                    case 1 -> {
                        return AccountType.FIXED;
                    }
                    case 2 -> {
                        return AccountType.SAVING;
                    }
                    case 3 -> {
                        return AccountType.CHECKING;
                    }
                }
            }
            throw new RuntimeException("The number must be in range from 1 to 3 inclusievely!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error in input!");
        }
        return AccountType.CHECKING;
    }
}
