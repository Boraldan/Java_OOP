package DZ3;

public class Dog implements Comparable<Dog> {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Dog o) {
            return this.name.compareTo(o.name);
    }
}
