package ecommerce;

import Store.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewCustomer {
    private String firstName, lastName,email;
    static String  item;
    private static double quantity;
    private List<Customer> customers = new ArrayList<Customer>();
    public NewCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        lastName = scanner.nextLine();
        System.out.println("Enter your email: ");
       email = scanner.nextLine();
    }

}
