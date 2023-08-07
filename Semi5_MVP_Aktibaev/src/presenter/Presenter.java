package presenter;

import ui.View;
import weatherApi.Service;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void getInfo(String city){
        String answer = service.get(city);
        view.print(answer);
    }

    public void test(int a){
        view.print(service.test(a));
    }
}
