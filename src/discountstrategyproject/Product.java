
package discountstrategyproject;

public class Product {
    private String productName;
    private String productId;
    private double productRetailPrice;
    private double discountAmount=0;
    DiscountStrategy discount;
    

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
    
    public final double getDiscountAmount(){
        return discountAmount = discount.getDiscountAmount();        
    }
}
