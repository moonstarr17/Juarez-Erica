import java.util.Scanner;

public class Route_To_Moalboal {

    private static final double BARILI_TO_MOALBOAL = 84.9;
    private static final double DUMANJUG_TO_MOALBOAL = 93.9;
    private static final double ARGAO_TO_MOALBOAL = 92.2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distanceToMoalboal = 0;
        double speed = 0;
        double eta;
        int etaHours;
        int etaMinutes;

        System.out.println("\n-------------------------------");
        System.out.println("         Default Route ");
        System.out.println("-------------------------------");
        System.out.println("  Cebu City    [Start]");
        System.out.println("  Minglanilla  [Route 1]");
        System.out.println("  San Fernando [Route 2]");
        System.out.println("  Carcar       [Route 3]");
        System.out.println("  Barili       [Route 4.1]");
        System.out.println("  Dumanjug     [Route 4.1.1]");
        System.out.println("  Alcantara    [Route 4.1.2]");
        System.out.println("  Moalboal     [End]");
        System.out.println("-------------------------------");

        System.out.print("\nIs the Barili route obstructed? (y/n): ");
        String bariliObstructed = scanner.nextLine();

        
        while (!bariliObstructed.equalsIgnoreCase("y") && !bariliObstructed.equalsIgnoreCase("n")) {
            System.out.println("Invalid input! Please enter 'y' or 'n'.");
            System.out.print("\nIs the Barili route obstructed? (y/n): ");
            bariliObstructed = scanner.nextLine();
        }

        if (bariliObstructed.equalsIgnoreCase("n")) {
        
            System.out.print("Enter your speed (km/h): ");
            speed = scanner.nextDouble();

            distanceToMoalboal = BARILI_TO_MOALBOAL;
            eta = distanceToMoalboal / speed;
            etaHours = (int) eta;
            etaMinutes = (int) ((eta - etaHours) * 60);

            System.out.println("\n-------------------------------");
            System.out.println("       Recommended Route "); 
            System.out.println("-------------------------------");
            System.out.println("  Cebu City    [Start]");
            System.out.println("  Minglanilla  [Route 1]");
            System.out.println("  San Fernando [Route 2]");
            System.out.println("  Carcar       [Route 3]");
            System.out.println("  Barili       [Route 4.1]");
            System.out.println("  Dumanjug     [Route 4.1.1]");
            System.out.println("  Alcantara    [Route 4.1.2]");
            System.out.println("  Moalboal     [End]");
            System.out.println("-------------------------------");

 
            System.out.println("        Additional Data");
            System.out.println("-------------------------------");
            System.out.println("  Speed: " + speed + " km/h");
            System.out.println("  Distance: " + distanceToMoalboal + " km");
            System.out.println("  ETA: " + etaHours + " hours and " + etaMinutes + " minutes.");
            System.out.println("-------------------------------");

        } else {
            System.out.print("Is the Dumanjug route obstructed? (y/n): ");
            String dumanjugObstructed = scanner.nextLine();

           
            while (!dumanjugObstructed.equalsIgnoreCase("y") && !dumanjugObstructed.equalsIgnoreCase("n")) {
                System.out.println("Invalid input! Please enter 'y' or 'n'.");
                System.out.print("Is the Dumanjug route obstructed? (y/n): ");
                dumanjugObstructed = scanner.nextLine();
            }

            if (dumanjugObstructed.equalsIgnoreCase("n")) {
            
                System.out.print("Enter your speed (km/h): ");
                speed = scanner.nextDouble();

                distanceToMoalboal = DUMANJUG_TO_MOALBOAL;
                eta = distanceToMoalboal / speed;
                etaHours = (int) eta;
                etaMinutes = (int) ((eta - etaHours) * 60);

                System.out.println("\n-------------------------------");
                System.out.println("       Recommended Route ");
                System.out.println("-----------------------------");
                System.out.println("  Cebu City    [Start]");
                System.out.println("  Minglanilla  [Route 1]");
                System.out.println("  San Fernando [Route 2]");
                System.out.println("  Carcar       [Route 3]");
                System.out.println("  Sibonga      [Route 4.2]");
                System.out.println("  Dumanjug     [Route 4.2.1]");
                System.out.println("  Alcantara    [Route 4.2.2]");
                System.out.println("  Moalboal     [End]");
                System.out.println("-------------------------------");

                System.out.println("        Additional Data");
                System.out.println("-------------------------------");
                System.out.println("  Speed: " + speed + " km/h");
                System.out.println("  Distance: " + distanceToMoalboal + " km");
                System.out.println("  ETA: " + etaHours + " hours and " + etaMinutes + " minutes.");
                System.out.println("-------------------------------");

            } else {
            
                System.out.println("Take the Argao Route");
                System.out.print("\nEnter your speed (km/h): ");
                speed = scanner.nextDouble();

                distanceToMoalboal = ARGAO_TO_MOALBOAL;
                eta = distanceToMoalboal / speed;
                etaHours = (int) eta;
                etaMinutes = (int) ((eta - etaHours) * 60);

                System.out.println("\n-------------------------------");
                System.out.println("       Recommended Route ");
                System.out.println("------------------------------");
                System.out.println("  Cebu City    [Start]");
                System.out.println("  Minglanilla  [Route 1]");
                System.out.println("  San Fernando [Route 2]");
                System.out.println("  Carcar       [Route 3]");
                System.out.println("  Sibonga      [Route 4.2]");
                System.out.println("  Argao        [Route 5]");
                System.out.println("  Ronda        [Route 5.1]");
                System.out.println("  Alcantara    [Route 5.2]");
                System.out.println("  Moalboal     [End]");
                System.out.println("-------------------------------");


                System.out.println("        Additional Data");
                System.out.println("-------------------------------");
                System.out.println("  Speed: " + speed + " km/h");
                System.out.println("  Distance: " + distanceToMoalboal + " km");
                System.out.println("  ETA: " + etaHours + " hours and " + etaMinutes + " minutes.");
                System.out.println("-------------------------------");

            }
        }
    }
}
