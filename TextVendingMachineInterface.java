public class TextVendingMachineInterface implements VendingMachineInterface {
    private VendingMachineController controller = new SimpleVendingMachineController();
    private int selectedProduct;
    private CoinBundle change;


    @Override
    public void displayProducts() {
        System.out.println(" *********************************************");
        System.out.println("     WELCOME TO ASHLEY'S VENDING MACHINE      ");
        System.out.println(" *********************************************");
        System.out.println("            Available Products:               ");
        System.out.println("                                              ");
        for(Product product: Product.values()){
            if(!Product.EMPTY.equals(product)) {
                System.out.println("     " + product.getSelectionNumber() + "  " + product.name() + " - Price: " + product.getPrice() + "   ");
            }
        }
        System.out.println("                                              ");
        System.out.println(" Please select your product: ");


    }

    @Override
    public void selectedProduct(int product) {

    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;
    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.println(" Please enter coins as follows: ");
        System.out.println("                                              ");
        System.out.println(" number of 1 cent coin, number of 5 cent coins, number of 10 cent coins, num of 25 cent coins ");
        System.out.println(" Example: If you would like to enter 3 five cents coins: 0,3,0,0");
        System.out.println("                                              ");
        System.out.println("Please enter coins when you're ready: ");

    }

    @Override
    public void enterCoins(int... coins) {
        VendingMachineRequest request = new VendingMachineRequest(selectedProduct, coins);
        change = controller.calculateChange(request);

    }

    @Override
    public void displayChangeMessage() {
        System.out.println("                                              ");
        System.out.println("Your change is: " + change.getTotal() + " cents and split as follows: ");
        System.out.println("    25 cent coin: " + change.number25CentCoin);
        System.out.println("    10 cent coin: " + change.number1CentCoin);
        System.out.println("    5 cent coin: " + change.number5CentCoin);
        System.out.println("    1 cent coin: " + change.number1CentCoin);

    }
}

