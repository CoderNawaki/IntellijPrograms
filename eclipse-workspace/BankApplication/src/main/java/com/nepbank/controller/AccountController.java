

public class AccountController{

   @Autowired 
private AccountService accountService;

@GetMapping
public List<Account>getAllAccounts(){
    return accountService.getAllAccounts();
}

@GetMapping("/{id}")
public ResponseEntity<Account>getAccountById(@PathVariable Long id){
    
}

}