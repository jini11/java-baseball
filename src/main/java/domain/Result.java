package domain;

import java.util.List;

public class Result {
    private int ball;
    private int strike;

    public void init() {
        ball = 0;
        strike = 0;
    }

    public void countStrikesAndBalls(List<Integer> computer, List<Integer> user) {
        for (int i = 0; i < computer.size(); i++) {
            if (computer.get(i) == user.get(i)) {
                strike++;
            } else if (computer.contains(user.get(i))) {
                ball++;
            }
        }
    }

    public boolean isCorrect() {
        return strike == 3;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }
}
