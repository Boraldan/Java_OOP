package Semi1.Task_Aktibaev;

public class Product2 {
  private String name;
  private double cost;

    public Product2(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "nameProduct='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
