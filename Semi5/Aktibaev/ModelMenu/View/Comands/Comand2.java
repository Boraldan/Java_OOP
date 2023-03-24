package Semi5.Aktibaev.ModelMenu.View.Comands;

import Semi5.Aktibaev.ModelMenu.View.View;

public class Comand2 implements Option {
   private View view;

    public Comand2(View view) {
        this.view = view;
    }

    @Override
    public String info() {
        String text = "Смотреть";
        return text;
    }

    @Override
    public void doit() {
        view.getPresenter().getSum().sum2();
 //        view.load(); //  или запустить команды прописанных в этом методе
    }
}
