import java.text.DecimalFormat;

public class AirConditioner extends Room{
    private double thresholdLevel; //Celsius
    final static double COUNT_DOWN = 1;
    private boolean statusAirCondition;

    public AirConditioner(double actualTemperature, double volume, double thresholdLevel, boolean statusAirCondition) {
        super(actualTemperature, volume);
        this.thresholdLevel = thresholdLevel;
        this.statusAirCondition = statusAirCondition;
    }

    public void reduceTemperature() {
        if (getActualTemperature() > thresholdLevel) {
            setActualTemperature(getActualTemperature() - COUNT_DOWN);
            if (getActualTemperature() < thresholdLevel) setActualTemperature(thresholdLevel);
        } else {
            statusAirCondition = false;
            System.out.print("Osiągnięto minimalną temperaturę. ");
        }
    }

    public String showTemperature() {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        return "Aktualna temperatura wynosi: " + decimalFormat.format(super.getActualTemperature()) + ". Status: " + statusAirCondition;
    }

    public double getThresholdLevel() {
        return thresholdLevel;
    }

    public void setStatusAirCondition(boolean statusAirCondition) {
        this.statusAirCondition = statusAirCondition;
    }
}
