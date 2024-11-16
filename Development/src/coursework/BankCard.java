package coursework;

/**
     * This class coursework.BankCard is the parent class of coursework.DebitCard class and coursework.CreditCard class.
     *
     * @author (Aman Gurung)
     * @version (a version number or a date)
     */
    public class BankCard
    {
          //declaring the instance variables.  
          private int cardId ;
          private double balanceAmount;
          private String bankAccount;
          private String issuerBank;
          private String clientName;
          
          /*
           *  this is a constructor that accepts four parameters i.e. balanceAmount, cardId,
           bankAccount and issuerBank to set the attributes values for variables balanceAmount,
           cardId, bankAccount and issuerBank.
          */
         
          public BankCard(int cardId, double balanceAmount, String issuerBank, String bankAccount)
          {
              //initializing the instance variables
              this.cardId = cardId; 
              this.balanceAmount = balanceAmount;
              this.bankAccount = bankAccount;
              this.issuerBank = issuerBank;
              this.clientName="";
          }
          
          //defining a getter method for cardId
          public int getCardId()
          {
            return cardId;
          }
          
          //defining a getter method for balanceAmount
          public double getBalanceAmount()
          {
            return balanceAmount;
          }
          
          //defining a getter method for bankAccount
          public String getBankAccount()
          {
            return bankAccount;
          }
          
          //defining a getter method for issuerBank
          public String getIssuerBank()
          {
            return issuerBank;
          }
          
          //defining a getter method for clientName
          public String getClientName()
          {
            return clientName;
          }
          
          //defining a setter method for clientName
          public void setClientName(String newClientName)
          {
              this.clientName = newClientName;
          }
          
          //defining a setter method for balanceAmount
          public void setBalanceAmount(double newBalanceAmount)
          {
              this.balanceAmount = newBalanceAmount;
          }
          
          //this method is used to display the output
          protected void display()
          {
              if(clientName ==  ""){
                  System.out.println("The name of the client is not assigned. ");
              }
              else{
                  System.out.println("The client name is " + this.clientName);
                  System.out.println("The card ID is " + this.cardId);
                  System.out.println("The bank account is " + this.bankAccount);
                  System.out.println("The issuer bank is " + this.issuerBank);
                  System.out.println("The balanceAmount is " + this.balanceAmount);
              }
          }      
    }
