package exercises.technology;

public class SmartPhone extends Computer {
    private String operatingSystem;
    private boolean isGoogleOperated;


    public SmartPhone(String manufacturer, String processor, double processorSpeedInMGz, String operatingSystem, boolean isGoogleOperated) {
        super(manufacturer, processor, processorSpeedInMGz);
        this.operatingSystem = operatingSystem;
        this.isGoogleOperated = isGoogleOperated;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean isGoogleOperated() {
        return isGoogleOperated;
    }

    public void setGoogleOperated(boolean googleOperated) {
        isGoogleOperated = googleOperated;
    }
}
