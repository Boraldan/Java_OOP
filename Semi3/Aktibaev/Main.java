package Semi3.Aktibaev;

import java.util.Collections;

/**
 * Задача без Дженериков в решена в Семинаре 3. Смотреть исходник.
 * */
public class Main {
    public static void main(String[] args) {

        StudyGroup3 group = new StudyGroup3();
        Service service = new Service(group);

        service.addStudet("Ваня");
        service.addStudet("Петя");
        service.addStudet("Вася");
        service.addStudet("Маша");

        for (Student3 student : group) {
            System.out.println(student);
        }
        System.out.println();

        service.sortByName();   // метод протисан в классе Servise
//        Collections.sort(group.getStudent3List()); // или так вызвать сортировку по имени

        for (Student3 student : group) {
            System.out.println(student);
        }
        System.out.println();

        service.sortById(); // метод протисан в классе Servise
//        Collections.sort(group.getStudent3List(), new StudentComparatorById()); // или так вызвать сортировку по имени Id

        for (Student3 student : group) {
            System.out.println(student);
        }
    }
}
