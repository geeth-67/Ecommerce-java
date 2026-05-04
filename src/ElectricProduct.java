public class ElectricProduct extends Product {

    private String brand;
    private int warrantyPeriod;

    public ElectricProduct(String brand, int warrantyPeriod, String name, double price, String seller, int stock) {

        super(name, price, seller, stock);

        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    String getCategory() {
        return "Electronic";
    }
}