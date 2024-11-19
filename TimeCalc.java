public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
   if (args.length < 2) {
            System.out.println("Usage: java TimeCalc1 <hh:mm> <minutesToAdd>");
            return;
        }
        
        String time = args[0]; // e.g., "10:30"
        int minutesToAdd = Integer.parseInt(args[1]); // e.g., 4055
        
        // We must split the time into hours and minutes
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]); // Extract hours (e.g., 10)
        int minutes = Integer.parseInt(parts[1]); // Extract minutes (e.g., 30)
        
       
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        
        // Calculate new hours and minutes
        int newHours = (totalMinutes / 60) % 24; // Wrap hours around 24
        int newMinutes = totalMinutes % 60;
        
        // Format the result to hh:mm with leading zeros
        String result = String.format("%02d:%02d", newHours, newMinutes);
        
        
        System.out.println(result);
    }
}