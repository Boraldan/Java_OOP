package Semi5.Aktibaev.ModelMenu.View.Comands;


import Semi5.Aktibaev.ModelMenu.View.View;


public class Comand1 implements Option {

    private View view;

    public Comand1(View view) {
        this.view = view;
    }

    @Override
    public String info() {
        String text = "Добавить";
        return text;
    }

    @Override
    public void doit() {

        view.getPresenter().getSum().sum1();

//        view.load(); //  или запустить команды прописанных в этом методе

    }
}
