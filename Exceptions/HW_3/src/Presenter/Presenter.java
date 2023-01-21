package Presenter;

import Model.Gender;
import Model.Windows;
import View.Views;

public class Presenter {
    Views view;
    Windows window;

    public Presenter(Views view, Windows window) {
        this.view = view;
        view.setPresenter(this);
        this.window = window;
        window.setPresenter(this);
    }

    public void check(String name, String birthDate, String phone) throws Exception{
        window.check(name, birthDate, phone);
    }

    public String save(String name, String birthDate, String phone, Gender gender) throws Exception {
        return window.save(name, birthDate, phone, gender);
    }
}
