
package discountstrategyproject;

public class PercentDiscount implements DiscountStrategy{
    private double discountRate = 0.20;
    private double discountAmount;

    public PercentDiscount(final double price, final int quantity) {
        discountAmount=(price*discountRate)*quantity;
    }  
    

    @Override
    public final double getDiscountAmount() {
        return discountAmount;
    }

    @Override
    public final double getDiscountRate() {
       return discountRate;
    }

    @Override
    public final void setDiscountRate() {
        
    }
    
}
