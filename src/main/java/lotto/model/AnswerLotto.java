package lotto.model;

import java.util.ArrayList;
import java.util.List;

public class AnswerLotto {
    private List<Integer> answer;
    private int bonusNumber;

    public AnswerLotto () {
        answer = new ArrayList<>();
    }

    public void setAnswer(List<Integer> answerInput) {
        answer = answerInput;
    }

    public void setBonusNumber(int bonus) {
        bonusNumber = bonus;
    }
}
