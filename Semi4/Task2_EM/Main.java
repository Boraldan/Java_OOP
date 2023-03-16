package Semi4.Task2_EM;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ListOfDogs listDogs = new ListOfDogs();
        listDogs.setListDogs(Arrays.asList(
                new Dog("Бобик", 20, "Черный"),
                new Dog("Шарик", 15, "Белый"),
                new Dog("Полкан", 7, "Красный")));
        ListOfCats listOfCats = new ListOfCats();
        listOfCats.setListCat(Arrays.asList
                (new Cat("Плотон", 25), new Cat("Барскик", 15),(new Cat("Альфред", 2))));

        System.out.println("--------Перебор итератором--------");
        Iterator<Dog> iter = listDogs.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        System.out.println("\n--------Сортировка через класс ComparableOfName по имени--------");
//        listDogs.getListDogs().sort(new ComparableOfName()); // можно по разному вызвать метод sort
        Collections.sort(listDogs.getListDogs(), new ComparableOfName());
        for (Dog dog: listDogs){
            System.out.println(dog);
        }
        System.out.println("\n--------Сортировка через класс ComparableOfName по имени КОТЫ--------");
        listOfCats.getListCats().sort(new ComparableOfName());
        for (Cat cat: listOfCats){
            System.out.println(cat);
        }


    }
}
