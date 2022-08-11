package ecommerce;

import java.util.HashMap;
import java.util.Scanner;

public class Products {
    HashMap<String, Double> products = new HashMap<>();
  private  String productName;
    private   double productPrice;
   private  int  numOfItems;
    Products(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name: ");
        productName = scanner.nextLine();
        System.out.println("Enter the product price: ");
        productPrice = scanner.nextDouble();
        nameAndPrice();
        
    }
 public HashMap  nameAndPrice(){
    products.put(this.productName, this.productPrice);
     numOfItems ++;
        return products;
 }
public checkOut(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Do you want to check out? (y/n)");
   String  answer = scanner.nextLine();
  if((answer.equals("y")) |  (answer.equals("Y"))){
      Sales.calculateTotal();
  }
}
}
