import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getModel() {
            return this.model;
        }

        @Override
        public String toString() {
            String formattedType = "";
            if(this.type.equals("car")) {
                formattedType = "Car";
            } else if(this.type.equals("truck")) {
                formattedType = "Truck";
            }
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", formattedType, this.model, this.color, this.horsePower);
        }

        public String getType() {
            return this.type;
        }

        public int getHorsePower() {
            return this.horsePower;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();
        while (!input.equals("End")) {
            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsepower = Integer.parseInt(input.split(" ")[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);

            vehicles.add(vehicle);

            input = sc.nextLine();

        }
        String enteredModel = sc.nextLine();
        while (!enteredModel.equals("Close the Catalogue")) {

            for (Vehicle vehicle : vehicles) {
                if (enteredModel.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                    break;
                }
            }

            enteredModel = sc.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", getAverageHP(vehicles, "car"));
        System.out.printf("Trucks have average horsepower of: %.2f.", getAverageHP(vehicles, "truck"));
    }

    private static double getAverageHP(List<Vehicle> vehiclesList, String type) {
        double sum = 0;
        int count = 0;
        if (type.equals("car")) {
            for (Vehicle vehicle : vehiclesList) {
                if (vehicle.getType().equals("car")) {
                    sum += vehicle.getHorsePower();
                    count++;
                }
            }

        } else if (type.equals("truck")) {
            for (Vehicle vehicle : vehiclesList) {
                if (vehicle.getType().equals("truck")) {
                    sum += vehicle.getHorsePower();
                    count++;
                }
            }
        }
        if(sum == 0) {
            return 0;
        }
        return sum / count;
    }
}
