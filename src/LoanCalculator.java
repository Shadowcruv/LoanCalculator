
import java.util.*;
public class LoanCalculator {
private Loan loan;
public int figur;
              Loan loan6= new Loan(45545,45,56);//data member
    public LoanCalculator(){   //constructor
    loan = new Loan(0,0,0);//45,44,6);

    }

    private void describeProgram(){                       //private access methods
        System.out.println("inside describeProgram");            //TEMP
    }
    private void getInput(){
        double loanAmount, annualInterestRate ; int loanPeriod;
        Scanner scanner = new Scanner(System.in);
        System.out.print("LoanAmount = ");

        loanAmount = scanner.nextDouble();
        System.out.print("LoanPeriod = ");
        loanPeriod = scanner.nextInt();
        System.out.print("annualInterestRate = ");
        annualInterestRate = scanner.nextDouble();
          //create a new loan with the input values
        Loan loan = new Loan(loanAmount,annualInterestRate, loanPeriod);
        System.out.println("Loan amount: "+ loan.getLoanAmount() + "\n" + "Loan Period : "+ loan.getPeriod() +
                "\n"+ "Loan AnnualRate: " + loan.getAnnualInterestRate() );   //TEMP
    }
    private void computePayment(){
        System.out.println("inside computePayment " );             //TEMP
    }
    private void displayOutput(){
        System.out.println("Monthly Payment = " +loan.getMonthlyPayment() + "\n" +
             "Total Payment = "   + loan.getTotalPayment() + figur );

    }

    public void start(){
        describeProgram();
        getInput();
        computePayment();
        displayOutput();
    }
    public static void main(String[] name){
        LoanCalculator calculator;
        Loan loan2 = new Loan(23,5,4);
        calculator = new LoanCalculator();
        calculator.start();

        //System.out.println("Loan Monthly Payment : "+ loan2.getMonthlyPayment() + "\n"+ loan2.getTotalPayment());

    }

}
