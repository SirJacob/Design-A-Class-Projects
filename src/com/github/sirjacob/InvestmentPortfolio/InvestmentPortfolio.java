/*
 * The MIT License
 *
 * Copyright 2015 https://github.com/SirJacob
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.sirjacob.InvestmentPortfolio;

import java.util.Random;

/**
 *
 * @author https://github.com/SirJacob
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
