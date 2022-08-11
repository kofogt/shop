package ecommerce;

import java.util.Scanner;

public class AddItemToCart {
    AddItemToCart(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many do you want to order?");
        int itemQuantity = scanner.nextInt();
        System.out.println("What is the item code?");
        String itemCode = scanner.nextLine();
    }
}
