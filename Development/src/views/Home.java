package views;

import components.MyCustomButton;
import components.MyCustomHeading;
import components.MyCustomLabel;
import coursework.BankCard;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Home extends JFrame {
//    Arraylist of bank card
    ArrayList<BankCard> bankCards = new ArrayList<>();
//    Declaring the UI components of Home
    public MyCustomHeading welcomeLabel, decLabel;
    public MyCustomLabel createAccLabel, goToLabel;
    public MyCustomButton createAccBtn, debitCardBtn, creditCardBtn;
//End of Declaration


//    No args constructor
    public Home(){
//      Initializing the Jframe.
        super("Welcome");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setVisible(true);

//        initialization of UI components.
        welcomeLabel = new MyCustomHeading("Welcome !!!");
        decLabel = new MyCustomHeading("What do you want to do today?");

        createAccLabel = new MyCustomLabel("Create Account :");
        goToLabel = new MyCustomLabel("Go to:");

        createAccBtn = new MyCustomButton("Create a Bank A/C");
        debitCardBtn = new MyCustomButton("Debit Card");
        creditCardBtn = new MyCustomButton("Credit Card");
//      end of initialization
//      adding the textfields labels and button using GridBagLayout to the Jframe.

        GridBagLayout gblForHome = new GridBagLayout();
        GridBagConstraints gbcForHome= new GridBagConstraints();
        setLayout(gblForHome);

        gbcForHome.gridx = 0;
        gbcForHome.gridy = 0;
        gbcForHome.gridwidth = 3;
        gbcForHome.insets = new Insets(0,0,50,0);
        add(welcomeLabel,gbcForHome);

        gbcForHome.gridx = 0;
        gbcForHome.gridy = 1;
        gbcForHome.gridwidth = 3;
        gbcForHome.insets = new Insets(0,0,80,0);
        add(decLabel,gbcForHome);

        gbcForHome.gridx = 0;
        gbcForHome.gridy = 2;
        gbcForHome.gridwidth = 3;
        gbcForHome.insets = new Insets(0,100,20,100);
        add(createAccLabel,gbcForHome);

        gbcForHome.gridx = 0;
        gbcForHome.gridy = 3;
        gbcForHome.gridwidth = 3;
        gbcForHome.insets = new Insets(0,100,20,100);
        add(createAccBtn,gbcForHome);

        gbcForHome.gridx = 0;
        gbcForHome.gridy = 4;
        gbcForHome.gridwidth = 3;
        gbcForHome.insets = new Insets(0,100,20,100);
        add(goToLabel,gbcForHome);

        gbcForHome.gridx = 0;
        gbcForHome.gridy = 5;
        gbcForHome.gridwidth = 3;
        gbcForHome.insets = new Insets(0,100,20,100);
        add(debitCardBtn,gbcForHome);

        gbcForHome.gridx = 0;
        gbcForHome.gridy = 6;
        gbcForHome.gridwidth = 3;
        gbcForHome.insets = new Insets(0,100,20,100);
        add(creditCardBtn,gbcForHome);

        //this is a function for the createAcc button that opens the frame of bank card
        createAccBtn.addActionListener(e -> {
            new Bank(bankCards).setVisible(true);
        });

        //this is a function for the debitcard button that opens the frame of debit card
        debitCardBtn.addActionListener(e -> {
            new Debit(bankCards).setVisible(true);
        });

        //this is a function for the creditcard button that opens the frame of credit card
        creditCardBtn.addActionListener(e -> {
            new Credit(bankCards).setVisible(true);
        });
    }
}
