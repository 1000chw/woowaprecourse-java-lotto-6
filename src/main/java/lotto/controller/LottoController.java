package lotto.controller;

import lotto.model.AnswerLotto;
import lotto.model.Lotto;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {
    private final InputView inputView;
    private final OutputView outputView;
    private List<Lotto> lottos;
    private AnswerLotto answerLotto;
    private int lottoEA;

    public LottoController() {
        lottos = new ArrayList<>();
        inputView = new InputView();
        outputView = new OutputView();
        answerLotto = new AnswerLotto();
    }
    public void lottoGamePlay() {
        inputPrice();
        makeLottos();
        printLottos();
        inputAnswerLotto();
        inputBonusNumber();
        printStatistics();
    }

    private void inputPrice() {
        outputView.printPriceInputInform();
        lottoEA = inputView.inputPrice();
    }

    private void makeLottos() {
        while (lottoEA > 0){
            try {
                Lotto lotto = makeLotto();
                lottos.add(lotto);
            } catch (IllegalArgumentException e) {
            }
        }
    }

    private Lotto makeLotto() {
        final int startNum = 1;
        final int endNum = 45;
        final int count = 6;
        List<Integer> numbers = camp.nextstep.edu.missionutils.Randoms.pickUniqueNumbersInRange(startNum, endNum, count);
        return new Lotto(numbers);
    }

    private void printLottos() {
        outputView.printLottosState(lottos);
    }

    private void inputAnswerLotto(){
        outputView.printInputAnswerInfo();
        List<Integer> answer = inputView.inputAnswer();
        answerLotto.setAnswer(answer);
    }

    private void inputBonusNumber() {

    }

    private void printStatistics() {

    }
}
