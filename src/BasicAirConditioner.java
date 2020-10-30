public class BasicAirConditioner extends AirConditioner {
    private final static double COUNT_DOWN_BASIC = 1;

    public BasicAirConditioner(double actualTemperature, double thresholdLevel, double volume) {
        super(actualTemperature, thresholdLevel, volume);
    }


    public void reduceTemperature() {
        if (super.actualTemperature > thresholdLevel) {
            actualTemperature -= COUNT_DOWN;
            if (actualTemperature < thresholdLevel) actualTemperature = thresholdLevel;
        } else
            System.out.println("Osiągnięto minimalną temperaturę.");
    }
}
