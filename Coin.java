public enum Coin {

        ONE_CENT(1), FIVE_CENTS(5), TEN_CENTS(10),  TWENTY_FIVE_CENTS(25);

        private int value;

        Coin(int value){
            this.value = value;
        }

        public static int[] parseCoins(String coins){
            String[] numberCoinsInText = coins.split(",");
            int[] result = new int[numberCoinsInText.length];
            for(int index=0;index<numberCoinsInText.length;index++){
                result[index] = Integer.parseInt(numberCoinsInText[index]);
            }
            return result;
        }

        public int getValue(){
            return this.value;
        }
    }

