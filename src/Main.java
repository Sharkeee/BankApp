public class Main {

    public static void main(String[] args) {

        Account firstAccount = new Account();
        Account momAccount = new Account("521332",130.0,"Halina","halina@o2.pl","123-123");
        Account adminAccount = new Account("13371",9000.0,"admin","admin@admin.com","333-333");
//        System.out.println("Account information: \n" +
//                firstAccount.getCustomerName() + "\n" +
//                firstAccount.getCustomerMail() + "\n" +
//                firstAccount.getCustomerCellphone() + "\n" +
//                firstAccount.getNumber() + "\n" +
//                firstAccount.getBalance() + "\n");

                //firstAccount.deposit();
                //firstAccount.withdraw();

               adminAccount.transferTo(firstAccount);
               adminAccount.transferTo(momAccount);
    }

}
