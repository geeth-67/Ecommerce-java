public class ClothingProduct extends Product implements Discountable{

    private float size;
    private String material;

    public ClothingProduct(float size, String material, String name, double price, String seller, int stock) {

        super(name, price, seller, stock);

        this.size = size;
        this.material = material;
    }

    @Override
    String getCategory() {
        return "Clothing";
    }

    public float getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public double getDiscountedPrice(int discountPercentage) {

        double discount  = getProdPrice() * (discountPercentage / 100.00);

        return getProdPrice() - discount;
    }
}