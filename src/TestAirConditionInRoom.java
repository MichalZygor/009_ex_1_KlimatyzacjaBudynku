public class TestAirConditionInRoom {
    public static void main(String[] args) {
        AirConditioner[] roomsPrestige = new AirConditioner[4];
        roomsPrestige[0] = new BasicAirConditioner(25, 10, 18, true);
        roomsPrestige[1] = new ProAirConditioner(22, 50, 18, true);
        roomsPrestige[2] = new BasicAirConditioner(23, 1, 18, true);
        roomsPrestige[3] = new BasicAirConditioner(20, 60, 18, true);

        runAndCheckAirCondition(roomsPrestige, 6);
    }

    public static void runAndCheckAirCondition(AirConditioner[] roomsPrestige, int steps) {
        for (int i = 0; i < steps; i++) {
            System.out.println("Krok: " + (i+1));
            for (AirConditioner roomPrestige : roomsPrestige) {
                roomPrestige.reduceTemperature();
                System.out.println(roomPrestige.showTemperature());
            }
        }
    }
}

