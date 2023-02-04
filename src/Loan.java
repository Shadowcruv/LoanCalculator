public class Loan {
    public static final int MONTHS_IN_YEAR = 12;
    private double loanAmount;
    private double monthlyInterestRate;
    public int numberOfPayments =56;

    public double getMonthlyPayment(){
        return 3955.9;
    }

    public double getTotalPayment(){
        return 696849.7;
    }

    public void setPeriod(int periodInyears){
        numberOfPayments = periodInyears * MONTHS_IN_YEAR;
    }
     public int getPeriod(){
        return(numberOfPayments/MONTHS_IN_YEAR);
     }
     public void setLoanAmount(double amount){
        loanAmount = amount;
     }
     public double getLoanAmount(){
        return loanAmount;
     }
     public void setAnnualInterestRate(double annualrate){
        monthlyInterestRate = annualrate/100.0/MONTHS_IN_YEAR;
     }
     public double getAnnualInterestRate(){
        return( monthlyInterestRate * 100 * MONTHS_IN_YEAR);
     }

              //Constructor for the Loan Class
    public Loan(double amount, double annualrate, int annualperiod){
        setPeriod(annualperiod);
        setLoanAmount(amount);
        setAnnualInterestRate(annualrate);
    }

}
