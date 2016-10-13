package discountstrategyproject;

import java.util.ArrayList;

public interface OutputStrategy {

    static String KOHLS_HEADING = "Kohl's Department Store";

    public abstract void outputHeader(String firstName, String lastName, String custId, int transactionNumber);

    public abstract void outputBody(ArrayList<LineItem> lineItems);

    public abstract void outputFooter(double totalBeforeTax, double tax,
            double totalAfterTax);

}
