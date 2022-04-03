package baseball.io;

import baseball.model.Numbers;

public class NumberGenerator {
    public Numbers generate() {
        String numString = String.valueOf(((int) (Math.random() * 900) + 100));
        return new Numbers(
                numString.chars()
                        .map(Character::getNumericValue)
                        .boxed()
                        .toArray(Integer[]::new)
        );
    }
}
