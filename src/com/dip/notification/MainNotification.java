package dip.notification;

public class MainNotification {

    public static void main(String[] args) {

        NotificationService service = new EmailService();
        NotificationManager manager = new NotificationManager(service);

        manager.notifyUser("Привет, мир!");
    }
}