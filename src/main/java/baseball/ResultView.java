package baseball;

import baseball.io.Output;
import baseball.model.BallCount;

import java.util.Scanner;

public class ResultView implements Output {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void ballCount(BallCount ballCount) {
        if (ballCount.getStrike() == 0) {
            System.out.println(ballCount.getBall() + "볼");
            return;
        }
        if (ballCount.getBall() != 0 && ballCount.getStrike() != 0) {
            System.out.println(ballCount.getBall() + "볼 " + ballCount.getStrike() + "스트라이크");
            return;
        }
        System.out.println(ballCount.getStrike() + "스트라이크");
    }

    @Override
    public int correct() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return scanner.nextInt();
    }
//    Scanner scanner = new Scanner(System.in);
//    int output(int ball, int strike) {
//        int option = 0;
//        if (ball != 0 && strike != 0)
//            System.out.printf("%d볼 %d스트라이크", ball, strike);
//        if (ball != 0)
//            System.out.printf("%d볼", ball);
//        if (strike != 0) {
//            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
//            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
//            option = scanner.nextInt();
//        }
//    }
}
