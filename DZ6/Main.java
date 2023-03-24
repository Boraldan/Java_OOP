package DZ6;

import DZ6.Presenter.PresenterService;
import DZ6.View.View;

public class Main {
    public static void main(String[] args) {

        PresenterService prService = new PresenterService(new View());
        prService.start(prService);
    }
}
