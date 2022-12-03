package view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {

    public List<Integer> readUserNumber() {
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
        return notDuplicate.size() == number.length();
    }

    private boolean isInRange(String number) {
        return Arrays.stream(number.split(""))
                .map(Integer::parseInt)
                .filter(one -> one >= 1 && one <= 9)
                .count() == number.length();
    }
}
