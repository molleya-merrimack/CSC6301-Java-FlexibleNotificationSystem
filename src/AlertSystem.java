import java.util.ArrayList;
import java.util.List;

/**
 * Context class that uses a NotificationMedium
 * to send messages and maintain a log.
 */
public class AlertSystem {

    private NotificationMedium medium;
    private final List<String> log;

    /**
     * Constructs an AlertSystem with an empty message log.
     */
    public AlertSystem() {
        this.log = new ArrayList<>();
    }

    /**
     * Sets the notification medium.
     *
     * @param medium the notification medium to use
     */
    public void setMedium(NotificationMedium medium) {
        this.medium = medium;
    }

    /**
     * Sends a notification using the current medium
     * and records the message in the log.
     *
     * @param message the message to send
     */
    public void notifyUser(String message) {

        if (medium == null) {
            System.out.println("No notification medium set.");
            return;
        }

        medium.send(message);
        log.add(message);
    }

    /**
     * Displays the message log.
     */
    public void displayLog() {
        System.out.println("\nMessage Log:");
        for (String msg : log) {
            System.out.println("- " + msg);
        }
    }
}