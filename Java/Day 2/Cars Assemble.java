public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        double ToReturn = 0;
        
        if (speed < 5){
            ToReturn = speed * 221;
        }
        else if(speed >= 5 && speed < 9){
            ToReturn = speed * (221 * 0.9);
        }
        else if (speed == 9){
            ToReturn = speed * (221 * 0.8);
        }
        else {
         ToReturn = speed * (221 * 0.77);   
        }
        return ToReturn;
    }

    public int workingItemsPerMinute(int speed) {
        CarsAssemble ChildObj = new CarsAssemble();
        double ProductPerHour = ChildObj.productionRatePerHour(speed);
        int CalcReturn = (int) ProductPerHour / 60;
        
        return CalcReturn;
    }
}
