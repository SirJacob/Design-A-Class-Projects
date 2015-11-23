package space.mygeek.dac.ip;

import java.util.Random;

/**
 *
 * @author Cory
 */
public class InvestmentPortfolio {

    private String owner = "";
    private int balance = 0;

    public InvestmentPortfolio(String Owner, int Balance) {
        owner = Owner;
        balance = Balance;
    }

    public void investMore(int money) {
        Random r = new Random();
        int random = r.nextInt(3) + 1;
        switch (random) {
            case 1:
                balance += money;
                System.out.println("You invested your money, but it turned out bad!");
                failedInvestment();
                break;
            case 2:
                balance += money;
                System.out.println("You invested your money with help from an insider tip!");
                insiderTip();
                break;
            case 3:
                balance += money;
                System.out.println("You invested your money!");
                break;
        }
    }

    public void liquidateInvestment(int money) {
        if (money > balance) {
            System.out.println("You can't liquidate more money than you have!");
        } else {
            balance -= money;
        }
    }

    public void insiderTip() {
        balance *= 3;
    }

    public void failedInvestment() {
        balance = (int) (balance - (balance * .20));
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}
