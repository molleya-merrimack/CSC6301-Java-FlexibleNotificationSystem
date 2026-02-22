### Flexible Notification System ###

## System Design

This project implements a flexible notification system using
object-oriented principles. A base notification abstraction
defines the behavior for all notification types.

Project04:
- Supports Email and SMS notifications.
- Each notification type implements the same interface.

## Architecture

Main is the application entry point. It is where AlertSystem is initiated and messages of notifications are presented. It contains the public static void main(String[] args) method, 
which initializes the AlertSystem and selects notification media 
through object instantiation. Notification parameters are passed through object instantiation rather than command-line arguments. 

NotificationMedium defines the interface for sending notifications. These implementations are used to define how a message is delivered. All notification types must implement the send(String message) method.

Medium contains the classes for each medium (Email and SMS Messages) used for notifications implementing the NotificationMedium interface. 
Each class defines its own behavior for delivering a notification. 

AlertSystem is a public class that maintains a log of all messages sent during a session. 
It stores messages in a list initialized in the constructor. It uses interface-based polymorphism to allow notification types to be changed, making any maintenance not recommended. Modifying already existing classes is also not recommended. 

## Directory Structure

### src/
Contains the Java source files:
- Main.java
- NotificationMedium.java
- Medium.java
- AlertSystem.java

### bin/
Contains compiled class files.

### lib/
Contains generated Javadoc documentation.

Full API documentation is available in the /lib directory
and was generated using the javadoc tool.

### .vscode/
Editor configuration files. 

## Extending the System

To add a new notification type:

1. Create a new class that implements the NotificationMedium interface in Medium.
2. Define the send method with the desired message behavior.
3. Make sure the new medium in Main is defined in an instance object.
4. Make sure the new medium is captured by AlertSystem. No modifications to existing classes are required.

This design allows new notification types to be added 
without modifying existing classes.

## How to Compile
download all files from src directory
# From Command Prompt:
cd src (or whatever directory you put the files in) 
javac *.java

## How to Run
java Main

## Manual Testing Procedure

1. Compile and run Main.
2. Verify the following messages are generated:
Email sent: This is your email.
SMS message sent: This is your SMS message.

Message Log:
- This is your email.
- This is your SMS message.
