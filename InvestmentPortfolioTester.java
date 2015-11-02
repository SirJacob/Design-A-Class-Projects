import java.util.Scanner; //Import scanner

/**
 *
 * @author Cory
 */
public class InvestmentPortfolioTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //Set-up scanner
        System.out.print("Please enter the investor's name: ");
        String name = s.next(); //Get the next string the user enters and set name to it
        System.out.print("Please enter the investor's balance: ");
        int Balance = s.nextInt(); //get the next int the user enters and set the balance to it
        InvestmentPortfolio ip = new InvestmentPortfolio(name, Balance); //Create a new Investment Portfolio with given name and balance
        String welcomeMsg = "Welcome, " + ip.getOwner() + "! You have " + ip.getBalance() + " in your account."; //Display welcome message with the given name and balance
        //This makes the output easier to read (lines 21-25)
		String equals = "";
        for (int i = 0; i < welcomeMsg.length(); i++) {
            equals += "=";
        }
        System.out.println(equals);
        int option = 0;
        while (option != 4) {
            System.out.println("1) Invest\n2) Liquidate\n3) Get Account Info\n4) Exit"); //Show options
            System.out.print("Please enter a number option: "); //Request number
            option = s.nextInt(); //Record response
			//Based on the response, complete the correlating task
            switch (option) {
                case 1:
                    System.out.print("Please enter the amount you would like to invest: ");
                    ip.investMore(s.nextInt()); //Invest amount supplied
                    break;
                case 2:
                    System.out.print("Please enter the amount you would like to liquidate: ");
                    ip.liquidateInvestment(s.nextInt()); //Liquidate amount supplied
                    break;
                case 3:
                    System.out.println("Owner: " + ip.getOwner() + ", Balance: " + ip.getBalance()); //Display account information
                    break;
            }
            System.out.println(equals); //This makes the output easier to read
        }
    }
}
