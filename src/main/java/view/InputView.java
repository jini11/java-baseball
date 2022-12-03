package view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public List<Integer> readUserNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        validate(input);
        return Arrays.stream(input.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private void validate(String userNumber) {
        if (isDuplicate(userNumber)) {
            throw new IllegalArgumentException();
        }
        if (isInRange(userNumber)) {
            throw  new IllegalArgumentException();
        }
    }

    private boolean isDuplicate(String number) {
        HashSet<Integer> notDuplicate = new HashSet<>(Arrays.stream(number.split("")).map(Integer::parseInt).collect(Collectors.toList()));
        return notDuplicate.size() != number.length();
    }

    private boolean isInRange(String number) {
        return Arrays.stream(number.split(""))
                .map(Integer::parseInt)
                .filter(one -> one >= 1 && one <= 9)
                .count() != number.length();
    }

    public int readRetry() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int command = Integer.parseInt(Console.readLine());
        validate(command);
        return command;
    }

    private void validate(int command) {
        if (command != 1 && command != 2) {
            throw new IllegalArgumentException();
        }
    }
}
