import java.util.*;
import java.io.IOException;
import java.util.HashMap;
import java.text.DecimalFormat;

public class AtmMenu extends Account {
    Scanner sc=new Scanner(System.in);
    DecimalFormat formatt=new DecimalFormat("'$'###,##0.00");
    HashMap<Integer,Integer> data= new HashMap<>();
    
    public void Login() throws IOException{
        int x=1;
        do{
            try{
                data.put(1234,5678);
                data.put(1604,2003);
                
                System.out.println("WELCOME TO ATM!!");
                System.out.println("Enter the Customer Number: ");
                setCustomerNumber(sc.nextInt());

                System.out.println("Enter the Pin NUmber: ");
                setPinNumber(sc.nextInt());
            }
            catch (Exception e){
                System.out.println("\n"+"Invalid Number!!, Only Numbers are Allowed.."+"\n");
                x=2;
            }
            
            int s=getCustomerNumber();
            int p=getPinNumber();
            if(data.containsKey(s) && data.get(s) == p){
                getAccountType();
            }
            else{
                System.out.println("\n"+"Wrong Customer or Pin Number."+"\n");
            }
        }
        while(x==1);
    }

    public void getAccountType(){
        System.out.println("Select the Account Type to Access: ");
        System.out.println("Type-1 : Check Account");
        System.out.println("Type-2 : Saving Account");
        System.out.println("Type-3 : Exit");

        int select=sc.nextInt();

        switch (select) {
            case 1:
                getCheck();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank You!!!");
                break;
            default:
                System.out.println("Invalid choice");
                getAccountType();
        }
    }

    public void getCheck(){
        System.out.println("Checking Account: ");
        System.out.println("Type-1 : View Balance");
        System.out.println("Type-2 : Withdraw Money.");
        System.out.println("Type-3 : Deposite Money");
        System.out.println("Type-4 : Exit");

        int select=sc.nextInt();
        switch (select) {
            case 1:
                System.out.println("Account Balance : "+formatt.format(getCheckBalance()));
                getAccountType();
                break;
            case 2:
                getCheckWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You!!");
                break;
            default:
                System.out.println("Invalid Choice");
                getCheck();
                break;
        }
    }

    public void getSaving(){
        System.out.println("Saving Account: ");
        System.out.println("Type-1 : View Balance");
        System.out.println("Type-2 : Withdraw Money");
        System.out.println("Type-3 : Deposite Money");
        System.out.println("Type-4 : Exit");

        int select=sc.nextInt();
        switch (select) {
            case 1:
                System.out.println("Saving Account Balance: "+formatt.format(getSavingBlance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositeInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You!!");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}