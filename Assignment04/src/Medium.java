/** 
 * This file contains the classes of each medium
 * and uses the implementations of NotificationMedium.
 */
/**
 * Class with the implementation for SMS notifications.
 */
class SMSService implements NotificationMedium {

    /**
     * Method that sends an SMS message.
     *
     * @param message the message to send
     */
    @Override
    public void send(String message) {
        System.out.println("SMS message sent: " + message);
    }
}
/**
 * Class with the implementation for email notifications.
 */
class EmailService implements NotificationMedium {

    /**
     * Method that sends an email message.
     *
     * @param message the message to send
     */
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}