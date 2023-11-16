

public interface AccountService{

    List<Account>getAllAccount();
    Account getAccountById(Long id);

    void saveAccount(Account account);
}