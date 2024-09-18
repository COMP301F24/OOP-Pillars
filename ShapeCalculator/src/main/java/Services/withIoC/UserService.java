package Services.withIoC;

public class UserService {
    private final NotificationService notificationService;

    // IoC through constructor injection
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message) {
        notificationService.sendNotification(message);
    }
}




