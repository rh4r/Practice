
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] LastWeek = {0, 2, 5, 3, 7, 8, 4};
        
        return LastWeek;
    }

    public int getToday() {
        return this.birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        boolean BirdsAllWeek = false;
        int[] BirdsSeen = this.birdsPerDay;
        
        for (int birds_seen : BirdsSeen){
            if (birds_seen == 0) {
                BirdsAllWeek = true;
            }
        }
        return BirdsAllWeek;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int Index = 0;
        int Tally = 0;
        
        for (int bird_viewing: this.birdsPerDay){
            if (Index < numberOfDays){
                Tally += bird_viewing;
                Index += 1;
            }
            else {
                break;
            }
        }
        return Tally;
    }

    public int getBusyDays() {
        int BusyDays = 0;
        
        for (int day : this.birdsPerDay){
            if (day >= 5){
                BusyDays += 1;
            }
        }

        return BusyDays;
    }
}
