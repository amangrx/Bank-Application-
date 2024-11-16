package components;

import javax.swing.*;

public class MyCustomTextField extends JTextField {
    public MyCustomTextField(String text){
//        a custom Jtextfeld that sets the size of textfields.
        super(text);
        setColumns(20);
    }
}
