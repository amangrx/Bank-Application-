package coursework;

/**
     * This class(coursework.DebitCard) is the child class of coursework.BankCard.
     * @author (Aman Gurung)
     * @version (a version number or a date)
     */
    public class DebitCard extends BankCard
    {
        //declaring the variables 
        private int pinNumber;
        private int withdrawalAmount;
        private String dateOfWithdrawal;
        private boolean hasWithdrawn;
        
        /*
         * this is a constructor that accepts six parameters to set the attributes value
         * of the variables.
         */
        public DebitCard(int cardId, double balanceAmount , String issuerBank, String bankAccount, String clientName, int pinNumber)
        {
            //calling the constructor from the parent class
            super(cardId, balanceAmount , issuerBank , bankAccount);
            super.setClientName(clientName);
            //initializing the instance variable
            this.pinNumber = pinNumber;
            this.hasWithdrawn = false;
        }

        //defining a getter method for pinNumber
        public int getPinNumber()
        {
            return pinNumber;
        }
        
        //defining a getter method for wihtdrawalAmount
        public int getWithdrawalAmount()
        {
            return withdrawalAmount;
        }
        
        //defining a getter method for dateOfWithdrawal
        public String getDateOfWithdrawal()
        {
            return dateOfWithdrawal;
        }
        
        //defining a getter method for hasWithdrawn
        public boolean getHasWithdrawn()
        {
            return hasWithdrawn;
        }
        
        //defining a setter method for withdrawal 
        public void setWithdrawalAmount(int withdrawalAmount)
        {
            this.withdrawalAmount = withdrawalAmount;
        }
        
        //defining a method for withdraw
        public void withdraw( int pinNumber, int withdrawalAmount, String dateOfWithdrawal)
        {
            if (this.pinNumber == pinNumber ) {
                if(super.getBalanceAmount() >= withdrawalAmount){
                        hasWithdrawn = true;
                        setBalanceAmount(getBalanceAmount() - withdrawalAmount);
                        this.dateOfWithdrawal = dateOfWithdrawal;
                        this.withdrawalAmount = withdrawalAmount;
                    }
                else{
                        System.out.println("Insufficient balance");
                    }
            }
            else{
                System.out.println("Invalid PIN number!");
            }
        }
        
        // display method 
        protected void display()
        {
            super.display();
            System.out.println("Pin Number : "+ this.pinNumber);
            if (hasWithdrawn = true ) {
                System.out.println("Date Of Withdrawal: " + this.dateOfWithdrawal);
                System.out.println("Amount of withdrawal : " + this.withdrawalAmount);
            }
            else{
                System.out.println("Balance Amount: " + super.getBalanceAmount());
            }
        }
    }
    
    
