package CodeGym.service.account;

public class Account {
    private String username;
    private String password;

    private Account(){}

    public Account(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    public Account setPassword(String password) {
        this.password = password;
        return this;
    }
}
