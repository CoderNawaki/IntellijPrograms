
@Controller
public class loginController{

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}