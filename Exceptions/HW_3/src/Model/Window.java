package Model;

import Presenter.Presenter;

public class Window implements Windows{
    Presenter presenter;
    CheckData checkData;
    SaveData saveData;


    public Window() {
        checkData = new CheckData();
        saveData = new SaveData();
    }

    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void check(String name, String birthDate, String phone) throws Exception {
        checkData.checkAllData(name, birthDate, phone);
    }

    public String save(String name, String birthDate, String phone, Gender gender) throws Exception {
        return saveData.save(name, birthDate, phone, gender);
    }
}
