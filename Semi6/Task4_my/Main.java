package Semi6.Task4_my;

public class Main {
    public static void main(String[] args) {
        Phone p1 = Phone.initPhone().setName("p11");
        System.out.println(p1);

        Phone n1 = Nokia.initPhone().setName("n11");
        System.out.println(n1);
        n1 = Nokia.addPhone(n1).setModel(888);
        System.out.println(n1);
    }
}
