package controller;

import domain.BaseBallNumber;
import view.InputView;
import view.OutputView;

import java.util.List;

public class BaseBallController {
    private InputView inputView;
    private OutputView outputView;
    private BaseBallNumber baseBallNumber;

    public BaseBallController() {
        inputView = new InputView();
        outputView = new OutputView();
        baseBallNumber = new BaseBallNumber();
    }

    public void start() {
        outputView.printStart();

        playGame();
    }

    private void playGame() {
        makeComputerNumber();
        List<Integer> userNumber = inputView.readUserNumber();

    }

    private void makeComputerNumber() {
        List<Integer> computer = baseBallNumber.makeComputerNumber();
    }
}
