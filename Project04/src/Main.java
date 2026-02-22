/**
 * FlexibleNotificationSystem - Java Application
 * Module 04: Flexible Notification System
 * CSC6301OM: Software Design &amp; Documentation
 *
 * @author AMolley
 * @version 1.0
 */
public class Main {

    /**
     * Application entry point.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Creates an instance of AlertSystem
        AlertSystem alertSystem = new AlertSystem();

        // Creates an instance of EmailService and sets it as the notification medium
        alertSystem.setMedium(new EmailService());
        alertSystem.notifyUser("This is your email.");

        // Creates an instance of SMSService and sets it as the notification medium
        alertSystem.setMedium(new SMSService());
        alertSystem.notifyUser("This is your SMS message.");

        // Display session log
        alertSystem.displayLog();
    }
}