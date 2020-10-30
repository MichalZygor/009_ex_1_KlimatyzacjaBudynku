public class ProAirConditioner extends AirConditioner {

    public ProAirConditioner(double actualTemperature, double thresholdLevel, double volume, boolean statusAirCondition) {
        super(actualTemperature, thresholdLevel, volume, statusAirCondition);
    }

    public String showTemperature(){
        return "Pokój ze wypaśną klimatyzacją. " + super.showTemperature();
    }
}
