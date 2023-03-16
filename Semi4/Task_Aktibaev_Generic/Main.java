package Semi4.Task_Aktibaev_Generic;

/**
 * Задача без Дженериков в решена в Семинаре 3. Смотреть исходник.
 * */



public class Main {
    public static void main(String[] args) {

        StudyGroup3<Student3> group = new StudyGroup3();
        Service service = new Service(group);

        service.addStudet("Ваня");
        service.addStudet("Петя");
        service.addStudet("Вася");
        service.addStudet("Маша");

        for (Student3 student : group) {
            System.out.println(student);
        }
        System.out.println();

        service.sortByName();

        for (Student3 student : group) {
            System.out.println(student);
        }
        System.out.println();

        service.sortById();

        for (Student3 student : group) {
            System.out.println(student);
        }
    }
}
