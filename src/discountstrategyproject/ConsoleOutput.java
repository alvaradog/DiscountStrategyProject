
package discountstrategyproject;

public class ConsoleOutput implements OutputStrategy {

    @Override
    public final void outputBody(LineItem item) {
        System.out.println(item+"\n");
    }

    @Override
    public final void outputFooter(double totalBeforeTax, double tax, double totalAfterTax) {
        System.out.println(totalBeforeTax+": \n" + tax + ": \n" 
                + totalAfterTax + ": ");
    }

    @Override
    public void outputHeader(String firstName, String lastName, String custId, int transactionNumber) {
        System.out.println(firstName + " " + lastName);
        System.out.println("Customer ID: " + custId);
        System.out.println("Transaction Number : " + transactionNumber);
    }
    
}
