public class AirConditioner {
    private double actualTemperature;  //Celsius
    private double thresholdLevel; //Celsius
    private double volume;  //m3
    final static double COUNT_DOWN = 1;

    public AirConditioner(double actualTemperature, double thresholdLevel, double volume) {
        this.actualTemperature = actualTemperature;
        this.thresholdLevel = thresholdLevel;
        this.volume = volume;
    }

    public void reduceTemperature() {
        if (actualTemperature > thresholdLevel) {
            actualTemperature -= COUNT_DOWN;
            if (actualTemperature < thresholdLevel) actualTemperature = thresholdLevel;
        } else
            System.out.println("Osiągnięto minimalną temperaturę.");
    }

    public double getActualTemperature() {
        return actualTemperature;
    }

    public void setActualTemperature(double actualTemperature) {
        this.actualTemperature = actualTemperature;
    }

    public double getThresholdLevel() {
        return thresholdLevel;
    }

    public void setThresholdLevel(double thresholdLevel) {
        this.thresholdLevel = thresholdLevel;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public static double getCountDown() {
        return COUNT_DOWN;
    }
}
