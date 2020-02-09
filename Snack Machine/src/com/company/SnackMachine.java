package com.company;

import java.util.Scanner;

public class SnackMachine {

    static Scanner scanner = new Scanner(System.in);

    Snack crisps = new Snack("Crisps", 0.75,10);
    Snack marsBar = new Snack("Mars Bar", 0.70, 10);
    Snack cola = new Snack("Coca Cola zero", 1,10);
    Snack eugenia = new Snack("Eugenia", 0.50,10);
    Snack water = new Snack("Water", 0.85,10);

    public SnackMachine(){


    }



    public void mainMenu(){
        System.out.println("Welcome to healthy snack machine");
        System.out.println("     Snack         Price       Quantity");
        System.out.println("1. Crisps          £" + crisps.getPrice() + "           " + crisps.getQuantity());
        System.out.println("2. Mars Bar        £" + marsBar.getPrice() + "            " + marsBar.getQuantity());
        System.out.println("3. Coca Cola zero  £" + cola.getPrice() + "            " + cola.getQuantity());
        System.out.println("4. Eugenia         £" + eugenia.getPrice() + "            " + eugenia.getQuantity());
        System.out.println("5. Water           £" + water.getPrice() + "           " + water.getQuantity());
        System.out.println("Please enter an option: ");

        int option = scanner.nextInt();

        if(option == 10976){
            System.out.println("Enter password:");
            String password = scanner.next();
            if(password.equals("1234")){
                Money.printMoney();
            } else {
                System.out.println("Incorrect password");
            }
        }

        while(option == 1 || option == 2 || option == 3 || option == 4 || option == 5 || option ==6){
            switch (option){
                case 1:
                    crisps.dispenseSnack();
                    option = 0;
                    break;
                case 2:
                    marsBar.dispenseSnack();
                    option = 0;
                    break;
                case 3:
                    cola.dispenseSnack();
                    option = 0;
                    break;
                case 4:
                    eugenia.dispenseSnack();
                    option = 0;
                    break;
                case 5:
                    water.dispenseSnack();
                    option = 0;
                    break;
            }
        }

    }




}
