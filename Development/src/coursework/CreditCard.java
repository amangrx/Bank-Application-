package coursework;

/**
     * The Credit Class is the child class of bank card.
     *
     * @author (Aman Gurung)
     * @version (a version number or a date)
     */
    public class CreditCard extends BankCard
    {
        //declaring the variables 
        private int cvcNumber;
        private double creditLimit;
        private double interestRate;
        private String expirationDate;
        private int gracePeriod;
        private boolean isGranted;
        
        /*
         * this is a constructor that accepts eight parameters to set the attribute values
         * of the variables.
         */
        public CreditCard(int cardId , double balanceAmount, String issuerBank, String bankAccount, String clientName, int cvcNumber, double interestRate, String expirationDate)
        {
            //calling constructor from parent class
            super(cardId, balanceAmount, issuerBank, bankAccount);
            super.setClientName(clientName);
            //initializing the instance variables
            this.cvcNumber = cvcNumber;
            this.interestRate = interestRate;
            this.expirationDate = expirationDate;
            this.isGranted = false;
        }
        
        //defining a getter method for cvcNumber
        public int getCVCNumber()
        {
                return cvcNumber;
        }
        
        //defining a getter method for creditLimit
        public double getCreditLimit()
        {
                return creditLimit;
        }
        
        //defining a getter method for interestRate
        public double getInterestRate()
        {
                return interestRate;
        }
        
        //defining a getter method for expirationDate
        public String getExpirationDate()
        {
                return expirationDate;
        }
        
        //defining a getter method for gracePeriod
        public int getGracePeriod()
        {
                return gracePeriod;
        }
        
        //defining a getter method for isGranted
        public boolean getIsGranted()
        {
                return isGranted;
        }
        
        //defining the setter method for the creditLimit
        public void setCreditLimit(double newCreditLimit, int newGracePeriod)
        {
            if (newCreditLimit <= (2.5 * super.getBalanceAmount())) {
                isGranted = true;
                this.creditLimit = newCreditLimit;
                this.gracePeriod = newGracePeriod;
            }
            else{
                System.out.println("The credit cannot be issued. Credit Limit should be less than or equal to 2.5 times the amount of balance.");
            }
        }
    
        //defining a method for cancelCreditCard
        public void cancelCreditCard() {
                cvcNumber = 0;
                creditLimit = 0; 
                gracePeriod = 0;
                isGranted = false;
        }
    
        //defining a method to display the details of the Credit Card
        protected void display()
        {
            super.display();
            System.out.println("The CVC Number is : " + this.cvcNumber);
            System.out.println("The interest rate is : " + interestRate);
            System.out.println("The expiration Date is : " + expirationDate);
            if (isGranted == true){
                System.out.println("The Credit Limit is : " + creditLimit);
                System.out.println("The grace period is : " + gracePeriod);
            } else {
                System.out.println("Your Credit Limit and Grace Period cannot be displayed.");
            }
        }
    }
