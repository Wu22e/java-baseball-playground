package baseball;

import baseball.io.Input;

import java.util.Scanner;

public class InputView implements Input {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String input(String prompt) {
        System.out.printf(prompt);
        return scanner.nextLine();
    }
}
