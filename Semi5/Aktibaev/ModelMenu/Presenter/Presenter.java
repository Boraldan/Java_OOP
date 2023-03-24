package Semi5.Aktibaev.ModelMenu.Presenter;

import Semi5.Aktibaev.ModelMenu.ModelCalc.Sum;
import Semi5.Aktibaev.ModelMenu.View.View;

public class Presenter {
    private View view;
    private Sum sum;

    public Presenter() {
        this.view = new View(this);
        this.sum = new Sum();
    }

    public View getView() {
        return view;
    }

    public Sum getSum() {
        return sum;
    }
}
