@Service
public class UserServiceImpl  implements UserService{

@Override
public void saveUser(User user){
    Set<Role>roles = new HashSet<>();
    roles.add(roleRepository.findByName("USER"));
    user.setRoles(roles);
    userRepository.save(user);
}
}