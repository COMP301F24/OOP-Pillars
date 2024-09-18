package Services;


public class EmailService implements Service {
    public String sendMessage(String message) {
        return "Sending email: " + message;
    }
}