
package discountstrategyproject;

public interface DiscountStrategy {
    
    public abstract double getDiscountAmount(double productRetailPrice, int qty);
    public abstract double getDiscountRate();
    public abstract void setDiscountRate();
    
}
