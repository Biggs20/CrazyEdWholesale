package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Welcome to Crazy Ed's Wholesale String Cheese");
        System.out.println("                  MENU            ");
        System.out.println("\t-----------------------------------");
        System.out.println("\t** 1 ** 1 inch Cheese = $2 per yard");
        System.out.println("\t** 2 ** 2 inch Cheese = $4 per yard");
        System.out.println("\t** 4 ** 4 inch Cheese = $6 per yard");
        System.out.println("\t-----------------------------------");

        System.out.println("What size cheese would you like to order? ");
        int cheeseSize = input.nextInt();
        System.out.println("How many yards would you like to order? ");
        int yardSize = input.nextInt();

        switch (cheeseSize)
        {
            case 1:
                System.out.println("Your total order price is: $" + cheese1Cost(cheeseSize, yardSize));
                break;
            case 2:
                System.out.println("Your total order price is: $" + cheese2Cost(cheeseSize, yardSize));
                break;
            case 4:
                System.out.println("Your total order price is: $" + cheese3Cost(cheeseSize, yardSize));
                break;
            default:
                System.out.println("The order is too crazy, please choose another order");
        }

    }

    private static double cheese1Cost(int cheeseSize, int yardSize)
    {
        double standardCost = yardSize * 2;
        double handlingCharge = 5.00;
        double shippingCost = 2;

        if (yardSize >= 50)
        {
            shippingCost = 0;
        }
        else
        {
            shippingCost = 2;
        }
        double totalCost = (standardCost + handlingCharge + shippingCost);

        return totalCost;
    }

    private static double cheese2Cost(int cheeseSize, int yardSize)
    {
        double standardCost = yardSize * 4;
        double handlingCharge = 5.00;
        double shippingCost = 2;

        if (yardSize >= 75)
        {
            shippingCost = 0;
        }
        else
        {
            shippingCost = 2;
        }
        double totalCost = (standardCost + handlingCharge + shippingCost);

        return totalCost;
    }

    private static double cheese3Cost(int cheeseSize, int yardSize)
    {
        double standardCost = yardSize * 6;
        double handlingCharge = 5.00;
        double shippingCost = 2;

        if (yardSize >= 25)
        {
            shippingCost = 0;
        }
        else
        {
            shippingCost = 2;
        }
        double totalCost = (standardCost + handlingCharge + shippingCost);

        return totalCost;
    }


}
