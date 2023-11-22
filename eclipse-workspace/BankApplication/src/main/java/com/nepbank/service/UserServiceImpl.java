@Service
public class UserServiceImpl  implements UserService{


//method for saving user to the database
@Override
public void saveUser(User user){
    Set<Role>roles = new HashSet<>();
    roles.add(roleRepository.findByName("USER"));
    user.setRoles(roles);
    userRepository.save(user);
}

    public void updateUser(User user){
        user.update();
    }

    public void deleteUserById(User userId){
        delete.User();
    }
}