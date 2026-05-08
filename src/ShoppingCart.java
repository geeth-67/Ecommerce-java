import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<CartItem> cartItems = new ArrayList<>();

    public boolean addCardItem(Product product , int quantity) {

        // check whether we have enough stock
        // check whether the product already exists in the cart

        if (!product.isInStock()) {
            System.out.println("Out of stock");
            return false;
        }

        if (quantity > product.getStockQuantity()) {
            System.out.println("Not enough stock available to full fill this order");
        }

        for ( CartItem item : cartItems) {
            if (item.getProduct().getProdId().equals(product.getProdId())) {
//                System.out.println("Product already exists in rhe shopping cart");
//                return false;
                item.setQuantity(item.getQuantity() + quantity);
                System.out.println("Successfully updated the quantity of the product");
                return true;
            }
        }
        cartItems.add(new CartItem(product , quantity));
        System.out.println("Successfully add the quantity of the product");
        return true;
    }

    public double getTotal() {
        double sum = 0;

        for (CartItem item : cartItems) {

            sum += item.getSubtotal();
        }
        return sum;
    }

    public void displayShoppingCart() {

        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty");

        }else {
            System.out.println("======= Shopping Cart ========");

            for ( CartItem item : cartItems) {
                System.out.println(
                        "product Name - " + item.getProduct().getProdName() + " | "
                        + "Quantity" + item.getQuantity() + " | " + item.getSubtotal());

            }
        }
    }
}