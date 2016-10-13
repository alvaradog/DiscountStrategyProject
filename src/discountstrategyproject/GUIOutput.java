package discountstrategyproject;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GUIOutput implements OutputStrategy {

    @Override
    public void outputHeader(String firstName, String lastName, String custId, int transactionNumber) {

        JOptionPane.showMessageDialog(null, String.format("%-20s", KOHLS_HEADING)
                + "\n\n\n" + firstName + " " + lastName + "\n"
                + "Customer ID: " + custId + "\n" + "Transaction Number : " + transactionNumber);
    }

    @Override
    public void outputBody(ArrayList<LineItem> lineItems) {
        JOptionPane.showMessageDialog(null, LINE_ITEM_HEADER);
        for (LineItem i : lineItems) {
            JOptionPane.showMessageDialog(null, String.format(i.getProduct().getProductName()
            + i.getProduct().getProductId()+
                     i.getProduct().getProductRetailPrice()+
                    "%.2f\n",i.getProduct().getPriceWithDiscount()));
        };
        
//        for (LineItem i: lineItems){
//            JOptionPane.showMessageDialog(null, i.getProduct().getProductName()+"\t"+
//                    i.getProduct().getProductId()+"\t"+
//                    i.getProduct().getProductRetailPrice()+"\t"+
//                    i.getQty()+ "\t"+
//                    "%.2f\n",i.getProduct().getPriceWithDiscount());
//        };
    }

    @Override
    public final void outputFooter(double totalBeforeTax, double tax, double totalAfterTax) {
        JOptionPane.showMessageDialog(null, String.format("Total: $%.2f\nTax: $%.2f\nTotal with Tax: $%.2f\n", totalBeforeTax, tax, totalAfterTax));
    }

}
