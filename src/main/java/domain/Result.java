package domain;

import java.util.List;

public class Result {
    private int ball;
    private int strike;

    public void countStrikesAndBalls(List<Integer> computer, List<Integer> user) {
        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i) == user.get(i)) {
                strike++;
            } else if (computer.contains(user.get(i))) {
                ball++;
            }
        }
    }
}
