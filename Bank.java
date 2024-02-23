                                                                                            //Question 
/* Develop a Java program to create a class Bank that maintains two kinds of account for its customers, one called savings account and the other current account. 
The savings account provides compound interest and withdrawal facilities but no cheque book facility. The current account provides cheque book facility but no interest. 
Current account holders should also maintain a minimum balance and if the balance falls below this level, a service charge is imposed. Create a class Account that 
stores customer name, account number and type of account. From this derive the classes Cur-acct and Sav-acct to make them more specific to their requirements.
Include the necessary methods in order to achieve the following tasks: 
 a) Accept deposit from customer and update the balance. 
 b) Display the balance.
 c) Compute and deposit interest 
d) Permit withdrawal and update the balance Check for the minimum balance, impose penalty if necessary and update the balance.*/

                                                                                            //Code    
    
import java.util.Scanner;

class Account
{
    String customerName;
    long accountNumber;
    String accountType;
    double balance;

    public Account(String customerName, long accountNumber, String accountType, double balance)
{
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount)
{
        balance += amount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }

    public void displayBalance()
{
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class SavAcct extends Account
{
    public SavAcct(String customerName, long accountNumber, double balance)
{
        super(customerName, accountNumber, "Savings", balance);
    }

    public void computeAndDepositInterest(double rate)
{
        double interest = balance * rate / 100;
        balance += interest;
        System.out.println("Interest computed and deposited. Updated balance: " + balance);
    }

    public void withdraw(double amount)
{
        if (amount <= balance)
{
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        }
else
{
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

class CurrAcct extends Account
{
    double minimumBalance;
    double serviceCharge;

    public CurrAcct(String customerName, long accountNumber, double balance, double minimumBalance, double serviceCharge)
{
        super(customerName, accountNumber, "Current", balance);
        this.minimumBalance = minimumBalance;
        this.serviceCharge = serviceCharge;
    }

    private void checkMinimumBalance()
{
        if (balance < minimumBalance)
{
            balance -= serviceCharge;
            System.out.println("Minimum balance not maintained. Service charge imposed. Updated balance: " + balance);
        }
    }

    public void withdraw(double amount)
{
        if (amount <= balance)
{
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
            checkMinimumBalance();
        }
else
{
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}

public class Bank
{
    public static void main(String[] args)
{
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter customer name for Savings Account: ");
        String SCN = s1.nextLine();
        System.out.print("Enter account number for Savings Account: ");
        long SAN = s1.nextLong();
        System.out.print("Enter initial balance for Savings Account: ");
        double SIB = s1.nextDouble();
        SavAcct SA = new SavAcct(SCN, SAN, SIB);

        System.out.print("Enter customer name for Current Account: ");
        String CCN = s1.next();
        System.out.print("Enter account number for Current Account: ");
        long CAN = s1.nextLong();
        System.out.print("Enter initial balance for Current Account: ");
        double CIB = s1.nextDouble();
        System.out.print("Enter minimum balance for Current Account: ");
        double MB = s1.nextDouble();
        System.out.print("Enter service charge for Current Account: ");
        double SC = s1.nextDouble();
        CurrAcct CA = new CurrAcct(CCN, CAN, CIB, MB, SC);


        System.out.print("Enter deposit amount for Savings Account: ");
        double SDA = s1.nextDouble();
        SA.deposit(SDA);

        System.out.print("Enter interest rate for Savings Account: ");
        double SIR = s1.nextDouble();
        SA.computeAndDepositInterest(SIR);

        System.out.print("Enter withdrawal amount for Savings Account: ");
        double SWA = s1.nextDouble();
        SA.withdraw(SWA);

        System.out.print("Enter deposit amount for Current Account: ");
        double CDA = s1.nextDouble();
        CA.deposit(CDA);

        System.out.print("Enter withdrawal amount for Current Account: ");
        double CWA = s1.nextDouble();
        CA.withdraw(CWA);

       
        System.out.println("\nFinal Balances:");
        System.out.println("Savings Account:");
        SA.displayBalance();

        System.out.println("\nCurrent Account:");
        CA.displayBalance();

    }
}
