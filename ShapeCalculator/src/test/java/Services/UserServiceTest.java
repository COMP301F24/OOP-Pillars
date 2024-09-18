package Services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    UserService users = new UserService();
    String msg = "hi";
    @Test
    public void testEmailService(){
        users.setService(new EmailService());
        assertEquals("Sending email: " + msg, users.notifyUser(msg));
    }

    @Test
    public void testTextService(){
        users.setService(new TextService());
        assertEquals("Sending text: " + msg, users.notifyUser(msg));

    }

    @Test
    public void testNotificationService(){
        users.setService(new NotifactionService());
        assertEquals("Sending notification: " + msg, users.notifyUser(msg));

    }



}