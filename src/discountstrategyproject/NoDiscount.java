
package discountstrategyproject;

public class NoDiscount implements DiscountStrategy{
    private double discountRate = 0;
    private double discountAmount = 0;

    public NoDiscount(final double price, final int quantity) {
        discountAmount=(price*discountRate)*quantity;
    }
    
    
    
    @Override
    public final double getDiscountAmount() {
        return discountAmount = 0;
    }

    @Override
    public final double getDiscountRate() {
        return discountRate=0;    
    }

    @Override
    public final void setDiscountRate() {
    }
    
}
