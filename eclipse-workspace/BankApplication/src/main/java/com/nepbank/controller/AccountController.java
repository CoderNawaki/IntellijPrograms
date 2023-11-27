

public class AccountController{

@Autowired 
private AccountService accountService;

@Autowired
private UserController userController;


@PostMapping("/deposit/{accountId}/{amount}")
public ResponseEntity<String>deposit(@PathVariable Long accountId,@PathVariable double amount){
    Account account =. accountService.getAccountById(accountId);
    if(account!=null){
        account.setBalance(account.getBalance()+amount);
        accountService.saveAccount(account);

        //notify user about the deposit
        userController.notifyUser("Deposit of"+amount+" to Account"+account.getAccountNumber()+" completed.");

        return ResponseEntity.ok("Deposit completed.");

    }else{
        return ResponseEntity.notFound().build();
    }
}

@PostMapping("/withdraw/{accountId}/{amount}")
public ResponseEntity<String> withdraw(@PathVariable Long accountId,@PathVariable double amount){
    Account account = accountService.getAccountById(accountId);
    if(account!=null && account.getBalance() >=amount){
        account.setBalance(account.getBalanc() - amount);
        accountService.saveAccount(account);

        //notify the user about the withdrawal

        userController.notifyUser("Withdrawal of "+amount + " from Account "+ account.getAccountNumber());
        return ResponseEntity.ok("Withdrawal completed.");

    }else{
        return ResponseEntity.badRequest().body("Insufficient funds.");
    }
}

@PostMapping("/transfer/{sourceAccountId}/{targetAccountId}/{amount}")
public ResponseEntity<String> transfer(@PathVariable Long sourceAccountId, @PathVariable Long targetAccountId,@PathVariable double amount){
    Account sourceAccount = accountService.getAccountById(sourceAccountId);
    Account targetAccount = accountService.getAccountById(targetAccountId);

    if(sourceAccount!=null && targetAccount!=null && sourceAccount.getBalance()>=amount){
        sourceAccount.setBalance(sourceAccount.getBalance()-amount);
        targetAccount.setBalance(targetAccount.getBalance() + amount);

        accountService.saveAccount(sourceAccount);
        accountService.saveAccount(targetAccount);
        //notify user about the transfer

        userController.notifyUser("Transfer of "+amount+ "from Account "+ sourceAccount.getAccountNumber()+
        " to Account" + targetAccount.getAccountNumber()+ " completed. ");

        return ResponseEntity.ok("Transfer completed.");


    }else{
        return ResponseEntity.badRequest().body("Invalid transfer or insufficient funds.");
    }
} 


    
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