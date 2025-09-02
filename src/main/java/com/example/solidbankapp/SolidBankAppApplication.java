package com.example.solidbankapp;

import com.example.solidbankapp.core.BankCore;
import com.example.solidbankapp.data.AccountDAO;
import com.example.solidbankapp.data.MemoryAccountDAO;
import com.example.solidbankapp.service.AccountCreationService;
import com.example.solidbankapp.service.AccountCreationServiceImpl;
import com.example.solidbankapp.service.AccountListingService;
import com.example.solidbankapp.service.AccountListingServiceImpl;
import com.example.solidbankapp.ui.AccountBasicCLI;
import com.example.solidbankapp.ui.MyCLI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


public class SolidBankAppApplication {
    private static final String help =
            """
                    Welcome to CLI bank service
                    Enter operation number:
                    1 - show accounts
                    2 - create account
                    3 - deposit
                    4 - withdraw
                    5 - transfer
                    6 - this message
                    7 - exit""";
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
        MyCLI myCLI = context.getBean("myCLI", MyCLI.class);
        String clientId = myCLI.requestAccountNumber();
        System.out.println(help);
        Scanner scanner = new Scanner(System.in);
        AccountDAO memoryAccountDAO = context.getBean("memoryAccountDAO", MemoryAccountDAO.class);
        AccountCreationService accountCreationService =
                context.getBean("accountCreationService", AccountCreationServiceImpl.class);
        BankCore bankCore = context.getBean("bankCore", BankCore.class);
        AccountListingService accountListingService =
                context.getBean("accountListingService", AccountListingServiceImpl.class);
        AccountBasicCLI accountBasicCLI = context.getBean("accountBasicCLI", AccountBasicCLI.class);
        while (scanner.hasNext()) {
            switch (scanner.next()) {
                case "1" -> accountBasicCLI.getAccounts(clientId);
                case "2" -> accountBasicCLI.createAccountRequest(clientId);
                case "6" -> System.out.println(help);
                case "7" -> System.exit(0);
                default -> System.out.println("Wrong operation number");
            }
        }

    }

}
