package apna.clg;

import java.util.Date;

// Class representing an elderly person
class ElderlyPerson {
    private String name;
    private boolean isAwake;
    private boolean hasEaten;
    private boolean hasTakenMedication;

    public ElderlyPerson(String name) {
        this.name = name;
        this.isAwake = false;
        this.hasEaten = false;
        this.hasTakenMedication = false;
    }

    // Setters and getters for the person's state
    public void setAwake(boolean isAwake) {
        this.isAwake = isAwake;
    }

    public void setHasEaten(boolean hasEaten) {
        this.hasEaten = hasEaten;
    }

    public void setHasTakenMedication(boolean hasTakenMedication) {
        this.hasTakenMedication = hasTakenMedication;
    }

    public boolean isAwake() {
        return isAwake;
    }

    public boolean hasEaten() {
        return hasEaten;
    }

    public boolean hasTakenMedication() {
        return hasTakenMedication;
    }

    public String getName() {
        return name;
    }
}

// Class representing the monitoring system
class MonitoringSystem {
    private ElderlyPerson person;
    private Date lastUpdate;

    public MonitoringSystem(ElderlyPerson person) {
        this.person = person;
        this.lastUpdate = new Date();
    }

    public void updateStatus(boolean isAwake, boolean hasEaten, boolean hasTakenMedication) {
        person.setAwake(isAwake);
        person.setHasEaten(hasEaten);
        person.setHasTakenMedication(hasTakenMedication);
        lastUpdate = new Date();
        sendNotification();
    }

    public void sendNotification() {
        System.out.println("Notification: " + person.getName() + "'s status has been updated.");
        System.out.println("Last Update: " + lastUpdate);
    }
}

public class ElderlyCareDemo {
    public static void main(String[] args) {

        // Create an elderly person
        ElderlyPerson person = new ElderlyPerson("Sunita Sharma");

        // Create a monitoring system for the person
        MonitoringSystem system = new MonitoringSystem(person);

        // Simulate the person's activities
        person.setAwake(true);
        person.setHasEaten(true);
        person.setHasTakenMedication(false);

        // Update the person's status in the monitoring system
        system.updateStatus(person.isAwake(), person.hasEaten(), person.hasTakenMedication());
    }
}
