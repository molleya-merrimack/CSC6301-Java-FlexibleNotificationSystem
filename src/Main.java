/**
 * FlexibleNotificationSystem - Java Application
 * Module 05: Software Development Cycle
 * CSC6301OM: Software Design & Documentation
 *
 * Entry point for the application.
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

        // Email notification
        alertSystem.setMedium(new EmailService());
        alertSystem.notifyUser("This is your email.");

        // SMS notification
        alertSystem.setMedium(new SMSService());
        alertSystem.notifyUser("This is your SMS message.");

        // WhatsApp notification
        alertSystem.setMedium(new WhatsAppService());
        alertSystem.notifyUser("WhatsApp is active and has a notification.");

        // Display session log
        alertSystem.displayLog();
    }
}