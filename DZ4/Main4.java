package DZ4;

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
public class Main4 {
    public static void main(String[] args) {
        List<HDNext4> products = new ArrayList<>(Arrays.asList(
                new HDNext4("tea", 200, 45),
                new HDNext4("hottea", 200, 65),
                new HDNext4("hottea1", 200, 65),
                new HDNext4("cofe", 300, 50)));

        HDAutomat4<HDNext4> hdAutomat4 = new HDAutomat4();
        hdAutomat4.InitProd(products);
        System.out.println(hdAutomat4.getProduct("cofe", 300, 50).toString());
//      System.out.println(hdAutomat4.getProduct("cofe"));

    }
}
