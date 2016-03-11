package hello;

import org.jdesktop.application.*;
import javax.swing.*;
import java.awt.*;

public class BasicSingleFrameApp extends SingleFrameApplication {
    JLabel label;

    @Override
    protected void startup() {
        getMainFrame().setTitle("BasicSingleFrameApp");
        label = new JLabel("Hello, world!");
        label.setFont(new Font("SansSerif", Font.PLAIN, 22));
        show(label);
    }

    public static void main(String[] args) {
        Application.launch(BasicSingleFrameApp.class, args);
    }

}