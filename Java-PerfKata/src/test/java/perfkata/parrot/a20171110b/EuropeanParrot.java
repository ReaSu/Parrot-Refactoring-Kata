package perfkata.parrot.a20171110b;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot() {
        super(null, 0, 0, false);
    }

    @Override
    public double getSpeed() {
            return getBaseSpeed();
    }

}
