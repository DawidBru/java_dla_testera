package computer;

public class Laptop extends Computer {

    private int batteryLevel;
    private String modelOfLaptop = "Acer";

    public Laptop(String name, String type, int hdd, int ram, boolean state, int batteryLevel, String modelOfLaptop) {
        super(name, type, hdd, ram, state);
        this.batteryLevel = batteryLevel;
        this.modelOfLaptop = modelOfLaptop;
    }

    @Override
    public void switchOnState() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOnState();
        } else {
            System.out.println("Battery level to low");
        }
    }

    public void returnModelOfLaptop() {
        modelOfLaptop = "Aser";
        System.out.println("Model of laptop: " + modelOfLaptop);
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    public void switchOffState() {
        System.out.println("I turn off Laptop " + name);
        state = false;
    }

    public int volumeUp(int volumeAdd) {
        volumeLevel = volumeLevel + volumeAdd;
        if (volumeLevel >= 100) {
            return 100;
        } else {
            return volumeLevel;
        }
    }

    public int volumeDown(int volumeSubtract) {
        volumeLevel = volumeLevel - volumeSubtract;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }
}
