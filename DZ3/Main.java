package DZ3;

import java.util.*;

public class Main {
    /**
     * Создать класс Dog и добавить возможноность итерирования по нему
     *
     * @param args
     */
    public static void main(String[] args) {
        ListOfDogs dogs = new ListOfDogs(Arrays.asList(
                new Dog("Pip"),
                new Dog("Bob"),
                new Dog("Bib"),
                new Dog("Nic")));

        Iterator<Dog> we = dogs.iterator();
        while (we.hasNext()) {
            System.out.println(we.next().getName());
        }

        Collections.sort(dogs.getDogs());

        System.out.println();

        Iterator<Dog> we1 = dogs.iterator();
        while (we1.hasNext()) {
            System.out.println(we1.next().getName());
        }
    }
}
