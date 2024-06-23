import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {
    private int customerNumber;
    private int pinNumber;
    private double checkBalance=0;
    private double savingBalance=0;

    Scanner sc=new Scanner(System.in);
    DecimalFormat formattt=new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNumber){
        this.customerNumber=customerNumber;
        return customerNumber;
    }
    public int getCustomerNumber(){
        return customerNumber;
    }

    public int setPinNumber(int pinNumber){
        this.pinNumber=pinNumber;
        return pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }

    public double getCheckBalance(){
        return checkBalance;
    }
    public double getSavingBlance(){
        return savingBalance;
    }

    public double calCheckWithdraw(double amount){
        checkBalance=(checkBalance-amount);
        return checkBalance;
    }
    public double calSavingWithdraw(double amount){
        savingBalance=(savingBalance-amount);
        return savingBalance;
    }
    public double calCheckDeposit(double amount){
        checkBalance=(checkBalance+amount);
        return checkBalance;
    }
    public double calSavingDeposit(double amount){
        savingBalance=(savingBalance+amount);
        return savingBalance;
    }
    
    public void getCheckWithdrawInput(){
        System.out.println("Checking Account Balance : "+formattt.format(checkBalance));
        System.out.println("Amount you want to Withdraw : ");
        double amount=sc.nextDouble();
        if((checkBalance-amount)>=0){
            calCheckWithdraw(amount);
            System.out.println("New Balance of check Account : "+formattt.format(checkBalance));
        }
        else{
           System.out.println("Balance Cannot be Negative.");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance : "+formattt.format(savingBalance));
        System.out.println("Amount you want to Withdraw from Saving Account: ");
        double amount=sc.nextDouble();

        if((savingBalance-amount)>=0){
            calSavingWithdraw(amount);
            System.out.println("New Balance of Saving Account : "+formattt.format(savingBalance));
        }
        else{
            System.out.println("Balance cannot be Negative.");
        }
    }

    public void getCheckDepositInput(){
        System.out.println("Checking Account Balance : "+formattt.format(checkBalance));
        System.out.println("Amount you want to Deposit from Checking Account : ");
        double amount=sc.nextDouble();

        if((checkBalance+amount)>=0){
            calCheckDeposit(amount);
            System.out.println("New checking Balance: "+formattt.format(checkBalance));
        }
        else{
            System.out.println("Balance Cannot Be Negative.");
        }
    }

    public void getSavingDepositeInput(){
        System.out.println("Saving Account Balance : "+formattt.format(savingBalance));
        System.out.println("Amount you want to Deposite from Saving Account : ");
        double amount=sc.nextDouble();

        if((savingBalance)>=0){
            calSavingDeposit(amount);
            System.out.println("New Saving Account Balance : "+formattt.format(savingBalance));
        }
        else{
            System.out.println("Balance Cannot be Negative.");
        }
    }
}
