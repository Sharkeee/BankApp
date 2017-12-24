import javax.swing.*;

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

    public void deposit() {
        double depositAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "How much you want to deposit?", "[" + this.number + "] Deposit", JOptionPane.WARNING_MESSAGE));
        this.balance += depositAmount;
        System.out.println("Desposit successfull - " + depositAmount);
        System.out.println("[" + this.number + "] Your account balance is: " + this.balance);
    }

    public void withdraw() {
        double withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "How much you want to withdraw?", "[" + this.number + "] Withdraw", JOptionPane.QUESTION_MESSAGE));
        if ((balance - withdrawAmount) < 0) {
            System.out.println("[" + this.number + "] You want too much cash!");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("["+this.number+"] Withdraw successfull");
            System.out.println("["+this.number+"] Current amount on your account is: " + this.balance);
        }
    }

    public void transferTo(Account reciever) {
        String transferAmount = JOptionPane.showInputDialog(null,"How much do you want to send for [" + reciever.number + "]?","Transfer Amount",JOptionPane.QUESTION_MESSAGE);
        
    }
}






