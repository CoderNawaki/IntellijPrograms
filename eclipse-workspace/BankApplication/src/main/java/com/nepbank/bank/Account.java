

public class Account{

    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;

    private double balances;

    //getter and setter
}