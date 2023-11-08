package lotto.view;

public class InputView {
    public int inputPrice() {
        String price = camp.nextstep.edu.missionutils.Console.readLine();
        try {
            int priceTotal = Integer.parseInt(price);
            return priceTotal;
        }catch (IllegalArgumentException e) {
            return inputPrice();
        }
    }
}
