
@Controller
public class loginController{

    @GetMapping("/login")
    public String loginPage(@RequestParam(name="error",required=false)String error,@RequestParam(name="logout",required=false)String logout,Model model){
        
        if(error!=null){
            model.addAttribute("error","Invalid username or password");
        }
        if(logout!=null){
            model.addAttribute("message","Logged out successfully");
        }

        return "login";
    }
}