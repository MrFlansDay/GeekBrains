package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    WindowView windowView;
    public void actionPerformed(ActionEvent e) {
        windowView.check();
    }

    public void setWindowView(WindowView windowView) {
        this.windowView = windowView;
    }
}
