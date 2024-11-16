package views;

import coursework.BankCard;
import coursework.CreditCard;

import javax.swing.*;
import java.util.ArrayList;

public class DisplayForCredit extends JFrame {
    public DisplayForCredit(ArrayList<BankCard> bankCards){
        super(" Display Credit Cards");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

//        Array for the header of the table
        String[] columnNames = {"Card Id", "Bank Account", "Balance", "Client Name", "Card Type", "CVC Number", "Interest Rate","Expiration Date","isGranted","Credit Limit","Grace Period"};
//       arraylist of credit card
        ArrayList<CreditCard> creditCards =new ArrayList<>();
        for (BankCard bankCard : bankCards) {
            if (bankCard instanceof CreditCard) {
                creditCards.add((CreditCard) bankCard);
            }
        }
        String[][] dataForCredit = new String[creditCards.size()][11];
//        for loop to set the corresponding data of the headers in the table
        for (int i = 0; i < creditCards.size(); i++) {
            dataForCredit[i][0] = String.valueOf(creditCards.get(i).getCardId());
            dataForCredit[i][1] = String.valueOf(creditCards.get(i).getBankAccount());
            dataForCredit[i][2] = String.valueOf(creditCards.get(i).getBalanceAmount());
            dataForCredit[i][3] = String.valueOf(creditCards.get(i).getClientName());
            dataForCredit[i][4] = "Credit Card";
            dataForCredit[i][5] = String.valueOf(creditCards.get(i).getCVCNumber());
            dataForCredit[i][6] = String.valueOf(creditCards.get(i).getInterestRate());
            dataForCredit[i][7] = String.valueOf(creditCards.get(i).getExpirationDate());
            dataForCredit[i][8] = String.valueOf(creditCards.get(i).getIsGranted());
            dataForCredit[i][9] = String.valueOf(creditCards.get(i).getCreditLimit());
            dataForCredit[i][10] = String.valueOf(creditCards.get(i).getGracePeriod());
        }
//        initializing the table
        JTable table = new JTable(dataForCredit, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);
        add(panel);
    }
}
