package flower.store;

public class Tulip extends Flower{
    public static final double SEPAL_LENGTH_OF_TULIP = 4.7;
    public static final int PRICE_OF_TULIP = 18;

    public Tulip(){
        super(SEPAL_LENGTH_OF_TULIP, FlowerColor.BLUE,
                PRICE_OF_TULIP, FlowerType.TULIP);
    }
}
