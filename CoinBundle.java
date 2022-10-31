public class CoinBundle {
    public int number1CentCoin;
    public int number5CentCoin;
    public int number10CentCoin;
    public int number25CentCoin;

    public CoinBundle(int... enteredCoins) {
        this.number1CentCoin = enteredCoins[0];
        this.number5CentCoin = enteredCoins[1];
        this.number10CentCoin = enteredCoins[2];
        this.number25CentCoin = enteredCoins[3];

    }


    public int getTotal(){
        int total = 0;
        total = total+this.number1CentCoin*Coin.ONE_CENT.getValue();
        total = total+this.number5CentCoin*Coin.FIVE_CENTS.getValue();
        total = total+this.number10CentCoin*Coin.TEN_CENTS.getValue();
        total = total+this.number25CentCoin*Coin.TWENTY_FIVE_CENTS.getValue();

        return total;
    }
}

