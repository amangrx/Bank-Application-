package components;

import javax.swing.*;
import java.awt.*;

public class MyCustomHeading extends JLabel {
    public MyCustomHeading(String text){
//        a custom jlabel that sets the font size ,style of heading of the frames.
        super(text);
        setFont(new Font("Arial",Font.BOLD,40));
    }
}
