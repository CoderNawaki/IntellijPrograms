
@RestController
@RequestMapping("/transaction")

public class TransactionController{

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<Transaction>>getAllTransactions(){
        List<Transaction>transactions = transactionService.getAllTransactions();
        return ResponseEntity.ok(transactions);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Transaction>>searchTransactions(@RequestParam("keyword")String keyword){
        List<Transaction>matchingTransactions = transactionService.searchTransactions(keyword);
        return ResponseEntity.ok(matchingTransactions);
        
    }
}