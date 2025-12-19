package dip.notification;

public class EmailService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Отправка Email: " + message);
    }
}