package forms;

import play.data.validation.Constraints;

/**
 * Created by Ramneek on 18/05/2016.
 */
public class RegistrationForm {
    @Constraints.Required
    private String username;
    @Constraints.Required
    @Constraints.Email
    private String email;
    @Constraints.Required
    private String password;
    @Constraints.Required
    private String passwordConfirmation;

    public RegistrationForm() {}

    public RegistrationForm(String username, String email, String password, String passwordConfirmation) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }
}
