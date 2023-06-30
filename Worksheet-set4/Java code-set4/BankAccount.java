public class BankAccount {

    private int BankBalance;
    private int AccountNumber;
    private String accountHolderName;

    public int getBankBalance() {
        return BankBalance;
    }

    public void setBankBalance(int bankBalance) {
        BankBalance = bankBalance;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountHolderName("Devesh Gupta");
        bankAccount.setAccountNumber(1098377281);
        bankAccount.setBankBalance(00000);

        System.out.println("Account Holder name: " + bankAccount.getAccountHolderName());
        System.out.println("Bank account number: " + bankAccount.getAccountNumber());
        System.out.println("Bank balance: " + bankAccount.getBankBalance());

    }
}
	