import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Discountable> product = new ArrayList<>();

        ClothingProduct tShirt = new ClothingProduct(120 , "Cotton" ,"amal" , 200.00 , "kaml" , 20);
        ElectricProduct mic = new ElectricProduct("Sony", 12, "Mic", 150.00, "Kamal", 10);
        GroceryProduct lifeBouy = new GroceryProduct("2026-12-31", "LifeBouy", 200.00, "Kamal", 20);

        product.add(tShirt);
        product.add(lifeBouy);
        //product.add(mic);
    }
}
