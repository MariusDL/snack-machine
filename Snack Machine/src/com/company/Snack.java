package com.company;

import java.util.Scanner;

public class Snack {

    Scanner scanner = new Scanner(System.in);
    private String name;
    private double price;
    private int quantity;
    private double totalPrice;
    int enteredQuantity;

    public Snack(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void dispenseSnack(){
        System.out.println("You have chosen to buy " + this.name);
       checkquantity();
       enterMoney();




    }

    private void enterMoney(){

        double totalEnterdCoins = 0;
        System.out.println("You can enter only £0.05, £0.10, £0.20, £0.50, £1 coins");
        System.out.println("Please enter coins one by one: ");
        do {



            double enteredCoin = scanner.nextDouble();
            if(enteredCoin == 0.05 || enteredCoin ==0.10 || enteredCoin == 0.20 || enteredCoin == 0.50
            || enteredCoin == 1){
                totalEnterdCoins += enteredCoin; // adds the entered coin to the total sum
                addCoinsToMoney(enteredCoin); // add the entered coin to the money stash
                if(totalEnterdCoins<totalPrice) {
                    System.out.println("You have inserted a total of: £" + totalEnterdCoins);
                    System.out.println("You have to insert: £" + (totalPrice - totalEnterdCoins) + " more");
                    System.out.println("Insert coin:");
                }
            } else {
                System.out.println("Invalid coin entered");
            }

        } while (totalEnterdCoins < totalPrice);

        if(totalEnterdCoins > totalPrice){
            double change = totalEnterdCoins - totalPrice;
            System.out.println("Your change is: £" + change);
            dispenseChange(change);   //dispense the change
            this.quantity-=enteredQuantity; //dispense the snack
            System.out.println("Thank you!");

        }


    }

    private void checkquantity(){
        System.out.println("Please enter quantity: ");
         enteredQuantity = scanner.nextInt();

        while(enteredQuantity> this.quantity){
            System.out.println("Quantity entered is too big.");
            enteredQuantity = scanner.nextInt();
        }
        this.totalPrice = enteredQuantity*this.price;
        System.out.println("Total price is: " + totalPrice);
    }

    public void addCoinsToMoney(double coin){
        if(coin == 0.05) {
            Money.five++;
        }
        if(coin == 0.10) {
            Money.ten++;
        }
        if(coin == 0.20) {
            Money.twenty++;
        }
        if(coin == 0.50) {
            Money.fifty++;
        }
        if(coin == 1) {
            Money.pound++;
        }

    }

    public void dispenseChange(double change){
        if(change == 0.05){
            Money.five--;
        }
        if(change == 0.10){
            Money.ten--;
        }
        if(change == 0.15){
            Money.ten--;
            Money.five--;
        }
        if(change == 0.20){
            Money.twenty--;
        }
        if(change == 0.25){
            Money.twenty--;
            Money.five--;
        }
        if(change == 0.30){
            Money.twenty--;
            Money.ten--;
        }
        if(change == 0.35){
            Money.twenty--;
            Money.ten--;
            Money.five--;
        }
        if(change == 0.40){
            Money.twenty--;
            Money.twenty--;
        }
        if(change == 0.45){
            Money.twenty--;
            Money.twenty--;
            Money.five--;
        }
        if(change == 0.50){
            Money.fifty--;
        }
        if(change == 0.55){
            Money.fifty--;
            Money.five--;
        }
        if(change == 0.60){
            Money.fifty--;
            Money.ten--;
        }
        if(change == 0.65){
            Money.fifty--;
            Money.ten--;
            Money.five--;
        }
        if(change == 0.70){
            Money.fifty--;
            Money.twenty--;
        }
        if(change == 0.75){
            Money.fifty--;
            Money.twenty--;
            Money.five--;
        }
        if(change == 0.80){
            Money.fifty--;
            Money.twenty--;
            Money.ten--;
        }
        if(change == 0.85){
            Money.fifty--;
            Money.twenty--;
            Money.ten--;
            Money.five--;
        }
        if(change == 0.90) {
            Money.fifty--;
            Money.twenty--;
            Money.twenty--;
        }
        if(change == 0.95) {
            Money.fifty--;
            Money.twenty--;
            Money.twenty--;
            Money.five--;
        }

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
