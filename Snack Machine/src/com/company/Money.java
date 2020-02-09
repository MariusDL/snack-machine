package com.company;

public class Money {

    static int five = 20;
    static int ten = 20;
    static int twenty = 20;
    static int fifty = 20;
    static int pound = 10;

    static double totalMoney = (five * 0.05) + (ten * 0.10) + (twenty * 0.20) + (fifty * 0.50) + (pound * 1);

    public static void printMoney(){
        System.out.println("£0.05 coins: " + five);
        System.out.println("£0.10 coins: " + ten);
        System.out.println("£0.20 coins: " + twenty);
        System.out.println("£0.50 coins: " + fifty);
        System.out.println("£0.1 coins: " + pound);

        System.out.println(" Total money in the machine: £" + totalMoney);



    }
}
