public class ElectricProduct extends Product implements Returnable{

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

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public int getReturnWindow() {
        return 30;
    }

    @Override
    public boolean isReturnEligible() {

        if (getReturnWindow() > getReturnWindow()) {
            return false;
        }
        return true;
    }
}