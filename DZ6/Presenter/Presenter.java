package DZ6.Presenter;

import DZ6.Model.Car;
import DZ6.Model.CarShope;
import DZ6.View.View;

public class Presenter {
    protected View view;
    protected Car car;
    protected CarShope carShope;

    public Presenter(View view) {
        this.view = view;
        this.carShope = new CarShope(5);
    }
    public View getView() {
        return view;
    }
    public Car getCar() {
        return car;
    }
    public CarShope getCarShope() {
        return carShope;
    }

}
