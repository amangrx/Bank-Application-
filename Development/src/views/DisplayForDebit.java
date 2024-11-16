package views;

import coursework.BankCard;
import coursework.DebitCard;

import javax.swing.*;
import java.util.ArrayList;

public class DisplayForDebit extends JFrame {
    public DisplayForDebit(ArrayList<BankCard> bankCards){
        super(" Display Debit Cards");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
        //RESIZEABLE
        setResizable(false);
        setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        String[] columnNames = {"Card Id", "Bank Account", "Balance", "Client Name", "Card Type", "Pin", "Has Withdrawn","Date of withdrawal"};
        ArrayList<DebitCard> debitCards =new ArrayList<>();
        for (BankCard bankCard : bankCards) {
            if (bankCard instanceof DebitCard) {
                debitCards.add((DebitCard) bankCard);
            }
        }
        String[][] dataForDebit = new String[debitCards.size()][8];
//        for loop to set the corresponding data of the headers in the table
        for (int i = 0; i < debitCards.size(); i++) {
            dataForDebit[i][0] = String.valueOf(debitCards.get(i).getCardId());
            dataForDebit[i][1] = String.valueOf(debitCards.get(i).getBankAccount());
            dataForDebit[i][2] = String.valueOf(debitCards.get(i).getBalanceAmount());
            dataForDebit[i][3] = String.valueOf(debitCards.get(i).getClientName());
            dataForDebit[i][4] =  "Debit Card";
            dataForDebit[i][5] = String.valueOf(debitCards.get(i).getPinNumber());
            dataForDebit[i][6] = String.valueOf(debitCards.get(i).getHasWithdrawn());
            dataForDebit[i][7] = String.valueOf(debitCards.get(i).getDateOfWithdrawal());
        }
//        initializing the table
        JTable table = new JTable(dataForDebit, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane);
        add(panel);
    }
}
