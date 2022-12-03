package controller;

import domain.BaseBallNumber;
import domain.Result;
import view.InputView;
import view.OutputView;

import java.util.List;

public class BaseBallController {
    private InputView inputView;
    private OutputView outputView;
    private BaseBallNumber baseBallNumber;
    private Result result;

    public BaseBallController() {
        inputView = new InputView();
        outputView = new OutputView();
        baseBallNumber = new BaseBallNumber();
        result = new Result();
    }

    public void start() {
        outputView.printStart();
        playGame();
    }

    private void playGame() {
        List<Integer> computer = makeComputerNumber();
        do {
            List<Integer> userNumber = inputView.readUserNumber();
            result.countStrikesAndBalls(computer, userNumber);
            outputView.printResult(result.getBall(), result.getStrike());
        } while (!result.isCorrect());
        outputView.printCorrect();
    }

    private List<Integer> makeComputerNumber() {
        return baseBallNumber.makeComputerNumber();
    }

    private void isRetry() {
        int retry = inputView.readRetry();

    }
}
