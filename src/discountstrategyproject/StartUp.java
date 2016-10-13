package discountstrategyproject;

public class StartUp {

    public static void main(String[] args) {
        PersistenceStrategy db = new ArrayDatabase();
        Register register = new Register();
        OutputStrategy consoleOutput = new ConsoleOutput();
        OutputStrategy guiOutput = new GUIOutput();

        register.createNewPurchase("C103", db, guiOutput);
        register.addProductToPurchase("P1050", 1);
//        register.addProductToPurchase("P1050", 1);
//        register.addProductToPurchase("P1556", 2);
        register.endPurchase();
    }
}
