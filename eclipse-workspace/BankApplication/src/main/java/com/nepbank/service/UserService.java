
//UserService interface 
public interface UserService{

    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByUsername(String username);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);

    User getCurrentAuthenticatedUser();

    User findByEmail(String email);

    void savePasswordRestToken(User user, String token);

    void updatePassword(User user , String newPassword);
}