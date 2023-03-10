package Semi3.Task2_V;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    /**
     * Создать класс Dog и добавить возможноность итерирования по нему
     * @param args
     */
    public static void main(String[] args) {
        ListOfDogs dogs = new ListOfDogs(Arrays.asList(new Dog("Bob"),new Dog("Bib"),new Dog("Pip")));
        Iterator<Dog> we = dogs.iterator();
        while(we.hasNext()){
            System.out.println(we.next().getName());
        }
    }
}
