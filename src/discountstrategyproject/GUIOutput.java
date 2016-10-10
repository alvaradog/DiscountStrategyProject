
package discountstrategyproject;

import javax.swing.JOptionPane;

public class GUIOutput implements OutputStrategy{

    @Override
    public final void outputBody(LineItem item) {
        /*
        ADD CODE HERE THAT PRINTS EVERY LINEITEM
        */
    }

    @Override
    public final void outputFooter(double totalBeforeTax, double tax, double totalAfterTax) {
        JOptionPane.showMessageDialog(null, totalBeforeTax + "\n"
                 + tax + "\n" + totalAfterTax);
    }

    @Override
    public void outputHeader(String firstName, String lastName, String custId, int transactionNumber) {
        JOptionPane.showMessageDialog(null, firstName + " " + lastName + "\n"
        + "Customer ID: " + custId + "\n" + "Transaction Number : " + transactionNumber);
    }

    
}
