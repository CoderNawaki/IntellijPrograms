@Service
public class UserServiceImpl  implements UserService{


    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User>getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User getUserByUsername(String username){
        return userRepository.findByUsername(username).orElse(null);
    }

    //method for saving user to the database
    @Override
    public void saveUser(User user){
        Set<Role>roles = new HashSet<>();
        roles.add(roleRepository.findByName("USER"));
        user.setRoles(roles);
        userRepository.save(user);
    }
    @Override
    public void updateUser(User user){
        userRepository.save(user);
    }
    @Override
    public void deleteUser(Long id){
        userRepository.deleteById(id));
    }


    @Override
    public User getCurrentAuthenticatedUser(){
        Authentication  authentication = SecurityContextHolder.getContext().getAuthentication();6
        String username = authentication.getName();
        return userRepository.findByUsername(username);
    }

    @Override
    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    @Override
    public void savePasswordResetToken(User user,String token){
        user.setPasswordResetToken(token);
        userRepository.save(user);

    }
    @Override
    public void updatePassword(User user, String newPassword){
        user.setPassword(passwordEncoder.encode(newPassword));
        user.setPasswordResetToken(null);
        userRepository.save(user);
    }


}