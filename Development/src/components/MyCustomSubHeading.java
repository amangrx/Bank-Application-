package components;

import javax.swing.*;
import java.awt.*;

public class MyCustomSubHeading extends JLabel {
    public MyCustomSubHeading(String text){
//        a custom Jlabel for the purpose of setting font of sub-heading
        super(text);
        setFont(new Font("Arial",Font.BOLD,20));
    }
}

