package Entities;
import Exceptions.InsufficientBalance;
import Exceptions.InvalidSelection;
import enums.Products;
import Exceptions.InvalidCoin;
import java.util.Scanner;

public class VendingMachinee {
    private int balance;

    public VendingMachinee() {

        this.balance = 0;
    }
    public void InsertingCoins() throws InvalidCoin {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello ! , Please Insert a coin 1/2 DH , 1 DH, 2 DH, 5 DH, 10 DH");
        double coin = scanner.nextDouble();
        if(coin == 0.5 || coin == 1.0 || coin == 2.0 || coin == 5.0 || coin == 10.0){
            balance += coin;
        }
        else {
            throw new InvalidCoin("Invalid coin ,Please enter a valid coin !");
        }
    }
    public void selectProduct() throws InsufficientBalance,InvalidSelection {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select one of this 5 products :");
        System.out.println("1.MIRENDINA (7 DH)");
        System.out.println("2.TANGO (2 DH)");
        System.out.println("3.KITKAT (4 DH)");
        System.out.println("4.SNICKERS (8 DH)");
        System.out.println("5.MILKA (10 DH)");
        int selection = scanner.nextInt();
        Products product = getProduct(selection);
        if(product!=null){
            if(balance >= product.getPrice()){
                System.out.println("Distribution of" + product.name());
                double change = balance - product.getPrice();
                if(change > 0){
                    System.out.println("returning change : "+ change + "DH");
                }
                balance = 0;
            }
            else{
                throw new InsufficientBalance("Please insert more coins!");
            }
        }
        else{
            throw new InvalidSelection("Please select a valid product !");
        }
    }
    private Products getProduct(int selection){
        switch (selection){
            case 1:
                return Products.MIRENDINA;
            case 2:
                return Products.TANGO;
            case 3:
                return Products.KITKAT;
            case 4:
                return Products.SNICKERS;
            case 5:
                return Products.MILKA;
            default:
                return null;
        }
        }
    public void reset(){
        balance=0;
        System.out.println("Vending Machine has been reset.");
    }
    }
