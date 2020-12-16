package exercises.technology;

import java.util.ArrayList;
import java.util.List;

public class Laptop extends Computer{
    private double screenSize;
    private List<String> operatingSystem;
    private double batteryLife;

    public Laptop(String manufacturer, String processor, double processorSpeedInMGz, ArrayList<String> operatingSystem, double screenSize, double batteryLife) {
        super(manufacturer, processor, processorSpeedInMGz);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.batteryLife = batteryLife;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public List<String> getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(List<String> operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void addOperatingSystem(String operatingSystem) {
        this.operatingSystem.add(operatingSystem);
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }
}
