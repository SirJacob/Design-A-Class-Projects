package com.github.sirjacob.InvestmentPortfolio;

import java.util.Scanner;

/**
 *
 * @author https://github.com/SirJacob
 */
public class InvestmentPortfolioTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the investor's name: ");
        String name = s.next();
        System.out.print("Please enter the investor's balance: ");
        int Balance = s.nextInt();
        InvestmentPortfolio ip = new InvestmentPortfolio(name, Balance);
        String welcomeMsg = "Welcome, " + ip.getOwner() + "! You have " + ip.getBalance() + " in your account.";
        String equals = "";
        for (int i = 0; i < welcomeMsg.length(); i++) {
            equals += "=";
        }
        System.out.println(equals);
        int option = 0;
        while (option != 4) {
            System.out.println("1) Invest\n2) Liquidate\n3) Get Account Info\n4) Exit");
            System.out.print("Please enter a number option: ");
            option = s.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Please enter the amount you would like to invest: ");
                    ip.investMore(s.nextInt());
                    break;
                case 2:
                    System.out.print("Please enter the amount you would like to liquidate: ");
                    ip.liquidateInvestment(s.nextInt());
                    break;
                case 3:
                    System.out.println("Owner: " + ip.getOwner() + ", Balance: " + ip.getBalance());
                    break;
            }

            System.out.println(equals);
        }
    }
}
