package parrot;

public final class ParrotFactory {

    public static Parrot getParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        switch(type) {
            case EUROPEAN:
                return new EuropeanParrot(type, numberOfCoconuts, voltage, isNailed);
            case AFRICAN:
                return new AfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE:
                return new NorwegianBlueParrot(voltage, isNailed);
            default:
                throw new RuntimeException("should not be reached");
        }
    }
}

