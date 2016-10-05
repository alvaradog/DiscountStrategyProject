
package discountstrategyproject;

public interface PersistenceStrategy {

    Customer findCustomerById(String custId);
    Product findProductById(String productId);
    
}
