
package discountstrategyproject;

public interface PersistenceStrategy {

    public abstract Customer findCustomerById(String custId);
    public abstract Product findProductById(String productId);
    
}
