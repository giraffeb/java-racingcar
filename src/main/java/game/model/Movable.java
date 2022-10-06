package game.model;

import utils.RandomNumberUtils;

public class Movable {

    public static final int BOUND = 10;
    public static final int STANDARD_TO_MOVE = 4;

    private Movable() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static MovableStrategy getMovableStrategy() {
        return () -> RandomNumberUtils.getRandomNumber(BOUND) >= STANDARD_TO_MOVE;
    }
}
