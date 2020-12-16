package exercises.technology;

public class Computer extends AbstractClassID {
    private String manufacturer;
    private String processor;
    private double processorSpeedInMGz;

    public Computer(String manufacturer, String processor, double processorSpeedInMGz) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.processorSpeedInMGz = processorSpeedInMGz;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getProcessorSpeedInMGz() {
        return processorSpeedInMGz;
    }

    public void setProcessorSpeedInMGz(double processorSpeedInMGz) {
        this.processorSpeedInMGz = processorSpeedInMGz;
    }

    public double getProcessorSpeedInGHZ() {
        return processorSpeedInMGz * .001;
    }
}
