interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS Notification");
    }
}

class PushNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Push Notification");
    }
}

class NotificationFactory {

    public Notification createNotification(String type) {

        if (type.equalsIgnoreCase("Email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("Push")) {
            return new PushNotification();
        }

        return null;
    }
}

public class exercise2 {

    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory();

        Notification n1 = factory.createNotification("Email");
        n1.notifyUser();

        Notification n2 = factory.createNotification("SMS");
        n2.notifyUser();

        Notification n3 = factory.createNotification("Push");
        n3.notifyUser();
    }
}