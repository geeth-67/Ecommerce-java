public class CartItem {

    Product product;  // Composition - has a relation , two classes are tightly coupled
    int quantity;

    public CartItem(Product product , int quantity) {

        this.product = product;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return product.getProdPrice() * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}