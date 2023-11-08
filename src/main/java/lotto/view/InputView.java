package lotto.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class InputView {
    public int inputPrice() {
        String price = camp.nextstep.edu.missionutils.Console.readLine();
        try {
            int priceTotal = Integer.parseInt(price);
            return priceTotal/1000;
        }catch (IllegalArgumentException e) {
            return inputPrice();
        }
    }

    public List<Integer> inputAnswer() {
        String answerInput = camp.nextstep.edu.missionutils.Console.readLine();
        try {
            String[] answerNums = answerInput.split(",");
            List<Integer> answers = new ArrayList<>();
            for (String num : answerNums) {
                answers.add(Integer.parseInt(num));
            }
            return answers;
        }catch (IllegalArgumentException e) {
            return inputAnswer();
        }
    }

    public int inputBonusNumber() {
        String bunusInput = camp.nextstep.edu.missionutils.Console.readLine();
        try {
            return Integer.parseInt(bunusInput);
        }catch (IllegalArgumentException e) {
            return inputBonusNumber();
        }
    }
}
