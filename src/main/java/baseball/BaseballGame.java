package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static constant.BaseballConstant.START_MESSAGE;

public class BaseballGame {
    private static final List<Integer> computerNumbers = new ArrayList<>();

    public static void start() {
        makeRandomNumber();
        printMessage(START_MESSAGE);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    private static void makeRandomNumber() {
        while (computerNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computerNumbers.contains(randomNumber)) {
                computerNumbers.add(randomNumber);
            }
        }
    }
}
