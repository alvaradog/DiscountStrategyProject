
package discountstrategyproject;

public class StartUp {
    public static void main(String[] args) {
        PersistenceStrategy db= new FakeDatabase();
        Register register = new Register();
        OutputStrategy consoleOutput = new ConsoleOutput();
        OutputStrategy guiOutput = new GUIOutput();
        
        register.createNewPurchase("C103", db , consoleOutput);
//        register.addProductToPurchase("P1000",1);
//        register.addProductToPurchase("P1001",10);
//        register.addProductToPurchase("P1556", 2);
//        register.endPurchase();
    }
    
}
