package parrot;

public class NorwegianBlueParrot extends Parrot {
    private final boolean isNailed;
    private final double voltage;

    NorwegianBlueParrot(double voltage, boolean isNailed) {
        super();
        this.voltage =voltage;
        this.isNailed = isNailed;
    }

    double getSpeed() {
        if(isNailed) {
            return 0;
        }
        return getBaseSpeed(voltage);
    }

    double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

}
