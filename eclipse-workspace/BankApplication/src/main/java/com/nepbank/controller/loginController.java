
@Controller
public class loginController{

    @Autowired
    private UserService userService;

 

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

    @PostMapping("/login")
    public String login(@RequestParam(name="username")String username,
                        @RequestParam(name="password")String password,
                        @RequestParam(name="faceId",required=false)MultipartFile faceIdImage,
                        Model model){
      //authenticate using username and password
      UserDetails userDetails = userService.loadUserByUsername(username);
      if(userDetails!=null && userDetails.getPassword().equals(password)){
        //check face id if provided
        if(faceIdImage!=null && verifyFaceId(userDetails.getUsername(),faceIdImage)){
            return "redirect:/home";
        }else{
            model.addAttribute("error",Face ID verification failed);

        }
      }else{
        model.addAttribute("error","Invalid username or password");

      }  
      return "login";                    

    }

    private boolean verifyFaceId(String username, MultipartFile faceIdImage){
        //implement face id verification logic here
        //you may use a facial recognition library or api
        //return true if the face id is verified,false otherwise
        return false;
    }
}