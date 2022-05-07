public class LoginException extends Exception{

    String login;

    public LoginException(String message, String login) {
        super(message);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

}
