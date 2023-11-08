package lotto.controller;

import lotto.model.Lotto;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {
    private final InputView inputView;
    private final OutputView outputView;
    private List<Lotto> lottos;
    private int price;

    public LottoController() {
        lottos = new ArrayList<>();
        inputView = new InputView();
        outputView = new OutputView();
    }
    public void lottoGamePlay() {
        inputPrice();
        inputLottoEA();
        printLottos();
        inputAnswerLotto();
        inputBonusNumber();
        printStatistics();
    }

    private void inputPrice() {
        outputView.printPriceInputInform();
        price = inputView.inputPrice();
    }

    private void inputLottoEA() {

    }

    private void printLottos() {

    }

    private void inputAnswerLotto(){

    }

    private void inputBonusNumber() {

    }

    private void printStatistics() {

    }
}
