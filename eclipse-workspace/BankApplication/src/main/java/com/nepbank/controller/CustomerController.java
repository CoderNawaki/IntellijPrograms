
@RestController
@RequestMapping("/users")
public class CustomerController{
    

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User>getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping
    public void createUser(@RequestBody User user){
        userService.saveUser(user);
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