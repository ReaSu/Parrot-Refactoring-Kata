package parrot;

public class Parrot {

    Parrot parrot;
    private int numberOfCoconuts;
    private double voltage;
    private boolean isNailed;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
        parrot = ParrotFactory.getParrot(type, numberOfCoconuts, voltage, isNailed);
    }

    Parrot() {
    }

    double getSpeed(){
        return parrot.getSpeed();
    }

    double getBaseSpeed() {
        return 12.0;
    }

    public int getNumberOfCoconuts() {
        return numberOfCoconuts;
    }

    public double getVoltage() {
        return voltage;
    }

    public boolean isNailed() {
        return isNailed;
    }
}
