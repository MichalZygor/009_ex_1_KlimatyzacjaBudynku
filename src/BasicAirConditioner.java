public class BasicAirConditioner extends AirConditioner {

    public BasicAirConditioner(double actualTemperature, double thresholdLevel, double volume, boolean statusAirCondition) {
        super(actualTemperature, thresholdLevel, volume, statusAirCondition);
    }

    public void reduceTemperature() {
        if (getActualTemperature() > getThresholdLevel()) {
            setActualTemperature(getActualTemperature() - COUNT_DOWN / getVolume());
            if (getActualTemperature() < getThresholdLevel()) setActualTemperature(getThresholdLevel());
        } else {
            setStatusAirCondition(false);
            System.out.print("Osiągnięto minimalną temperaturę. ");
        }
    }

    public String showTemperature() {
        return "Pokój ze podstawową klimatyzacją. " + super.showTemperature();
    }

}
