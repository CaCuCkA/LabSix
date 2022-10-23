package flower.store;

public class Rose extends Flower {
    private static final double SEPAL_LENGTH_OF_ROSE = 5.9;
    private static final int PRICE_OF_ROSE = 10;

    public Rose() {
        super(SEPAL_LENGTH_OF_ROSE, FlowerColor.RED,
                PRICE_OF_ROSE, FlowerType.ROSE);
    }
}
