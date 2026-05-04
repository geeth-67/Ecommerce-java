public abstract class Product {

    private String prodId;
    private String prodName;
    private double prodPrice;
    private double prodRating;
    private int stockQuantity;
    private String seller;


    public Product (String prodName , double prodPrice , String seller , int stockQuantity) {

        this.prodId = "DRZ" + prodName + prodPrice;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
        this.seller = seller;
        this.stockQuantity =stockQuantity;
        this.prodRating = 0;
    }

    public boolean isInStock() {

        return this.stockQuantity > 0 ;
    }

    public void reduceQuantity(int quantity) {

        if(quantity <= this.stockQuantity) {

            stockQuantity -= quantity;
        }
    }

    abstract String getCategory();


    //------------------getters--------------------------

    public String getProdId() {
        return prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public double getProdRating() {
        return prodRating;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getSeller() {
        return seller;
    }

    //------------------setters--------------------------

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public void setProdRating(double prodRating) {
        this.prodRating = prodRating;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
}
