package owu.javahomework.com;

public class Car {
    private String model;

    private int power;

    private int engineVolume;

    private boolean turbo;

    public Car(String model, int power, int engineVolume, boolean turbo) {
        this.model = model;
        this.power = power;
        this.engineVolume = engineVolume;
        this.turbo = turbo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int newPower) {
        power = newPower;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setTurbo(boolean newTurbo) {
        turbo = newTurbo;
    }

    @Override
    public String toString() {
        return "Model: "
                + model + "\nPower: "
                + power + "\nEngine Volume: "
                + engineVolume + "\nTurbo: " +
                turbo + "\n";
    }
}
