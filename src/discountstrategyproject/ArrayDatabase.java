
package discountstrategyproject;

public class ArrayDatabase implements PersistenceStrategy {
    Customer [] customers = {
        new Customer ("Joe","Smith","C100"),
        new Customer ("Samantha","Davis","C101"),
        new Customer ("Anna","Jacobsen","C102"),
        new Customer ("Gerardo", "Alvarado", "C103")
    };
    
    @Override
    public final Customer findCustomerById(String custId){
        Customer customer = null;
        for (Customer c: customers){
            if (custId.equals(c.getCustId())){
                customer = c;
                /*
                The code commented out below, will just print out the info for
                the customer who id matches the startup customer id
                */
//                customer.toString();
                break;
            }
        }
        return customer;
    }
    
    /*(Discount explanation)
    Dress shirt, buy 5, get 30% off
    Womens Pants automatically 10% off
    Snack automatically 5% off
    Belt, buy 1 get 2nd half off
    */    
    Product [] products = {
        new Product ("Watch","P1000",39.99, new NoDiscount()),
        new Product ("Dress Shirt","P1001",19.99, new QuantityDiscount(5, .1)),
        new Product ("Womens Pants","P1050",49.99, new PercentDiscount(.2)),
        new Product ("Snacks","P3500",6.99, new PercentDiscount(.15)),
        new Product ("Belt","P1556",15.99, new QuantityDiscount(2, 0.50)),
    };
    
    @Override
    public final Product findProductById(String productId){
        Product product = null;
        for (Product p: products){
            if (productId.equals(p.getProductId())){
                product = p;
                /*
                The code commented out below, will just print out the info for
                the product who id matches the startup product id
                */
//                product.toString();
                break;
            }
        }
        return product;
    }
}
