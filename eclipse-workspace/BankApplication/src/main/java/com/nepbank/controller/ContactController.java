@RestController
@RequestMapping("/contact")
public class ContactController{

    @GetMapping("/info")
    public ResponseEntity<Map<String,String>>getContactInfo(){
        Map<String,String>contactInfo = new HashMap<>();
        contactInfo.put("email","info@yourbank.com");
        contactInfo.put("phone","+818033069841");
        return ResponseEntity.ok(contactInfo);
    }
}