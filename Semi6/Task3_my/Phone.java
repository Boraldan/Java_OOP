package Semi6.Task3_my;

public class Phone {


    private String name;
    private int model;

    private int number;


    public static Phone initPhone(){
        return new Phone();
    }
//    public static Phone addPhone(PhoneBase phone){
//        return (Phone) phone;
//    }

    public Phone setName(String name) {
        this.name = name;
        return this;
    }

    public Phone setModel(int model) {
        this.model = model;
        return this;
    }
    public Phone setNumber(int number) {
        this.number = number;
        return this;
    }

    public Phone bilder(){
        return this;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model=" + model +
                ", number=" + number +
                '}';
    }
}
