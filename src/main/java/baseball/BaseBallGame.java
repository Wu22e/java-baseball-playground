package baseball;

import baseball.io.Input;
import baseball.io.NumberGenerator;
import baseball.io.Output;
import baseball.model.BallCount;
import baseball.model.Numbers;

import java.util.Arrays;
import java.util.List;

public class BaseBallGame implements Runnable {
    private NumberGenerator numberGenerator;
    private Input input;
    private Output output;

    public BaseBallGame(Input input, Output output) {
        numberGenerator = new NumberGenerator();
        this.input = input;
        this.output = output;
    }

    @Override
    public void run() {
        Numbers answer = numberGenerator.generate();
        System.out.println(Arrays.toString(answer.getNums()));
        Boolean checkOption = true;
        while (checkOption) {
            String inputString = input.input("숫자를 입력해주세요 : ");
            Numbers inputNumbers = parse(inputString);

            BallCount ballCount = ballCount(answer, inputNumbers);
            output.ballCount(ballCount);
            checkOption = checkCorrect(ballCount.getStrike());
        }
    }

    private Boolean checkCorrect(Integer strike) {
        if (strike != 3) {
            return true;
        }

        int option = output.correct();

        if (option == 1) {
            return true;
        }
        return false;
    }

    private BallCount ballCount(Numbers answer, Numbers inputNumbers) {
        int ball = 0;
        int strike = 0;
        Integer[] answerNums = answer.getNums();
        Integer[] inputNums = inputNumbers.getNums();

        for (int i = 0; i < 3; i++) {
            ball += checkBallCount(i, answerNums, inputNums[i]);
            strike += checkStrikeCount(i, answerNums, inputNums[i]);
        }

        return new BallCount(strike, ball);
    }

    private int checkBallCount(int index, Integer[] answers, Integer input) {
        List<Integer> answerList = Arrays.asList(answers);
        if (answers[index] != input && answerList.contains(input)) {
            return 1;
        }
        return 0;
    }

    private int checkStrikeCount(int index, Integer[] answers, Integer input) {
        if (answers[index] == input) {
            return 1;
        }
        return 0;
    }

    private Numbers parse(String inputString) {
        return new Numbers(
                inputString.chars()
                        .map(Character::getNumericValue)
                        .boxed()
                        .toArray(Integer[]::new)
        );
    }
}