package Semi6.Task4_my;

public class Phone {

//    private Phone phone;
    protected String name;
    protected int model;
    protected static Phone initPhone(){
        return new Phone();
    }
    protected static Phone addPhone(Phone phone){
        return phone;
    }

    protected Phone setName(String name) {
        this.name = name;
        return this;
    }

    protected Phone setModel(int model) {
        this.model = model;
        return this;
    }

    protected Phone bilder(){
        return this;
    }

    @Override
    public String toString() {
        return "Phone{ " +
                "name='" + name + '\'' +
                ", model=" + model +
                 " }";
    }
}
