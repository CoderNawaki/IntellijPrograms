public class TransactionServiceImpl implements TransactionService{


    @Autowired
    private TransactionRepository TransactionRepository;

    @Override
    public List<Transaction> getAllTransactions(){
        return TransactionRepository.findAll();
    }

    @Override
    public List<Transaction>searchTransactions(String keyword){
        return TransactionRepository.findByDescriptionContainingIgnoreCase(keyword);
    }

}