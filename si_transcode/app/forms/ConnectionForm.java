package forms;

import play.data.validation.Constraints;

/**
 * Created by Ramneek on 18/05/2016.
 */
public class ConnectionForm {
    @Constraints.Required
    private String username;
    @Constraints.Required
    private String password;
    private boolean rememberMe;

    public ConnectionForm() {}

    public ConnectionForm(String username, String password, boolean rememberMe) {
        this.username = username;
        this.password = password;
        this.rememberMe = rememberMe;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
}
