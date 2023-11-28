public interface TransactionService{

    List<Transaction>getAllTransactions();
    List<Transaction>searchTransactions(String keyword);
}
