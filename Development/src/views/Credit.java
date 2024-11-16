package views;

import components.*;
import coursework.BankCard;
import coursework.CreditCard;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Credit extends JFrame {
    //    Declaring the UI components of Debit
    public MyCustomHeading creditCardLabel;
    public MyCustomSubHeading setLabel, cancelLabel;
    public MyCustomLabel cardIdForCreditLabel, creditLimitForCreditLabel, gracePeriodForCreditLabel;
    public MyCustomTextField cardIdForCreditTf, creditLimitForCreditTf, gracePeriodForCreditTf;
    public MyCustomButton setBtn, cancelBtn, displayCreditBtn, clearAllCreditBtn, backCreditBtn;
    //End of Declaration

    //constructor of debit that takes arraylist of bank card as parameter
    public Credit(ArrayList<BankCard> bankCards) {
        super("Credit Card");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setVisible(true);

        //        initialization of UI components.
        creditCardLabel = new MyCustomHeading("Credit Card");

        setLabel = new MyCustomSubHeading("Set your new credit limit");
        cancelLabel = new MyCustomSubHeading("Cancel Credit Card");

        cardIdForCreditLabel = new MyCustomLabel("Card ID");
        creditLimitForCreditLabel = new MyCustomLabel("Credit Limit");
        gracePeriodForCreditLabel = new MyCustomLabel("Grace Period");

        cardIdForCreditTf = new MyCustomTextField("");
        creditLimitForCreditTf = new MyCustomTextField("");
        gracePeriodForCreditTf = new MyCustomTextField("");

        setBtn = new MyCustomButton("Set");
        cancelBtn = new MyCustomButton("Cancel Credit Card");
        displayCreditBtn = new MyCustomButton("Display");
        clearAllCreditBtn = new MyCustomButton("Clear All");
        backCreditBtn = new MyCustomButton("Back");
        //end of initialization

//      adding the text fields labels and button using GridBagLayout to the Jframe.

        GridBagLayout gridBagLayoutForCredit = new GridBagLayout();
        GridBagConstraints gbcForCredit = new GridBagConstraints();
        setLayout(gridBagLayoutForCredit);

        gbcForCredit.gridx = 0;
        gbcForCredit.gridy = 0;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 0, 50, 0);
        add(creditCardLabel, gbcForCredit);

        gbcForCredit.gridx = 0;
        gbcForCredit.gridy = 1;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 0, 50, 150);
        add(cardIdForCreditLabel, gbcForCredit);

        gbcForCredit.gridx = 1;
        gbcForCredit.gridy = 1;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 100, 50, 0);
        add(cardIdForCreditTf, gbcForCredit);

        gbcForCredit.gridx = 0;
        gbcForCredit.gridy = 2;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 0, 30, 0);
        add(setLabel, gbcForCredit);

        gbcForCredit.gridx = 0;
        gbcForCredit.gridy = 4;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 0, 20, 150);
        add(creditLimitForCreditLabel, gbcForCredit);

        gbcForCredit.gridx = 1;
        gbcForCredit.gridy = 4;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 100, 20, 0);
        add(creditLimitForCreditTf, gbcForCredit);

        gbcForCredit.gridx = 0;
        gbcForCredit.gridy = 5;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 0, 30, 150);
        add(gracePeriodForCreditLabel, gbcForCredit);

        gbcForCredit.gridx = 1;
        gbcForCredit.gridy = 5;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 100, 30, 0);
        add(gracePeriodForCreditTf, gbcForCredit);

        gbcForCredit.gridx = 1;
        gbcForCredit.gridy = 6;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 100, 20, 0);
        add(setBtn, gbcForCredit);

        gbcForCredit.gridx = 0;
        gbcForCredit.gridy = 7;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 0, 30, 150);
        add(cancelLabel, gbcForCredit);

        gbcForCredit.gridx = 1;
        gbcForCredit.gridy = 9;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 100, 50, 0);
        add(cancelBtn, gbcForCredit);

        gbcForCredit.gridx = 0;
        gbcForCredit.gridy = 10;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 0, 20, 250);
        add(displayCreditBtn, gbcForCredit);

        gbcForCredit.gridx = 1;
        gbcForCredit.gridy = 10;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 200, 20, 50);
        add(clearAllCreditBtn, gbcForCredit);

        gbcForCredit.gridx = 2;
        gbcForCredit.gridy = 10;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 250, 20, 0);
        add(backCreditBtn, gbcForCredit);

//end of gridbaglayout

//        this is a button that takes in required inputs from the text fields and
//        checks various condition and calls the set credit limit method

        setBtn.addActionListener(e -> {
            //exception handling
            try {
                String cardIdForCredit = cardIdForCreditTf.getText();
                String creditLimitForCredit = creditLimitForCreditTf.getText();
                String gracePeriodForCredit = gracePeriodForCreditTf.getText();

                //if condition to check whether the arraylist is empty or not
                if (bankCards.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please add credit card in Bank A/C first");
                } //condition to check if the text fields are empty or not
                else if (cardIdForCredit.isEmpty() || creditLimitForCredit.isEmpty() || gracePeriodForCredit.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill up the fields");
                } else {
                    //changing the string values from text fields into required double, int values.
                    int cardId = Integer.parseInt(cardIdForCredit);
                    double newCreditLimit = Double.parseDouble(creditLimitForCredit);
                    int newGracePeriod = Integer.parseInt(gracePeriodForCredit);
                    boolean foundCard = false;
                    CreditCard creditCard = null;
                    //It iterates over the "bankCards" ArrayList using the enhanced for loop syntax and checks each credit card object to find the one with the given card ID.
                    for (BankCard bankCard1 : bankCards) {
                        //usage of downcasting to access the object of bankcard
                        if (bankCard1 instanceof CreditCard) {
                            creditCard = (CreditCard) bankCard1;
                            // checking if the card id of credit id matches with the card id of arraylist
                            if (creditCard.getCardId() == cardId) {
                                foundCard = true;
                                break;
                            }
                        }
                    }
                    if (foundCard) {
//                      calling the method set credit limit to set the credit limit.
                        setCreditLimit(creditCard,newCreditLimit,newGracePeriod);
                        // update the bankCards array with the newly updated credit card object
                        bankCards.set(bankCards.indexOf(creditCard), creditCard);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please fill the correct Card Id");
                    }
                }
            }catch (NumberFormatException ex) {//this catches the exception and shows proper message in case of exception.
                JOptionPane.showMessageDialog(null, "Please fill the correct value for the fields");
            }
        });


//this is a button to cancel the credit card using the cancel credit method
        cancelBtn.addActionListener(e -> {
            //exception handling
            try {
                String cardIdForCreditCancel = cardIdForCreditTf.getText();

                //checks if the arraylist is empty
                if (bankCards.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please add credit card in Bank A/C first");
                } else if (cardIdForCreditCancel.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill up the fields");
                } else {
                        int cardID = Integer.parseInt(cardIdForCreditCancel);
                        boolean foundCardId = false;
                        CreditCard creditCard = null;
//                    It iterates over the "bankCards" ArrayList using the enhanced for loop syntax and checks each credit card object to find the one with the given card ID.
                        for (BankCard bankCard2 : bankCards) {
                            //usage of downcasting to access the object of bankcard
                            if (bankCard2 instanceof CreditCard) {
                                creditCard = (CreditCard) bankCard2;
                                if (creditCard.getCardId() == cardID) {
                                    foundCardId = true;
                                    break;
                                }
                            }
                        }
                        if(foundCardId){
                            //call the cancelcreditcard method from creditcard
                            cancelCreditCard(creditCard);
                            //updates the bankcard array with newly updated credit card object
                            bankCards.set(bankCards.indexOf(creditCard), creditCard);
                        } else {
                            JOptionPane.showMessageDialog(null, "Please enter the valid Card Id");
                        }
                }
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter the valid input");
            }
        });


//        this is a button that shows the frame for the display of the credit card after setcreditlimit and cancelcredit card
        displayCreditBtn.addActionListener(e -> {
            new DisplayForCredit(bankCards);
        });

        //this is a button that disposes off the frame of debitcard
        backCreditBtn.addActionListener(e -> {
            dispose();
        });

        //Button to clear all the text fields
        clearAllCreditBtn.addActionListener(e -> {
            clear();
        });

    }

    //    Method to clear all the text fields
    public void clear() {
        cardIdForCreditTf.setText("");
        gracePeriodForCreditTf.setText("");
        creditLimitForCreditTf.setText("");
    }

//a method to set the credit limit of credit card
    public void setCreditLimit(CreditCard creditCard,double newCreditLimit, int newGracePeriod){
        if (newCreditLimit >= 2.5 * creditCard.getBalanceAmount()){
            JOptionPane.showMessageDialog(null, "Your credit limit cannot be more than 2.3 times the balance amount.");
        }else {
            creditCard.setCreditLimit(newCreditLimit,newGracePeriod);//calling the setCreditLimit method from credit card.
            JOptionPane.showMessageDialog(null, "Your credit limit has been set.");
            clear();
        }
    }

//    a method to cancel the credit card
    public void cancelCreditCard(CreditCard creditCard){
        creditCard.cancelCreditCard();//calling the cancelcreditcard method from credit card
        JOptionPane.showMessageDialog(null, "Your credit card has been cancelled");
        clear();
    }
}