package Practice;

public class TripService {
    private static Train[] trains = new Train[]{
            new Train(1, "Toshkent", "Samarqand", 120_000),
            new Train(2, "Toshkent", "Buxoro", 200_000),
            new Train(3, "Samarqand", "Buxoro", 90_000)
    };

    public static void showAllTrain() {
        System.out.println("\n--- Barcha reyslar ---");
        for (Train train : trains) {
            train.printInfo();
        }
    }

    public static Train findById(int id) {
        for (Train train : trains) {
            if (train.getId() == id) {
                return train;
            }
        }
        return null;
    }
}
