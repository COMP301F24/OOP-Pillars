package Services.withIoC;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new EmailService();
        UserService userService = new UserService(emailService);

        userService.notifyUser("Hello from IoC!");
    }
}
