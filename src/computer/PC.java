package computer;

public class PC extends Computer {

    private boolean isConectedToElectricity;
    private String typeOfComputer;

    public PC(String name, String type, int hdd, int ram, boolean state, String typeOfComputer) {
        super(name, type, hdd, ram, state);
        isConectedToElectricity = false;
        this.typeOfComputer = typeOfComputer;
    }

    public void setConectedToElectricity(boolean conectedToElectricity) {
        isConectedToElectricity = conectedToElectricity;
        System.out.println("Is this PC connected to electricity? " + isConectedToElectricity);
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public void returnTypeOfComputer() {
        typeOfComputer = "Acer Nitro";
        System.out.println("The type of computer is: " + typeOfComputer);
    }

    @Override
    public void switchOnState() {
        System.out.println("Checking power supply");
        if (isConectedToElectricity) {
            super.switchOnState();
        } else {
            System.out.println("Power supply missing");
        }
    }

    public void setSwitchOn(boolean newConectedToElectricity) {
        isConectedToElectricity = newConectedToElectricity;
    }

    public void switchOffState() {
        System.out.println("I turn off PC " + name);
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




