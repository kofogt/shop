public class Discount extends Customer {

    public Discount(String firstName, String lastName, String email, double quantity, String item) {
        super(firstName,
                lastName,
                email,
                quantity,
                item);
        discountAssigned();
    }
    public static double discountAssigned(){
        double discountPercentage = 0;
       if (Customer.getQuantity() >15){
           discountPercentage+=0.1;
           return  discountPercentage* Customer.getQuantity();
       }
       else{
           discountPercentage += 0.01;
           return  discountPercentage* Customer.getQuantity();
       }
    }
}
