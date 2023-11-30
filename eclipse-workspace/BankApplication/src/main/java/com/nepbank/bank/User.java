
@Entity
public class User{
  // ... (previous fields)

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @Column(name="face_id")
    private String faceId;

    // ... (getters and setters)
}