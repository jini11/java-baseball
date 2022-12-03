package domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class BaseBallNumber {

    public List<Integer> makeComputerNumber() {
        List<Integer> computer = makeRandomNumber();
        validate(computer);
        return computer;
    }

    private List<Integer> makeRandomNumber() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    private void validate(List<Integer> computer) {
        if (isDuplicate(computer)) {
            throw new IllegalArgumentException();
        }
        if (isInRange(computer)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isDuplicate(List<Integer> computer) {
        return computer.stream().distinct().count() == computer.size();
    }

    private boolean isInRange(List<Integer> computer) {
        return computer.stream()
                .filter(number -> number >= 1 && number <= 9)
                .count() == computer.size();
    }
}
