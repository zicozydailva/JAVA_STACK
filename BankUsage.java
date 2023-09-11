public class BankUsage {
    public static void main(String[] args) {
        Bank aduAccount = new Bank();
//        bank.setAccountBalance(1000);
        aduAccount.setAccountNumber(2118254182);
        aduAccount.setCustomerEmail("Zicozydasilva70@gmail.com");
        aduAccount.setCustomerName("Ogbu Ezekiel");
        aduAccount.setPhoneNumber(912163007);
        aduAccount.withdrawFromAccountBalance(25000);

        aduAccount.depositToAccountBalance(3100);
        aduAccount.bankDetailsInfo();
        aduAccount.balanceInfo();
    }
}
