package discountstrategyproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GUIOutput implements OutputStrategy {

    @Override
    public final void outputFooter(double totalBeforeTax, double tax, double totalAfterTax) {
        JOptionPane.showMessageDialog(null,String.format("Total: $%.2f\nTax: $%.2f\nTotal with Tax: $%.2f\n",totalBeforeTax,tax ,totalAfterTax));
    }

    @Override
    public void outputHeader(String firstName, String lastName, String custId, int transactionNumber) {

        JOptionPane.showMessageDialog(null, String.format("%-20s", KOHLS_HEADING)
                + "\n\n\n" + firstName + " " + lastName + "\n"
                + "Customer ID: " + custId + "\n" + "Transaction Number : " + transactionNumber);
    }

    @Override
    public void outputBody(ArrayList<LineItem> lineItems) {
        for (LineItem i: lineItems){
            JOptionPane.showMessageDialog(null, i);
        };
    }

}
