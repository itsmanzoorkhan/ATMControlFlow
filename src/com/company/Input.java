package com.company;

/**
 * Created by nawazkhan on 11/16/16.
 */
public class Input {
    String name;
    String input;
    int amount;


    public void chooseName() throws Exception {
        System.out.println("Please enter your Name below:");

        name = Main.scanner.nextLine();
        if (name.isEmpty()) {
            throw new Exception("Invalid Name.");
        }
        System.out.println("Hello, " + name);
    }
    public void choosePrompt() throws Exception {
        System.out.println("Please Select an option from below:");

        System.out.println("1.Check my balance. 2.Withdraw Funds. 3.Cancel");

        input = Main.scanner.nextLine();
        if (input.equalsIgnoreCase("Check Balance") ||input.equalsIgnoreCase("1")) {
            System.out.println("Your Balance: $100");
        }


        else if (input.equalsIgnoreCase("cancel") ||input.equalsIgnoreCase("3")) {
            System.out.println("Thank you and please come again.");
        }

        else if (input.equalsIgnoreCase("Withdraw Funds") || input.equalsIgnoreCase("2")) {
            System.out.println("Please enter the amount you would like to withdraw.");
            amount = Main.scanner.nextInt();
            if (amount > 100) {
                throw new Exception("Insufficient Funds");
            }
            else if (amount < 100) {
                System.out.println("Available Remaining Balance: " + (100 - amount) + " Cash is dispensed below. Have a great day");
            }
        }

        else {
            throw new Exception("Invalid Option");
        }

        }

}
