public class TestAirConditionInRoom {
    public static void main(String[] args) {
        AirConditioner[] roomsPrestige = new AirConditioner[4];
        roomsPrestige[0] = new BasicAirConditioner(25, 18, 10, true);
        roomsPrestige[1] = new ProAirConditioner(25, 18, 50, true);
        roomsPrestige[2] = new BasicAirConditioner(25, 18, 1, true);
        roomsPrestige[3] = new BasicAirConditioner(20, 18, 60, true);

        runAndCheckAirCondition(roomsPrestige, 10);

    }

    public static void runAndCheckAirCondition(AirConditioner[] roomsPrestige, int steps) {
        for (int i = 0; i < steps; i++) {
            for (AirConditioner roomPrestige : roomsPrestige) {
                roomPrestige.reduceTemperature();
                System.out.println(roomPrestige.showTemperature());
            }
        }
    }
}

