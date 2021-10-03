package Tutorial3.Qn1;

import java.util.Scanner;

public class VendingMachine {
    public VendingMachine(){

    }
    public double selectDrink(){
        Scanner sc = new Scanner(System.in);
        int drinkChoice;
        double drinkPrice = 0.0;
        System.out.println("====== Vending Machine ====== \r\n"
        + "|1. Buy Beer ($3.00) \t| \r\n"
        + "|2. Buy Coke ($1.00) \t| \r\n"
        + "|3. Buy Green Tea ($5.00) | \r\n"
        + "|============================ \r\n"
        + "Please enter selection: ");
        do{
            drinkChoice = sc.nextInt();
        }while(drinkChoice<1 || drinkChoice>3);

        switch(drinkChoice){
            case 1:
                drinkPrice = 3.00;
                break;
            case 2:
                drinkPrice = 1.00;
                break;
            case 3:
                drinkPrice = 5.00;
                break;
        }
        return drinkPrice;
    }
    public double insertCoins(double drinkCost){
        double amount = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert coins:"
        + "========== Coins Input =========== \n"
        + "|Enter 'Q' for ten cents input | \n"
        +"|Enter 'T' for twenty cents input| \n"
        + "|Enter 'F' for fifty cents input | \n"
        + "|Enter 'N' for a dollar input | \n"
        + "================================== \n");
        do{
            char coinSelect = sc.next().charAt(0);
            switch(coinSelect){
                case 'q':
                case 'Q':
                    amount += 0.10;
                    break;
                case 't':
                case 'T':
                    amount += 0.20;
                    break;
                case 'f':
                case 'F':
                    amount +=  0.50;
                    break;
                case 'n':
                case 'N':
                    amount += 1.00;
                    break;
            }
            System.out.printf("Coins inserted: %.2f \n", amount);
    }while(amount < drinkCost);
    return amount;
    }

    public void checkChange(double amount, double drinkCost){
        double change = amount - drinkCost;
        System.out.printf("Change : $%.2f \n", change);
    }
    public void printReceipt(){
        System.out.println("Please collect your drink \n"
        + "Thank you !!");
    }
}
