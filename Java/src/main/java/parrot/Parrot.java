package parrot;

public class Parrot {

    Parrot polly;

    public Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        polly = ParrotFactory.getParrot(type, numberOfCoconuts, voltage, isNailed);
    }

    Parrot() {
    }

    double getSpeed(){
        return polly.getSpeed();
    }

    double getBaseSpeed() {
        return 12.0;
    }
}
