package Services;

public class TextService implements Service {
    public String sendMessage(String message) {
        return "Sending text: " + message;
    }
}
