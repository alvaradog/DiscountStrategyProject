package discountstrategyproject;

import java.util.ArrayList;

public class ConsoleOutput implements OutputStrategy {

    @Override
    public final void outputHeader(String firstName, String lastName, String custId, int transactionNumber) {
        System.out.println(String.format("%-10s", KOHLS_HEADING)
                + "\n\n\n" + firstName + " " + lastName + "\n"
                + "Customer ID: " + custId + "\n" + "Transaction Number : " + transactionNumber);
    }

    @Override
    public final void outputBody(ArrayList<LineItem> lineItems) {
        System.out.println("\nProduct Name    ProductID  Price   QTY Discounted Price");
        for (LineItem i: lineItems){
            System.out.printf(i.getProduct().getProductName()+"\t"+
                    i.getProduct().getProductId()+"\t"+
                    i.getProduct().getProductRetailPrice()+"\t"+
                    i.getQty()+ "\t"+
                    "%.2f\n",i.getProduct().getPriceWithDiscount());
        };
    }    

    @Override
    public final void outputFooter(double totalBeforeTax, double tax, double totalAfterTax) {
        System.out.println("");
        System.out.printf("Total: $%.2f\n" ,totalBeforeTax);
        System.out.printf("Tax: $%.2f\n" ,tax);
        System.out.printf("Total with Tax: $%.2f\n" ,totalAfterTax);
    }
}
