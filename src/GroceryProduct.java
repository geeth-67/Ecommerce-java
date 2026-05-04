public class GroceryProduct extends Product {

    private String expiryDate;

    public GroceryProduct(String expiryDate, String name, double price, String seller, int stock) {

        super(name, price, seller, stock);

        this.expiryDate = expiryDate;
    }

    @Override
    String getCategory() {
        return "Grocery";
    }
}