import java.util.Random; //Import random

/**
 *
 * @author Cory
 */
public class InvestmentPortfolio {

    private String owner = "";
    private int balance = 0;
	//Gets owner and balance and sets the values above to them
    public InvestmentPortfolio(String Owner, int Balance) {
        owner = Owner;
        balance = Balance;
    }

    public void investMore(int money) {
		//You have a 1/3 chance of: Investing normally, having your investment fail, or getting an insider tip.
        Random r = new Random(); //Set-up random
        int random = r.nextInt(3) + 1;  //Get a random number 1, 2, or 3
        switch (random) {
            case 1: //Failed investment
                balance += money;
                System.out.println("You invested your money, but it turned out bad!");
                failedInvestment();
                break;
            case 2: //Insider tip
                balance += money;
                System.out.println("You invested your money with help from an insider tip!");
                insiderTip();
                break;
            case 3: //Normal investment
                balance += money;
                System.out.println("You invested your money!");
                break;
        }
    }

    public void liquidateInvestment(int money) {
		//Prevents you from liquidating more money than you have in your balance
        if (money > balance) {
            System.out.println("You can't liquidate more money than you have!");
        } else {
            balance -= money; //removes given value amount from your balance
        }
    }

    public void insiderTip() {
        balance *= 3; //When called, triples the user's balance
    }

    public void failedInvestment() {
        balance = (int) (balance - (balance * .20)); //When called, removes 20% of the user's balance
    }

    public int getBalance() {
        return balance; //Returns the user's balance
    }

    public String getOwner() {
        return owner; //Returns the user's name
    }
}
