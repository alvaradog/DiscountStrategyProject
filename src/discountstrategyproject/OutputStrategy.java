
package discountstrategyproject;

public interface OutputStrategy{
    public abstract void outputHeader(String firstName, String lastName, String custId, int transactionNumber);
    public abstract void outputBody(LineItem item);
    public abstract void outputFooter(double totalBeforeTax, double tax,
            double totalAfterTax);
    
}
