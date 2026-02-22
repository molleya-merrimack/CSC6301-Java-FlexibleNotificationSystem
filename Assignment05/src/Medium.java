/**
 * Concrete implementation for SMS notifications.
 */
class SMSService implements NotificationMedium {

    /**
     * Sends an SMS message.
     *
     * @param message the message to send
     */
    @Override
    public void send(String message) {
        System.out.println("SMS message sent: " + message);
    }
}
/**
 * Concrete implementation for email notifications.
 */
class EmailService implements NotificationMedium {

    /**
     * Sends an email message.
     *
     * @param message the message to send
     */
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
/**
 * Concrete implementation for WhatsApp notifications.
 */
class WhatsAppService implements NotificationMedium {

    /**
     * Sends a WhatsApp message.
     *
     * @param message the message to send
     */
    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Message sent: " + message);
    }
}