package Semi5.Aktibaev.ModelMenu;

import Semi5.Aktibaev.ModelMenu.Presenter.Presenter;

public class Main {
    public static void main(String[] args) {

        Presenter presenter = new Presenter();
        presenter.getView().printMenu();

    }
}
