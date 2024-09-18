package Services.withIoC;

public class EmailService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending email: " + message);
    }
}