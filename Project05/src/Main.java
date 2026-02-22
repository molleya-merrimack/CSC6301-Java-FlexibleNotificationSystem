/**
 * FlexibleNotificationSystem - Java Application
 * Module 05: Planning and Executing a Maintenance Task
 * CSC6301OM: Software Design &amp; Documentation
 *
 * Version 2.0 adds WhatsApp notification support.
 *
 * @author AMolley
 * @version 2.0
 */
public class Main {

    /**
     * Application entry point.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Create an instance of AlertSystem
        AlertSystem alertSystem = new AlertSystem();

        // Creates an instance of EmailService and sets it as the notification medium
        alertSystem.setMedium(new EmailService());
        alertSystem.notifyUser("This is your email.");

        // Creates an instance of SMSService and sets it as the notification medium
        alertSystem.setMedium(new SMSService());
        alertSystem.notifyUser("This is your SMS message.");

        // Creates an instance of WhatsAppService and sets it as the notification medium
        alertSystem.setMedium(new WhatsAppService());
        alertSystem.notifyUser("WhatsApp is active and has a notification.");

        // Display session log
        alertSystem.displayLog();
    }
}