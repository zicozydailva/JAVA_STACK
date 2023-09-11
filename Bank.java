public class Bank {
    private int accountNumber = 12345;
    private int accountBalance = 20000;
    private  String customerName = "John Doe";
    private String customerEmail = "John@gmail.com";
    private  int phoneNumber = 234;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void depositToAccountBalance(int depositBalance) {
       accountBalance += depositBalance;
       System.out.println("Deposit " + depositBalance + "Successful");
    }
    public void withdrawFromAccountBalance(int withdrawBalance) {
        if(accountBalance - withdrawBalance < 0) {
            System.out.println("Insufficient Funds!!");
        } else {
            accountBalance -= withdrawBalance;

            System.out.println("Withdraw Funds successful!!");
            System.out.println("Current balance" + " " + accountBalance);

        }
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void bankDetailsInfo() {
        System.out.println(customerName + "Customer Name " + " " + customerEmail + " " + accountNumber + " " + accountBalance + " " + phoneNumber);
    }

    public void balanceInfo() {
        System.out.println(customerName + "Customer Name " + " " + accountBalance + " " + " - Current Balance");
    }
}
