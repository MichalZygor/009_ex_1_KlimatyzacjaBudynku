public class Room {
    private double actualTemperature;  //Celsius
    private double volume;  //m3

    public Room(double actualTemperature, double volume) {
        this.actualTemperature = actualTemperature;
        this.volume = volume;
    }

    public double getActualTemperature() {
        return actualTemperature;
    }

    public void setActualTemperature(double actualTemperature) {
        this.actualTemperature = actualTemperature;
    }

    public double getVolume() {
        return volume;
    }

}
