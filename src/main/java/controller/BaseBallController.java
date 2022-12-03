package controller;

import domain.BaseBallNumber;
import view.OutputView;

import java.util.List;

public class BaseBallController {
    private OutputView outputView;
    private BaseBallNumber baseBallNumber;

    public BaseBallController() {
        outputView = new OutputView();
        baseBallNumber = new BaseBallNumber();
    }

    public void start() {
        outputView.printStart();

        playGame();
    }

    private void playGame() {
        makeComputerNumber();
    }

    private void makeComputerNumber() {
        List<Integer> computer = baseBallNumber.makeComputerNumber();
    }
}
