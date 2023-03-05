package org.example.Semi1.task_Interface;

public class Main {
    public static void main(String[] args) {
        double temp = 37.0;
        System.out.println("Фаренгейты = " + new Fahrenheit().convertValue(temp));
        System.out.println("Кельвин = " + new Kelvin().convertValue(temp));
        System.out.println("Цельсия = " + new Celsies().convertValue(temp));
        System.out.println("Рейнюра = "+ new Reunyura().convertValue(temp));
    }
}
