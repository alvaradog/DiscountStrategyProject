
package discountstrategyproject;

public class QuantityDiscount implements DiscountStrategy{
    private double discountRate = 0.15;
    private double discountAmount= 0;

    public QuantityDiscount(final double price, final int quantity) {
        if (quantity >= 5 ){
            discountRate=0.15;
            discountAmount=(price*discountRate)*quantity;
        } else{
            discountRate=0;
            discountAmount=(price*discountRate)*quantity;
        }
    }
    @Override
    public double getDiscountAmount() {
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
