package components;

import javax.swing.*;
import java.awt.*;

public class MyCustomButton extends JButton {
    public MyCustomButton(String text){
//        a custom button that sets the font size ,style of jbutton.
        super(text);
        setFont(new Font("Arial",Font.BOLD,15));
    }
}
