public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerMail;
    private String customerCellphone;


    public Account() {
        this("00000", 2.5, "Przemek Kijak", "kijak@gmail.com", "79023176");
    }

    public Account(String number, double balance, String customerName, String customerMail, String customerCellphone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerMail = customerMail;
        this.customerCellphone = customerCellphone;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public String getCustomerCellphone() {
        return customerCellphone;
    }

    public void deposit(double depositValue) {
        this.balance += depositValue;
        System.out.println("Desposit successfull - " + depositValue);
        System.out.println("[" + this.number + "] Your account balance is: " + this.balance);

    }
}






