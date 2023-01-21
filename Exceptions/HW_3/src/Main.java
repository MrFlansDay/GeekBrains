import Model.ParseData;
import Model.Window;
import Model.Windows;
import Presenter.Presenter;
import View.Views;
import View.WindowView;


public class Main {
    public static void main(String[] args) {
        Views view = new WindowView();
        Windows window = new Window();
        Presenter presenter = new Presenter(view, window);
        view.start();

    }
}

