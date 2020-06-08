package CodeGym.service.account;

public class Account {
    private String username;
    private String password;

    private Account(){}

    public Account(String username, String password){
        this.username = username;
        this.password = password;
    }
}
