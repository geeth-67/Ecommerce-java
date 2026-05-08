import java.util.Map;

public class ProductFactory {

    public Product create(String category,
                          String name,
                          double price,
                          String seller,
                          int stock,
                          String expiryDate,
                          Map<String, String> extras) {

        return switch (category) {

            case "Electronic" -> new ElectricProduct(
                    extras.getOrDefault("brand", "Unknown"),
                    Integer.parseInt(extras.getOrDefault("warrantyPeriod", "12")),
                    name,
                    price,
                    seller,
                    stock
            );

            case "Clothing" -> new ClothingProduct(
                    Float.parseFloat(extras.getOrDefault("size", "0")),
                    extras.getOrDefault("material", "Unknown"),
                    name,
                    price,
                    seller,
                    stock
            );

            case "Grocery" -> new GroceryProduct(
                    expiryDate,
                    name,
                    price,
                    seller,
                    stock
            );

            default -> throw new IllegalArgumentException("Unknown category");
        };
    }
}