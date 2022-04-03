package baseball;

public class App {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();

        new BaseBallGame(inputView, resultView).run();
    }
}
