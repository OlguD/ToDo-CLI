package ToDo.src.main;

public class Login {
    private String username;
    private String password;
    
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate() {
        if (this.username.equals("admin") && this.password.equals("admin")) {
            return true;
        }
        return false;
    }
}
