package Model;

import Presenter.Presenter;

public interface Windows {
    void check(String name, String birthDate, String phone) throws Exception;
    void setPresenter(Presenter presenter);
    String save(String name, String birthDate, String phone, Gender gender) throws Exception;
}
