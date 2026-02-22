/**
 * Interface for sending notifications.
 * Implementations define how a message is delivered.
 */
public interface NotificationMedium {

    /**
     * Sends a notification message.
     *
     * @param message the message to send
     */
    void send(String message);
}