package flower.store;

public class Chamomile extends Flower {
    public static final double SEPAL_LENGTH_OF_CHAMOMILE = 6.7;
    public static final int PRICE_OF_CHAMOMILE = 9;

    Chamomile() {
        super(SEPAL_LENGTH_OF_CHAMOMILE, FlowerColor.GREEN,
                PRICE_OF_CHAMOMILE, FlowerType.CHAMOMILE);
    }
}
