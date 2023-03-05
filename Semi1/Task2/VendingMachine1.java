package org.example.Semi1.Task2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine1 extends VendingMachine {
    List<BottleOfWater> bottleOfWaters = new ArrayList<>();

    void initProduct(List<BottleOfWater> bottle) {
        this.bottleOfWaters = bottle;
    }

    @Override
    String getProduct(String name) {
        for (BottleOfWater el : bottleOfWaters) {
            if (el.getName().contains(name))
                return el.getName() + " " + el.getPrice();
        }
        return new BottleOfWater("Не найдено!", 0).toString();
    }

}
