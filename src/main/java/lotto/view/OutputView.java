package lotto.view;

import lotto.model.Lotto;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.naturalOrder;

public class OutputView {
    public void printPriceInputInform() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public void printLottosState (List<Lotto> lottos) {
        System.out.println("\n" + lottos.size()+"개를 구매했습니다.");
        for (Lotto lotto : lottos) {
            printLotto(lotto);
        }
    }

    private void printLotto(Lotto lotto) {
        List<Integer> numbers = lotto.getNumbers();
        numbers.sort(Comparator.naturalOrder());
        System.out.print("[");
        for (int n : numbers){
            System.out.print(n+", ");
        }
        System.out.println("]\n");
    }

    public void printInputAnswerInfo() {
        System.out.println("\n당첨 번호를 입력해 주세요.");
    }
}
