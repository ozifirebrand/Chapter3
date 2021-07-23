package chapterThree;

public class Account {

    private String accountName;
    private double balance;

    public void setAccountName(String lastName, String firstName) {
        this.accountName = lastName + firstName;
    }

    public void setBalance(double moneyToBeDeposited) {
        balance = moneyToBeDeposited;
    }

    public String getAccountName() {
        System.out.println(accountName);
        return accountName;
    }

    public double getBalanceInAccount() {
       return balance;
    }

        public void withdraw ( double amountWithdrawn){
            if (balance - amountWithdrawn >= 10){
                balance = balance - amountWithdrawn;}
            else if(balance - amountWithdrawn <10){
                System.out.println("Insufficient funds! Your balance is " +balance);
            }
        }

        public void depositMoney ( double amountDeposited){
            balance = (balance + amountDeposited <= 500000) ? (balance+ amountDeposited) : balance;
            System.out.println(balance);
        }


    }