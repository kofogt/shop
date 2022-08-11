public class Sales extends Discount {
double discount = Discount.discountAssigned();
    public Sales(String firstName, String lastName, String email, double quantity, String item) {
        super(firstName, lastName, email, quantity, item);

    }
    public double itemCost(String item) {
        item = Customer.getItem() ;
        double cost =0;
        switch (item) {
            case "bible":
               cost += (discount * 95.0* Customer.getQuantity());
               return cost;
            case "rivers":
                cost += (discount * 90.0* Customer.getQuantity());
                return cost;
            default:
                    System.out.println("Did not find the book");
                    return cost;
        }

    }
}
