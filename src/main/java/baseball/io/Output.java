package baseball.io;

import baseball.model.BallCount;

public interface Output {
    void ballCount(BallCount ballCount);

    int correct();
}
