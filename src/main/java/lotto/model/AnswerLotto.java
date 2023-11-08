package lotto.model;

import java.util.ArrayList;
import java.util.List;

public class AnswerLotto extends Lotto {
    private int bonusNumber;

    public AnswerLotto(List<Integer> numbers) {
        super(numbers);
    }

    public void setBonusNumber(int bonus) {
        bonusNumber = bonus;
    }
}
