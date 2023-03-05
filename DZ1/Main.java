package DZ1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
    2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
    метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему
    и температуре
    3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику
    заложенную в программе
    4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
*/
public class Main {
    public static void main(String[] args) {

        List<HDNext> products = new ArrayList<>(Arrays.asList(
                new HDNext("tea", 200, 45),
                new HDNext("hottea", 200, 65),
                new HDNext("hottea1", 200, 65),
                new HDNext("cofe", 300, 50)
        ));

        HDAutomat hdAutomat = new HDAutomat();
        hdAutomat.InitProd(products);
//        System.out.println(hdAutomat.getProduct("cofe", 300, 50).toString());
        System.out.println(hdAutomat.getProduct("cofe"));

    }
}
