package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class FlowerBucket {
    @Getter @Setter
    List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double sum = 0;
        for (FlowerPack i : flowerPacks) {
            sum += i.getPrice();
        }
        return sum;
    }
}
