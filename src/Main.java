public class Main {

    public static void main(String[] args) {

        Account firstAccount = new Account();
        Account momAccount = new Account("521332",130.0,"Halina","halina@o2.pl","123-123");
        AdminAccount admin = new AdminAccount("13371",9000.0,"admin","admin@admin.com","333-333");


                    admin.addCash(firstAccount,5000.0);
//               firstAccount.transferTo(firstAccount);
//               momAccount.transferTo(momAccount);
    }

}
