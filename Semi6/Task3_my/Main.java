package Semi6.Task3_my;

/* Вариант создание объекта в самом классе без дополнительного билдера. */
public class Main {
    public static void main(String[] args) {

        Phone p2 = Phone.initPhone().setModel(777);
        System.out.println(p2);
        p2.setNumber(100);
        System.out.println(p2);

        Phone p1 = Phone.initPhone();
        p1.setName("Go");
        System.out.println(p1);
    }
}
