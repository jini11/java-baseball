package view;

public class OutputView {
    private final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    public void printStart() {
        System.out.println(START_MESSAGE);
    }

    public void printResult(int ball, int strike) {
        if (ball == 0 && strike == 0) {
            System.out.print("낫싱");
            return;
        }
        if (ball != 0) {
            System.out.print(ball + "볼 ");
        }
        if (strike != 0) {
            System.out.print(strike + "스트라이크");
        }
        System.out.println();
    }

}
