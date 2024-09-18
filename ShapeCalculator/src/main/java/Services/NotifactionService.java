package Services;

public class NotifactionService implements Service {
    public String sendMessage(String message) {
        return "Sending notification: " + message;
    }
}
