public class Main {

    public static void main(String[] args) {

        Account firstAccount = new Account();

        System.out.println("Account information: \n" +
                firstAccount.getCustomerName() + "\n" +
                firstAccount.getCustomerMail() + "\n" +
                firstAccount.getCustomerCellphone() + "\n" +
                firstAccount.getNumber() + "\n" +
                firstAccount.getBalance() + "\n");

                firstAccount.deposit(5.0);
    }

}
