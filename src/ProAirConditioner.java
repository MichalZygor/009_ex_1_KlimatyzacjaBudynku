public class ProAirConditioner extends AirConditioner {

    public ProAirConditioner(double actualTemperature, double volume, double thresholdLevel, boolean statusAirCondition) {
        super(actualTemperature, volume, thresholdLevel, statusAirCondition);
    }

    public String showTemperature(){
        return "Pokój ze wypaśną klimatyzacją. " + super.showTemperature();
    }
}
