
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


    @GetMapping("/forgot-password")
    public String showForgotPasswordForm() {
        return "forgot-password";
    }

    @PostMapping("/forgot-password")
    public String processForgotPassword(@RequestParam("email") String email, Model model) {
        User user = userService.findByEmail(email);

        if (user != null) {
            // Generate a password reset token (you can use a library for this)
            String resetToken = generateResetToken();
            
            // Save the token in the database
            userService.savePasswordResetToken(user, resetToken);
            
            // Send an email with the reset link
            sendResetEmail(user.getEmail(), resetToken);
            
            model.addAttribute("message", "Password reset link sent to your email.");
        } else {
            model.addAttribute("error", "User not found with the provided email address.");
        }

        return "forgot-password";
    }

     private String generateResetToken() {
        // Implement logic to generate a unique reset token
        return "some-unique-token";
    }

    private void sendResetEmail(String email, String resetToken) {
        // Implement logic to send an email with the reset link
        // You can use a service like JavaMailSender or an external email provider
    }

    @GetMapping("/reset-password/{token}")
    public String showResetPasswordForm(@PathVariable String token,Model model){
        User user = userService.findByPasswordResetToken(token);
        if(user==null){
            model.addAttribute("error","Invalid password reset token.");
        }
    }
}