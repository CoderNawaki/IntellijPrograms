
//UserService interface 
public interface UserService{

    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByUsername(String username);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}