public class AdminAccount extends Account {

    public AdminAccount(String number, double balance, String customerName, String customerMail, String customerCellphone) {
        super(number, balance, customerName, customerMail, customerCellphone);
    }

    public void addCash(Account recieverCash, Double amount) {
        System.out.println("Previous account balance for " + recieverCash.getCustomerName() + " was " + recieverCash.balance);
        recieverCash.balance += amount;
        System.out.println("Current account balance for " + recieverCash.getCustomerName() + " is " + recieverCash.balance);
    }
}
