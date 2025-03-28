package exercise1;
public class TestData {
    public static void main(String[] args) {
        try {
            // Create a Data object with a legal date
            System.out.println("Creating a Data object with a legal date (2024, 2, 29).");
            Data data = new Data(2024, 2, 29);

            // Display the initial date
            System.out.print("Initial date: ");
            data.display();

            // Try to reset the date to a legal date
            System.out.println("Trying to set the date to a legal date (2024, 3, 31).");
            data.setData(2024, 12, 31);
            System.out.print("Date after setting to legal date: ");
            data.display();

            // Try to reset the date to an illegal date
            System.out.println("Trying to set the date to an illegal date (2023, 2, 29).");
            data.setData(2023, 2, 29);
            System.out.print("Date after trying to set to illegal date: ");
            data.display();

            // Call the addOneDay method
            System.out.println("Adding one day to the date.");
            data.addOneDay();
            System.out.print("Date after adding one day: ");
            data.display();

        } catch (IllegalDateException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}