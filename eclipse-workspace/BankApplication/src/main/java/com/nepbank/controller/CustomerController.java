
@RestController
@RequestMapping("/users")
public class CustomerController{
    

    @Autowired
    private UserService userService;

    @Autowired
    private AccountService AccountService;


    @GetMapping("/current")
    public ResponseEntity<User>getCurrentUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        User currentUser = userService.getUserByUsername(username);

        if(currentUser!=null){
            return ResponseEntity.ok(currentUser);
        }else{
            return ResponseEntity.notFound().build();
        }

    }
    @GetMapping("/current/accounts")
    public ResponseEntity<List<Account>>getCurrentUserAccounts(){
        Authenticaton authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        User currentUser = userService.getUserByUsername(username);

        if(currentUser!=null){
            List<Account>accounts = AccountService.getAccountsByUser(currentUser);
            return ResponseEntity.ok(accounts);

        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping
    public List<User>getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user){
        userService.saveUser(user);
        notifyUser("User created successFully: "+user.getUserName());
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully!");
    }

    private void notifyUser(String message){
        //store the notification message in a session attribute
        RequestContext.getCurrentInstance().getSessionMap().put("notification",message);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Long id,@RequestBody User user){
        User existingUser =userService.getUserById(id);
        if(existingUser!=null){
            //update user properties as needed.
            existingUser.setUsername(user.getUsername());
            existingUser.setPassword(user.getPassword());
            userService.updateUser(existingUser);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
}