package DZ5;

import DZ5.Model.Car;
import DZ5.Model.CarShope;
import DZ5.Presenter.Presenter;
import DZ5.Presenter.PresenterService;
import DZ5.View.View;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PresenterService prService = new PresenterService(new View());
        prService.start(prService);
    }
}
