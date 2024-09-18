package Services;

public class UserService {
    private Service service;

    public void setService(Service service){
        this.service = service;
    }

    public String notifyUser(String message) {
        return service.sendMessage(message);
    }
}
