package CZ2002.Tutorial3.Qn1;

import java.util.Scanner;

public class VendingMachine {
    Drinks[] drinks;
    double drinkCost = 0.0;
    int drinkSelection = 0;

    public VendingMachine(){
        drinks = new Drinks[3];
        drinks[0] = new Drinks("Beer", 3.00);
        drinks[1] = new Drinks("Coke", 1.00);
        drinks[2] = new Drinks("Green Tea", 2.70);
    }
    public double selectDrink(){
        Scanner sc = new Scanner(System.in);
        int drinkChoice;
        double drinkPrice = 0.0;
        System.out.println("====== Vending Machine ======");
        for(int i=0; i < drinks.length; i++){
            System.out.println("|" + (i+1) + "Buy" + drinks[i].getName()
            + String.format("  %.2f  ", drinks[i].getCost()) + "  |"
            );
        }
        System.out.println("|============================\n");
        do{
            drinkChoice = sc.nextInt();
        }while(drinkChoice<1 || drinkChoice>3);

        drinkPrice = drinks[drinkChoice-1].getCost();
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
                    System.out.printf("Current amount is $%.2f", amount);
                    break;
                case 't':
                case 'T':
                    amount += 0.20;
                    System.out.printf("Current amount is $%.2f", amount);
                    break;
                case 'f':
                case 'F':
                    amount +=  0.50;
                    System.out.printf("Current amount is $%.2f", amount);
                    break;
                case 'n':
                case 'N':
                    amount += 1.00;
                    System.out.printf("Current amount is $%.2f", amount);
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
    public void start(){
        boolean end = false;
        do {
            double amountInserted;
            drinkCost = selectDrink();
            amountInserted = insertCoins(drinkCost);
            checkChange(amountInserted, drinkCost);
            printReceipt();
        }while(!end);
    }
}
