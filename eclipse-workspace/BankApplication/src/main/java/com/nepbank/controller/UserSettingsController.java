//UserSettingsController.java


@Controller
@RequestMapping("/settings")
public class UserSettingsController{

    @Autowired
    private UserService userService;

    @GetMapping
    public String showSettings(Model model){
        //get the current authenticated user
        User currentUser = userService.getCurrentAuthenticatedUser();

        //add user details to the model 
        model.addAttribute("user",currentUser);
        return "settings";
    }

    @PostMapping("/update")
    public String updateSettings(@ModelAttribute("user")User updateUser,Model model){
        //get the current authenticated user
        User currentUser  = userService.getCurrentAuthenticatedUser();

        //Update user details
        currentUser.setFirstName(updatedUser.getFirstName());
        currentUser.setLastName(updatedUser.getLastName());

        //add more fields as needed 
        //save updated user details

        userService.saveUser(currentUser);

        model.addAttribute("user",currentUser);
        model.addAttribute("message","Settings updated successfully.");

        return "settings";
    }

    
}