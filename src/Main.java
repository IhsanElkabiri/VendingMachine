import Entities.VendingMachinee;
import Exceptions.InsufficientBalance;
import Exceptions.InvalidCoin;
import Exceptions.InvalidSelection;

public class Main {
    public static void main(String[] args) throws InvalidCoin, InsufficientBalance, InvalidSelection {
        VendingMachinee vendingMachinee = new VendingMachinee();
        vendingMachinee.InsertingCoins();
        vendingMachinee.selectProduct();


    }

}