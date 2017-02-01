package PickPocketATM;
import java.util.Scanner;


public class MainMethod {

    /**
     * @param args
     */
    public static void main(String args[]) {


        Scanner userInput = new Scanner(System.in);
        welcomeMessage custObject = new welcomeMessage();

        System.out.print("Please enter your name...");
        String CstName = userInput.nextLine();

        custObject.welcome(CstName);



        Scanner cstPin = new Scanner(System.in);
        System.out.println("Please enter your P.I.N.");
        int custPinNumber = cstPin.nextInt();

        while (custPinNumber != 2020) {

            System.out.println("You have entered an invalid number...Please try again");
            System.out.println("Please enter your P.I.N.");
            custPinNumber = cstPin.nextInt();
        }
        if (custPinNumber == 2020) {
            System.out.println("Thank you...Please select the type of account to be accessed>>>");
            System.out.println("1: Savings");
            System.out.println("2: Checking");
            System.out.println("3: Exit System");
            System.out.println(" ");

            Scanner acSelect = new Scanner(System.in);

            switch (acSelect.nextInt()) {


                case 1:

                    System.out.println("Savings account initiated");
                    break;

                case 2:

                    System.out.println("Checking account initiated");
                    break;

                case 3:
                    System.out.println("Thank you for your business...Have a nice day");
                    System.exit(0);

                default:
                    System.out.println("Invalid option");

            }

            System.out.println("Please sellect your transaction option");
            System.out.println(" ");
            System.out.println("1: Depost");
            System.out.println(" ");
            System.out.println("2: Withdraw");
            System.out.println(" ");
            System.out.println("3: Balance Inquiry");
            System.out.println(" ");
            System.out.println("4: Exit System");

            Scanner option = new Scanner(System.in);
            System.out.println("Please sellect an option");
            switch (option.nextInt()) {

                case 1:

                    System.out.println("You have selected the DEPOSIT option");
                    depositTransaction dpObject = new depositTransaction();
                    System.out.print("Please enter your required amount...");
                    int lodgeAmount = userInput.nextInt();
                    dpObject.deposit(lodgeAmount);
                    break;

                case 2:

                    System.out.println("You have selected the WITHDRAW  option");
                    withdrawTransaction wdObject = new withdrawTransaction();
                    System.out.println("Please enter the withdraw amount");
                    int withdrawlAmount = userInput.nextInt();
                    wdObject.withdraw(withdrawlAmount);
                    break;

                case 3:
                    System.out.println("You have selected the BALANCE INQUIRY option");
                    balanceInquiry balObject = new balanceInquiry();
                    double moneyCheck = balObject.Inquiry();

                    break;

                case 4:
                    System.exit(0);



                default:
                    System.out.println("Invalid option");


            }

        }


    }

}