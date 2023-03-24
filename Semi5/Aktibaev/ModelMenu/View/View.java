package Semi5.Aktibaev.ModelMenu.View;

import Semi5.Aktibaev.ModelMenu.Presenter.Presenter;
import Semi5.Aktibaev.ModelMenu.View.Comands.Comand1;
import Semi5.Aktibaev.ModelMenu.View.Comands.Comand2;
import Semi5.Aktibaev.ModelMenu.View.Comands.Option;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    Presenter presenter;
    private List<Option> menuList;

    Scanner scan = new Scanner(System.in);

    public View(Presenter presenter) {
        this.presenter = presenter;
        this.menuList = new ArrayList<>();
        menuList.add(new Comand1(this));
        menuList.add(new Comand2(this));
    }

    public Presenter getPresenter() {
        return presenter;
    }
    public void printMenu() {
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(i+1 + " - " + menuList.get(i).info() );
        }
        System.out.println("Введите номер запроса: ");
        int num = scan.nextInt();
        menuList.get(num - 1).doit();
    }

//    public void load(){
//    presenter.  ...... }  //  можно сюда ввести список дальнейших дествий
}
