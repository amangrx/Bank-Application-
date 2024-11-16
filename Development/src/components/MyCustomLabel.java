package components;

import javax.swing.*;
import java.awt.*;

public class MyCustomLabel extends JLabel {
    public MyCustomLabel (String text){
//        a custom jlabel that sets the font size ,style of labels.
        super(text);
        setFont(new Font("Arial",Font.PLAIN,15));
    }
}
