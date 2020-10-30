import java.text.DecimalFormat;

public class AirConditioner {
    private double actualTemperature;  //Celsius
    private double thresholdLevel; //Celsius
    private double volume;  //m3
    final static double COUNT_DOWN = 1;
    private boolean statusAirCondition;

    public AirConditioner(double actualTemperature, double thresholdLevel, double volume, boolean statusAirCondition) {
        this.actualTemperature = actualTemperature;
        this.thresholdLevel = thresholdLevel;
        this.volume = volume;
        this.statusAirCondition = statusAirCondition;
    }

    public void reduceTemperature() {
        if (actualTemperature > thresholdLevel) {
            actualTemperature -= COUNT_DOWN;
            if (actualTemperature < thresholdLevel) actualTemperature = thresholdLevel;
        } else {
            statusAirCondition = false;
            System.out.print("Osiągnięto minimalną temperaturę. ");
        }
    }

    public String showTemperature() {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        return "Aktualna temperatura wynosi: " + decimalFormat.format(actualTemperature) + ". Status: " + statusAirCondition;
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

    public double getVolume() {
        return volume;
    }

    public void setStatusAirCondition(boolean statusAirCondition) {
        this.statusAirCondition = statusAirCondition;
    }
}
