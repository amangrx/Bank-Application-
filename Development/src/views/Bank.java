package views;

import components.*;

import coursework.BankCard;
import coursework.DebitCard;
import coursework.CreditCard;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Bank extends  JFrame{
    //    Declaring the UI components of Bank.
    public MyCustomHeading bankCardLabel;
    public MyCustomSubHeading addDebitCdLabel, addCreditCdLabel;
    public MyCustomLabel clientNameLabel, cardIDLabel, issuerBankLabel, bankACLabel,blcAmtLabel,pinNmLabel,cvcNmLabel,interestLabel,creditLimitLabel,gracePeriodLabel,expDateLabel;
    public MyCustomTextField clientNameTF,cardIDTF,issuerBankTF,bankACTF,blcAmtTF,pinNmTF,cvcNmTF,interestTF;
    public MyCustomButton addDebitBtn, addCreditBtn,clearAllBtn,displayForCreditBtn,goBackBtn,displayForDebitBtn;
    public JComboBox expYrs,expMonths,expDays;
    //End of Declaration
//constructor of bank that takes arraylist of bank card as parameter
    public Bank(ArrayList<BankCard> bankCards) {
        super("Bank Card");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(900, 900);
        setLocationRelativeTo(null);
        setVisible(true);

//        initialization of UI components.
        bankCardLabel = new MyCustomHeading("Bank Card");

        addDebitCdLabel = new MyCustomSubHeading("Add a Debit Card");
        addCreditCdLabel = new MyCustomSubHeading("Add a Credit Card");

        clientNameLabel = new MyCustomLabel("Client Name");
        cardIDLabel = new MyCustomLabel("Card ID");
        issuerBankLabel = new MyCustomLabel("Issuer Bank");
        bankACLabel = new MyCustomLabel("Bank A/C");
        blcAmtLabel = new MyCustomLabel("Balance Amt");
        pinNmLabel = new MyCustomLabel("PIN Number");
        cvcNmLabel = new MyCustomLabel("CVC Number");
        interestLabel = new MyCustomLabel("Interest Rate");
        creditLimitLabel = new MyCustomLabel("Credit Limit");
        gracePeriodLabel = new MyCustomLabel("Grace Period");
        expDateLabel = new MyCustomLabel("Expiration Date");

        clientNameTF = new MyCustomTextField("");
        cardIDTF = new MyCustomTextField("");
        issuerBankTF = new MyCustomTextField("");
        bankACTF = new MyCustomTextField("");
        blcAmtTF = new MyCustomTextField("");
        pinNmTF = new MyCustomTextField("");
        cvcNmTF = new MyCustomTextField("");
        interestTF = new MyCustomTextField("");

        addDebitBtn = new MyCustomButton("Add Debit");
        addCreditBtn = new MyCustomButton("Add Credit");
        clearAllBtn = new MyCustomButton("Clear All");
        displayForCreditBtn = new MyCustomButton("Display Credit");
        goBackBtn = new MyCustomButton("Go Back");
        displayForDebitBtn = new MyCustomButton("Display Debit");

        String years[] = {"Select Date", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"};
        String months[] = {"Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String days[] = {"Select Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
                "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
                "27", "28", "29", "30", "31", "32"};
        expYrs = new JComboBox<>(years);
        expMonths = new JComboBox<>(months);
        expDays = new JComboBox<>(days);
//      end of initialization

//      adding the text fields labels and button using GridBagLayout to the Jframe.
        GridBagLayout gridBagLayoutForBank = new GridBagLayout();
        GridBagConstraints gbcForBank = new GridBagConstraints();
        setLayout(gridBagLayoutForBank);

        gbcForBank.gridx = 0;
        gbcForBank.gridy = 0;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 0, 30, 0);
        add(bankCardLabel, gbcForBank);

        gbcForBank.gridx = 0;
        gbcForBank.gridy = 1;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 0, 10, 150);
        add(clientNameLabel, gbcForBank);

        gbcForBank.gridx = 1;
        gbcForBank.gridy = 1;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 100, 10, 0);
        add(clientNameTF, gbcForBank);

        gbcForBank.gridx = 2;
        gbcForBank.gridy = 1;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 200, 10, 0);
        add(cardIDLabel, gbcForBank);

        gbcForBank.gridx = 3;
        gbcForBank.gridy = 1;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 215, 10, 0);
        add(cardIDTF, gbcForBank);

        gbcForBank.gridx = 0;
        gbcForBank.gridy = 2;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 0, 10, 150);
        add(issuerBankLabel, gbcForBank);

        gbcForBank.gridx = 1;
        gbcForBank.gridy = 2;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 100, 10, 0);
        add(issuerBankTF, gbcForBank);

        gbcForBank.gridx = 2;
        gbcForBank.gridy = 2;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 200, 10, 0);
        add(bankACLabel, gbcForBank);

        gbcForBank.gridx = 3;
        gbcForBank.gridy = 2;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 215, 10, 0);
        add(bankACTF, gbcForBank);

        gbcForBank.gridx = 0;
        gbcForBank.gridy = 4;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 0, 20, 150);
        add(blcAmtLabel, gbcForBank);

        gbcForBank.gridx = 1;
        gbcForBank.gridy = 4;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 100, 20, 0);
        add(blcAmtTF, gbcForBank);

        gbcForBank.gridx = 0;
        gbcForBank.gridy = 7;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 0, 30, 0);
        add(addDebitCdLabel, gbcForBank);

        gbcForBank.gridx = 0;
        gbcForBank.gridy = 9;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 0, 20, 150);
        add(pinNmLabel, gbcForBank);

        gbcForBank.gridx = 1;
        gbcForBank.gridy = 9;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 100, 20, 0);
        add(pinNmTF, gbcForBank);

        gbcForBank.gridx = 1;
        gbcForBank.gridy = 10;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 100, 20, 0);
        add(addDebitBtn, gbcForBank);

        gbcForBank.gridx = 3;
        gbcForBank.gridy = 10;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 250, 20, 0);
        add(displayForDebitBtn, gbcForBank);

        gbcForBank.gridx = 0;
        gbcForBank.gridy = 11;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 0, 30, 0);
        add(addCreditCdLabel, gbcForBank);

        gbcForBank.gridx = 0;
        gbcForBank.gridy = 13;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 0, 10, 150);
        add(cvcNmLabel, gbcForBank);

        gbcForBank.gridx = 1;
        gbcForBank.gridy = 13;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 100, 10, 0);
        add(cvcNmTF, gbcForBank);

        gbcForBank.gridx = 2;
        gbcForBank.gridy = 13;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 200, 10, 0);
        add(interestLabel, gbcForBank);

        gbcForBank.gridx = 3;
        gbcForBank.gridy = 13;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 215, 10, 0);
        add(interestTF, gbcForBank);

        gbcForBank.gridx = 0;
        gbcForBank.gridy = 15;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 0, 30, 150);
        add(expDateLabel, gbcForBank);

        gbcForBank.gridx = 1;
        gbcForBank.gridy = 15;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 40, 30, 0);
        add(expYrs, gbcForBank);

        gbcForBank.gridx = 2;
        gbcForBank.gridy = 15;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 60, 30, 0);
        add(expMonths, gbcForBank);

        gbcForBank.gridx = 3;
        gbcForBank.gridy = 15;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 150, 30, 0);
        add(expDays, gbcForBank);

        gbcForBank.gridx = 1;
        gbcForBank.gridy = 16;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 100, 50, 0);
        add(addCreditBtn, gbcForBank);

        gbcForBank.gridx = 3;
        gbcForBank.gridy = 16;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 250, 50, 0);
        add(displayForCreditBtn, gbcForBank);

        gbcForBank.gridx = 1;
        gbcForBank.gridy = 17;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 100, 20, 0);
        add(clearAllBtn, gbcForBank);

        gbcForBank.gridx = 3;
        gbcForBank.gridy = 17;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 250, 20, 0);
        add(goBackBtn, gbcForBank);
//end of gridbaglayout

//        this is a button that takes in required inputs from the text fields and
//        checks various condition and adds the debit card to arraylist of bankcard
        addDebitBtn.addActionListener(e -> {
            String balance = blcAmtTF.getText();
            String card = cardIDTF.getText();
            String bankAccount = bankACTF.getText();
            String issuerBank = issuerBankTF.getText();
            String clientName = clientNameTF.getText();
            String pin = pinNmTF.getText();
//          if condition to check whether the text fields are empty or not
            if (balance.equals("") || card.equals("") || bankAccount.equals("") || issuerBank.equals("") || clientName.equals("")) {
                JOptionPane.showMessageDialog( null, "Please fill the credentials for bank card");
//                condition to check the pin text field
            } else if (pin.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill the value for pin number.");
            } else {
                // exception handling
                try {
//                   changing the string values from text field into required double, int values.
                    double balanceAmount = Double.parseDouble(balance);
                    int cardId = Integer.parseInt(card);
                    int pinNumber = Integer.parseInt(pin);
//                    calling the parameterized constructor of Debit card
                    DebitCard debitCard = new DebitCard(cardId, balanceAmount, issuerBank, bankAccount, clientName, pinNumber);
                    bankCards.add(debitCard);//adding the object to Arraylist.
                    JOptionPane.showMessageDialog(null, "Debit Card added successfully");
                    clearForDebit();//method to clear the text fields.
                } catch (NumberFormatException ex) {//this catches the exception and shows proper message in case of exception.
                    JOptionPane.showMessageDialog(null,"Please enter the valid input for the fields");
                }
            }
        });

//        this is a button that shows the frame for the display of the object of debit card added to arraylist
        displayForDebitBtn.addActionListener(e -> {
            new DisplayForDebit(bankCards);
        });

//        this is a button that takes in required inputs from the text fields and
//        checks various condition and adds the credit card to arraylist of bankcard
        addCreditBtn.addActionListener(e -> {
            String balance = blcAmtTF.getText();
            String card = cardIDTF.getText();
            String bankAccount = bankACTF.getText();
            String issuerBank = issuerBankTF.getText();
            String clientName = clientNameTF.getText();
            String cvcNum = cvcNmTF.getText();
            String interestRt = interestTF.getText();
            String expirationDate = years[expYrs.getSelectedIndex()] + "-" + months[expMonths.getSelectedIndex()] + "-" + days[expDays.getSelectedIndex()];
//          if condition to check whether the text fields are empty or not
            if (balance.equals("") || card.equals("") || bankAccount.equals("") || issuerBank.equals("") || clientName.equals("") ) {
                JOptionPane.showMessageDialog(null, "Please fill the credentials for bank card");
            }else if(cvcNum.equals("") || interestRt.equals("") || expYrs.getSelectedIndex() == 0 || expMonths.getSelectedIndex() == 0 || expDays.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Please provide the inputs for credit.");
            }
            else {
                // exception handling
                try {
                    // changing the string values from text field into required double, int values.
                    double balanceAmount = Double.parseDouble(balance);
                    int cardId = Integer.parseInt(card);
                    int cvcNumber = Integer.parseInt(cvcNum);
                    int interestRate = Integer.parseInt(interestRt);
//                    calling the parameterized constructor of Credit card
                    CreditCard creditCard = new CreditCard(cardId, balanceAmount, issuerBank, bankAccount, clientName, cvcNumber, interestRate, expirationDate);
                    bankCards.add(creditCard);//adding the object to Arraylist.
                    JOptionPane.showMessageDialog(null, "Credit Card added successfully");
                    clearForCredit();//method to clear the text fields.
                }catch (NumberFormatException ex){//this catches the exception and shows proper message in case of exception
                    JOptionPane.showMessageDialog(null,"Please enter the valid input for the fields");
                }
            }
        });

//        this is a button that shows the frame for the display of the object of credit card added to arraylist
        displayForCreditBtn.addActionListener(e -> {
            new DisplayForCredit(bankCards);
        });

//        this is a button that disposes off the frame of bankcard
        goBackBtn.addActionListener(e -> {
            dispose();
        });

//        Button to clear all the text fields
        clearAllBtn.addActionListener(e -> {
            clear();
        });
    }


//    Method to clear all the text fields
    public void clear(){
            clientNameTF.setText("");
            cardIDTF.setText("");
            issuerBankTF.setText("");
            bankACTF.setText("");
            blcAmtTF.setText("");
            pinNmTF.setText("");
            cvcNmTF.setText("");
            interestTF.setText("");
            expYrs.setSelectedIndex(0);
            expMonths.setSelectedIndex(0);
            expDays.setSelectedIndex(0);
        }
        public void clearForDebit(){
            pinNmTF.setText("");
        }

        public void clearForCredit(){
            cvcNmTF.setText("");
            interestTF.setText("");
            expYrs.setSelectedIndex(0);
            expMonths.setSelectedIndex(0);
            expDays.setSelectedIndex(0);
        }
}