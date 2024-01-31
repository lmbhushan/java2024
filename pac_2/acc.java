package pac_2;

class Account {                                                           
	    private String accountNumber;
	    protected double balance;

	    public Account(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public boolean withdraw(double amount) {
	        if (amount <= balance) 
	        {
	            balance -= amount;
	            return true;
	        } 
	        else
	        {
	            System.out.println("Insufficient funds");
	            return false;
	        }
	    }
	}

	class SavingsAcc extends Account {
	    private final double minBalance;

	    public SavingsAcc(String accountNumber, double balance, double minBalance)
	    {
	        super(accountNumber, balance);
	        this.minBalance = minBalance;
	    }

	    @Override
	    public boolean withdraw(double amount) {
	        if (super.withdraw(amount)){
	            if (balance >= minBalance)
	            {
	                return true;
	            }
	            else 
	            {
	                System.out.println("Withdrawal not allowed due to minimum balance");
	                balance += amount; 
	                return false;
	            }
	        }
	        return false;
	    }
	}

	class CurrentAcc extends Account{
	    private double overdraftLimit;

	    public CurrentAcc(String accountNumber, double balance, double overdraftLimit)
	    {
	        super(accountNumber, balance);
	        this.overdraftLimit = overdraftLimit;
	    }

	    @Override
	    public boolean withdraw(double amount)
	    {
	        if (amount <= balance + overdraftLimit)
	        {
	            balance -= amount;
	            return true;
	        } 
	        else
	        {
	            System.out.println("Withdrawal not allowed due to overdraft limit.");
	            return false;
	        }
	    }
	}

	public class acc{
	    public static void main(String[] args) {
	        SavingsAcc save = new SavingsAcc("SB123", 5000, 200);
	        CurrentAcc current = new CurrentAcc("SB456", 300, 200);

	        save.withdraw(300); 
	        current.withdraw(700); 

	        System.out.println("Savings Account Balance: " + save.balance); 
	        System.out.println("Current Account Balance: " + current.balance); 
	    }
	}


