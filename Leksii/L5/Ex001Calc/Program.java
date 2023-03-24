package Leksii.L5.Ex001Calc;

public class Program {
    public static void main(String[] args) {
//        PresenterOfT<SumModel> p = new PresenterOfT(new SumModel(), new View());  // через PresenterOfT
        Presenter p = new Presenter(new SumModel("Sum"), new View());     // через Presenter
        p.buttonClick();


        Presenter p2 = new Presenter(new SubModel("Sub"), new View());     // через Presenter
        p2.buttonClick();


    }
}
