public class SimpleCalculator implements Calculator {
    @Override
    public int calculateTotal(CoinBundle enteredCoins) {
        return enteredCoins.getTotal();
    }

    @Override
    public CoinBundle calculateChange(int amountMoneyToReturn) {
        CoinBundle change = new CoinBundle(new int[4]);
        int remainingAmount = amountMoneyToReturn;

        change.number25CentCoin = remainingAmount / Coin.TWENTY_FIVE_CENTS.getValue();
        remainingAmount = remainingAmount % Coin.TWENTY_FIVE_CENTS.getValue();

        change.number10CentCoin = remainingAmount / Coin.TEN_CENTS.getValue();
        remainingAmount = remainingAmount % Coin.TEN_CENTS.getValue();

        change.number5CentCoin = remainingAmount / Coin.FIVE_CENTS.getValue();
        remainingAmount = remainingAmount % Coin.FIVE_CENTS.getValue();

        change.number1CentCoin = remainingAmount / Coin.ONE_CENT.getValue();


        return change;
    }
}
