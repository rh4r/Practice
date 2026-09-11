public class JedliksToyCar {
    int DistanceDriven = 0;
    int BatteryPercentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        String Display = "Driven %d meters";
        String DisResult = String.format(Display, DistanceDriven);
        
        return DisResult;
    }

    public String batteryDisplay() {
        String Display = "";
        
        if (BatteryPercentage == 0){
            Display = "Battery empty";
        }
        else {
            Display = "Battery at %d%%";
        }
        
        String DisResult = String.format(Display, BatteryPercentage);
        
        return DisResult;
    }

    public void drive() {
        if (BatteryPercentage > 0){
            BatteryPercentage -= 1;    
            DistanceDriven += 20;
        } 
        else {
            BatteryPercentage = 0;
        }
    }
}
