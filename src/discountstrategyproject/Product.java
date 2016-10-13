package discountstrategyproject;

public class Product {

    private String productName;
    private String productId;
    private double productRetailPrice;
    private double discountAmount;
    private double priceWithDiscount;
    private DiscountStrategy discount;

    public Product(String productName, String productId,
            double productRetailPrice, DiscountStrategy discount) {
        this.productName = productName;
        this.productId = productId;
        this.productRetailPrice = productRetailPrice;
        this.discount = discount;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        this.productName = productName;
    }

    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        this.productId = productId;
    }

    public final double getProductRetailPrice() {
        return productRetailPrice;
    }

    public final void setProductRetailPrice(double productRetailPrice) {
        this.productRetailPrice = productRetailPrice;
    }

    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", productId=" + productId + ", productRetailPrice=" + productRetailPrice + ", discountAmount=" + discountAmount + ", priceWithDiscount=" + priceWithDiscount + ", discount=" + discount + '}';
    }

    public final double getDiscountAmount(int qty) {
        return discountAmount = discount.getDiscountAmount(productRetailPrice, qty);
    }

    public final double getPriceWithDiscount() {
        return priceWithDiscount = productRetailPrice - discountAmount;
    }

}
