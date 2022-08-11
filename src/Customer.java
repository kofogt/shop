import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName, lastName,email;
         static String  item;
    private static double quantity;
    private List<Customer> customers = new ArrayList<Customer>();
    public Customer(String firstName, String lastName, String email, double quantity, String item) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.quantity = quantity;
        this.item = item;
    }

    public static double getQuantity() {
        return quantity;
    }

    public static String getItem() {
        return item;
    }

}
