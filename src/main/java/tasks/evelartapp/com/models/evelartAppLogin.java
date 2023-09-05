package tasks.evelartapp.com.models;

public class evelartAppLogin {

    String email;
    String password;
    String validation;

    public evelartAppLogin(String email, String password, String validation) {
        this.email = email;
        this.password = password;
        this.validation = validation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
    }
}
