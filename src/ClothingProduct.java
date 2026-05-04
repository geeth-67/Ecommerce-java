public class ClothingProduct extends Product {

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
}