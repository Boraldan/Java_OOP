package Leksii.L5.Ex001Calc;

public class Program {
    public static void main(String[] args) {
//        PresenterOfT<SumModel> p = new PresenterOfT(new SumModel(), new View());  // через PresenterOfT
        Presenter p = new Presenter(new SumModel(), new View());     // через Presenter
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();
        p.buttonClick();

    }
}
