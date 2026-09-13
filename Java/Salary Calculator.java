public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double ToReturn = (daysSkipped >= 5) ? 0.85 : 1;
        
        return ToReturn;
    }

    public int bonusMultiplier(int productsSold) {
        int Multi = (productsSold >= 20) ? 13 : 10;
        
        return Multi;
    }

    public double bonusForProductsSold(int productsSold) {
        SalaryCalculator ForBonus = new SalaryCalculator();
        int BonusMulti = ForBonus.bonusMultiplier(productsSold);
        double BonusReturn = productsSold * BonusMulti;
        
        return BonusReturn;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        SalaryCalculator SalCalc = new SalaryCalculator();
        double SalMulti = SalCalc.salaryMultiplier(daysSkipped);
        double BonMulti = SalCalc.bonusForProductsSold(productsSold);
        
        double NewSalary = (1000 * SalMulti) + (int) BonMulti;
        double MoreThan = (NewSalary > 2000) ? 2000 : NewSalary;
        
        return MoreThan;
    } 
}
