package discountstrategyproject;

import java.util.ArrayList;
import java.util.Arrays;

public class Receipt {

    private OutputStrategy output;
    private Customer customer;
    private PersistenceStrategy db;
    private int transactionNumber = 1;
    private double runningTotal;
    private final double salesTax = 0.056;
    private double totalWithTax;
    private LineItem item;
//    LineItem[] lineItems = {};
    ArrayList<LineItem> lineItems = new ArrayList<LineItem>();

    public Receipt(String custId, PersistenceStrategy db) {
        this.db = db;
        this.customer = findCustomerById(custId);
        transactionNumber++;
    }

    public final Customer findCustomerById(String custId) {
        return db.findCustomerById(custId);
    }

    public final void addLineItem(String productId, int quantity) {
        item = new LineItem(db, productId, quantity);
        runningTotal = runningTotal + item.getProduct().getPriceWithDiscount();
        lineItems.add(new LineItem(item.getProduct().getProductName(),
                item.getProduct().getProductId(),
                item.getProduct().getProductRetailPrice(),
                item.getProduct().getPriceWithDiscount(),
                quantity));
//        LineItem[] temp = {new LineItem(tempName, tempId, tempRetailPrice, tempDiscountedPrice, quantity)};
//        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
//        temp[temp.length-1]=item;
//        lineItems[]=temp[];
//        temp[] = null;

    }

    public void outputReceipt(OutputStrategy output) {
        this.output = output;
        output.outputHeader(customer.getFirstName(), customer.getLastName(),
                customer.getCustId(), transactionNumber);
        totalWithTax = (runningTotal * salesTax) + runningTotal;
        output.outputBody(lineItems);
        double tax = salesTax*runningTotal;
        output.outputFooter(runningTotal, tax, totalWithTax);
    }
}
/*
The following code was intended to create an array of line items.
It needs to be fixed in order for it to work.
(not exactly sure how to fix it at the moment)
 */
//        LineItem [] temp = {
//            new LineItem(item.getProduct().getProductName(),
//            item.getProduct().getProductId(),
//            item.getProduct().getProductRetailPrice(), (int) item.getProduct().getDiscountAmount(quantity))
//        };
//        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
//        temp[temp.length-1]=item;
//        lineItems[]=temp[];
//        temp[] = null;
