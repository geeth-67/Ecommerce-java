public class GroceryProduct extends Product implements Discountable{

    private String expiryDate;

    public GroceryProduct(String expiryDate, String name, double price, String seller, int stock) {

        super(name, price, seller, stock);

        this.expiryDate = expiryDate;
    }

    @Override
    String getCategory() {
        return "Grocery";
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public double getDiscountedPrice(int discountPercentage) {

        double discount  = getProdPrice() * (discountPercentage / 100.00);

        return getProdPrice() - discount;
    }
}