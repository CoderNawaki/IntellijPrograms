

public class AccountController{

@Autowired 
private AccountService accountService;

@GetMapping
public ResponseEntity<List<Account>>getAllAccounts(){
    List<Account> accounts =accountService.getAllAccounts();

    return ResponseEntity.ok(accounts);
}

@GetMapping("/{id}")
public ResponseEntity<Account>getAccountById(@PathVariable Long id){
    Account account = accountService.getAccountById(id);

    if(account!=null){
        return ResponseEntity.ok(account);

    }else{
        return ResponseEntity.notFound().build();
    }

}

@PostMapping
public ResponseEntity<String> createAccount(@RequestBody Account account){
    if(account.getBalance()<0){
        return ResponseEntity.badRequest().body("Balance must be non-negative");

    }

    accountService.saveAccount(account);
    return ResponseEntity.status(HttpStatus.CREATED).body("Account created successfully");

}

@PutMapping("/{id}"){
public ResponseEntity<String>updateAccount(@PathVariable Long id, @RequestBody Account account){
    Account existingAccount = accountService.getAccountById(id);
    if(existingAccount!=null){
        //update account properties as needed.
        existingAccount.setBalance(account.getBalance());
        accountService.saveAccount(existingAccount);
        return ResponseEntity.ok("Account updated successfully");
    }else{
        return ResponseEntity.notFound().build();
    }
}

@DeleteMapping("/{id}")
public ResponseEntity<String> deleteAccount(@PathVariable Long id ){
    Account existingAccount = accountService.getAccountById(id);
    if(existingAccount!=null){
        accountService.deleteAccount(id);
        return ResponseEntity.ok("account deleted successfully");

    }else{
        return ResponseEntity.notFound().build();
    }
}
}

}