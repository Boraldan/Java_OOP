package Semi4.Task_Aktibaev_Generic;

public class Student3 implements Comparable<Student3>{
    private int id;
    private String name;

    public Student3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  id + "  " + name;
    }

    @Override
    public int compareTo(Student3 o) {
        return name.compareTo(o.name);
    }
}
