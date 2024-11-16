package views;

import components.MyCustomButton;
import components.MyCustomHeading;
import components.MyCustomLabel;
import components.MyCustomTextField;
import coursework.BankCard;
import coursework.DebitCard;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Debit extends JFrame {
    //    Declaring the UI components of Debit.
    public MyCustomHeading debitCardLabel;
    public MyCustomLabel cardIdDCLabel, withdrawalAmtLabel, pinNumberDCLabel, withdrawalDateLabel;
    public MyCustomTextField cardIDForDcTf, withdrawalAmtTf, pinNmTf;
    public MyCustomButton withdrawBtn, displayDCBtn, clearAllDCBtn, backBtn;
    public JComboBox withdrawalYrs, withdrawalMonth, withdrawalDays;
    //End of Declaration

//constructor of debit that takes arraylist of bank card as parameter
    public Debit(ArrayList<BankCard> bankCards) {
        setTitle("Debit Card");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setVisible(true);

        //        initialization of UI components.
        debitCardLabel = new MyCustomHeading("Debit Card");

        cardIdDCLabel = new MyCustomLabel("Card ID");
        withdrawalAmtLabel = new MyCustomLabel("Withdrawal Amount");
        pinNumberDCLabel = new MyCustomLabel("PIN Number");
        withdrawalDateLabel = new MyCustomLabel("Withdrawal Date");

        cardIDForDcTf = new MyCustomTextField("");
        withdrawalAmtTf = new MyCustomTextField("");
        pinNmTf = new MyCustomTextField("");

        withdrawBtn = new MyCustomButton("Withdraw");
        displayDCBtn = new MyCustomButton("Display");
        clearAllDCBtn = new MyCustomButton("Clear All");
        backBtn = new MyCustomButton("Back");

        String years[] = {"Select Date", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"};
        String months[] = {"Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String days[] = {"Select Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
                "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
                "27", "28", "29", "30", "31", "32"};
        withdrawalYrs = new JComboBox<>(years);
        withdrawalMonth = new JComboBox<>(months);
        withdrawalDays = new JComboBox<>(days);
//      end of initialization

//      adding the text fields labels and button using GridBagLayout to the Jframe.

        GridBagLayout gridBagLayoutForDebit = new GridBagLayout();
        GridBagConstraints gbcForDebit = new GridBagConstraints();
        setLayout(gridBagLayoutForDebit);

        gbcForDebit.gridx = 0;
        gbcForDebit.gridy = 0;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 0, 50, 0);
        add(debitCardLabel, gbcForDebit);

        gbcForDebit.gridx = 0;
        gbcForDebit.gridy = 2;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 0, 20, 150);
        add(cardIdDCLabel, gbcForDebit);

        gbcForDebit.gridx = 1;
        gbcForDebit.gridy = 2;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 100, 20, 0);
        add(cardIDForDcTf, gbcForDebit);

        gbcForDebit.gridx = 0;
        gbcForDebit.gridy = 3;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 0, 20, 150);
        add(withdrawalAmtLabel, gbcForDebit);

        gbcForDebit.gridx = 1;
        gbcForDebit.gridy = 3;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 100, 20, 0);
        add(withdrawalAmtTf, gbcForDebit);

        gbcForDebit.gridx = 0;
        gbcForDebit.gridy = 4;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 0, 20, 150);
        add(pinNumberDCLabel, gbcForDebit);

        gbcForDebit.gridx = 1;
        gbcForDebit.gridy = 4;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 100, 20, 0);
        add(pinNmTf, gbcForDebit);

        gbcForDebit.gridx = 0;
        gbcForDebit.gridy = 5;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 0, 50, 150);
        add(withdrawalDateLabel, gbcForDebit);

        gbcForDebit.gridx = 1;
        gbcForDebit.gridy = 5;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 40, 50, 0);
        add(withdrawalYrs, gbcForDebit);

        gbcForDebit.gridx = 2;
        gbcForDebit.gridy = 5;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 30, 50, 0);
        add(withdrawalMonth, gbcForDebit);

        gbcForDebit.gridx = 3;
        gbcForDebit.gridy = 5;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 100, 50, 0);
        add(withdrawalDays, gbcForDebit);

        gbcForDebit.gridx = 1;
        gbcForDebit.gridy = 6;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 50, 70, 50);
        add(withdrawBtn, gbcForDebit);

        gbcForDebit.gridx = 0;
        gbcForDebit.gridy = 8;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 0, 20, 200);
        add(displayDCBtn, gbcForDebit);

        gbcForDebit.gridx = 1;
        gbcForDebit.gridy = 8;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 100, 20, 50);
        add(clearAllDCBtn, gbcForDebit);

        gbcForDebit.gridx = 2;
        gbcForDebit.gridy = 8;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 150, 20, 0);
        add(backBtn, gbcForDebit);
//end of gridbaglayout

//        this is a button that takes in required inputs from the text fields and
//        checks various condition and calls the withdraw method to deduct the withdrawal amount from balance amount
        withdrawBtn.addActionListener(e -> {
            try {
                String cardIdForDebit = cardIDForDcTf.getText();
                String withdrawalAmtForDebit = withdrawalAmtTf.getText();
                String pinNumberForDebit = pinNmTf.getText();
                String dateOfWithdrawal = years[withdrawalYrs.getSelectedIndex()] + "-" + months[withdrawalMonth.getSelectedIndex()] + "-" + days[withdrawalDays.getSelectedIndex()];

                //if condition to check whether the arraylist is empty or not
                if(bankCards.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please add debit card in Bank A/C first");
                }
                //condition to check if the text fields are empty or not
                else if(cardIdForDebit.isEmpty() || withdrawalAmtForDebit.isEmpty() || pinNumberForDebit.isEmpty() || withdrawalYrs.getSelectedIndex() == 0 ||withdrawalMonth.getSelectedIndex() == 0||withdrawalDays.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Please fill all the fields");
                } else {
    //              changing the string values from text fields into required double, int values.
                    int cardId = Integer.parseInt(cardIdForDebit);
                    int pinNumber = Integer.parseInt(pinNumberForDebit);
                    int withdrawalAmount = Integer.parseInt(withdrawalAmtForDebit);
                    boolean foundCard = false;
                    DebitCard debitCard = null;
                    // find the DebitCard object with the given cardId
    //              It iterates over the "bankCards" ArrayList using the enhanced for loop syntax and checks each DebitCard object to find the one with the given card ID.
                    for (BankCard bankCard1 : bankCards) {
                        //usage of downcasting to access the object of bankcard
                        if (bankCard1 instanceof DebitCard) {
                            debitCard = (DebitCard) bankCard1;
                            if (debitCard.getCardId() == cardId) {
                                foundCard = true;
                                break;
                            }
                        }
                    }
                    if (foundCard) {
//                        calling the method withdraw
                        withdraw(debitCard, pinNumber, withdrawalAmount, dateOfWithdrawal);
//                        update the bankCards array with the newly updated debit card object
                        bankCards.set(bankCards.indexOf(debitCard), debitCard);
                    } else {
                        JOptionPane.showMessageDialog(null, "Card not found.Please enter valid card Id.");
                    }
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Please input valid number.");
            }
        });

//        this is a button that shows the frame for the display of the debitcard after withdrawal
        displayDCBtn.addActionListener(e -> {
            new DisplayForDebit(bankCards);
        });

        //this is a button that disposes off the frame of debitcard
        backBtn.addActionListener(e -> {
            dispose();
        });

        //Button to clear all the text fields
        clearAllDCBtn.addActionListener(e -> {
            clear();
        });
    }


    //    Method to clear all the text fields
    public void clear() {
        cardIDForDcTf.setText("");
        pinNmTf.setText("");
        withdrawalAmtTf.setText("");
        withdrawalYrs.setSelectedIndex(0);
        withdrawalMonth.setSelectedIndex(0);
        withdrawalDays.setSelectedIndex(0);
        }

//        Method to withdraw money
        public void withdraw(DebitCard debitCard,int pinNumber, int withdrawalAmount, String dateOfWithdrawal){
//        checking the pin of bank card with debit card
            if(debitCard.getPinNumber() == pinNumber){
//              checking whether the balance amount is smaller than withdrawal amount or not.
                if(debitCard.getBalanceAmount() < withdrawalAmount){
                    JOptionPane.showMessageDialog(null, "Withdrawal Amount cannot be greater than balance amount.");
                    return;
                }
//               calling the withdraw method from debit card
                debitCard.withdraw(pinNumber,withdrawalAmount,dateOfWithdrawal);
                JOptionPane.showMessageDialog(null, "Withdrawal of amount is successful");
                clear();
            }else{
                JOptionPane.showMessageDialog(null, "Please enter the correct pin number");
            }
        }
}