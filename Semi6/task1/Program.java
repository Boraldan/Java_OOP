package Semi6.task1;

public class Program {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat = CatBuilder.getCatBuilder().setName("barsik").setAge(5).setWeight(6).build();
        Cat cat2 = CatBuilder.getCatBuilder().setName("cat").setBreed("brit").setOwner("Vladimir").build();
//        System.out.println(cat);
        System.out.println(cat2);
        cat2.setAge(10);
        System.out.println(cat2);
    }
}
