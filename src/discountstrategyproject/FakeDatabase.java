
package discountstrategyproject;

public class FakeDatabase implements PersistenceStrategy {
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
                System.out.println(customer.toString());
                break;
            }
        }
        return null;
    }
    
    /*(Discount explanation)
    Dress shirt, buy 5, get 30% off
    Womens Pants automatically 10% off
    Snack automatically 5% off
    Belt, buy 1 get 2nd half off
    */    
    Product [] products = {
        new Product ("Watch","P1000",39.99, new NoDiscount()),
        new Product ("Dress Shirt","P1001",19.99, new QuantityDiscount(19.99, 5, 0.30)),
        new Product ("Womens Pants","P1050",49.99, new PercentDiscount(49.99, 0.10)),
        new Product ("Snacks","P3500",6.99, new PercentDiscount(6.99, 0.05)),
        new Product ("Belt","P1556",15.99, new QuantityDiscount(15.99, 2, 0.50)),
    };
    
    public final Product findProductById(String productId){
        Product product = null;
        for (Product p: products){
            if (productId.equals(p.getProductId())){
                product = p;
                product.toString();
                break;
            }
        }
        return null;
    }
}
