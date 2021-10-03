package Tutorial3.Qn1;

public class VendingMachineApp {
    public static void main(String args[]){
        double drinkCost;
        double amountInserted;
        VendingMachine vM = new VendingMachine();
        drinkCost = vM.selectDrink();
        amountInserted = vM.insertCoins(drinkCost);
        vM.checkChange(amountInserted, drinkCost);
        vM.printReceipt();
    }
}
