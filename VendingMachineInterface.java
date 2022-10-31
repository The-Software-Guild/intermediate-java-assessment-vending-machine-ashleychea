public interface VendingMachineInterface {
    void displayProducts();
    void selectedProduct(int product);

    void selectProduct(int product);

    void displayEnterCoinsMessage();
    void enterCoins(int...coins);
    void displayChangeMessage();

}
