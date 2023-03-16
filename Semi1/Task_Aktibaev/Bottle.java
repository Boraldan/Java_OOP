package Semi1.Task_Aktibaev;

public class Bottle extends Product2{
    private double volume;
    public Bottle(String nameProduct, double cost, double volume) {
        super(nameProduct, cost);
        this.volume = volume;
    }


    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() +
                " volume=" + volume +
                '}';
    }
}
