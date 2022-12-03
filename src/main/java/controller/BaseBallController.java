package controller;

import view.OutputView;

public class BaseBallController {
    private OutputView outputView;

    public BaseBallController() {
        outputView = new OutputView();
    }

    public void start() {
        outputView.printStart();
    }
}
