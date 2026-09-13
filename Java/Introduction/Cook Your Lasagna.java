public static class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    int remainingMinutesInOven(int Minutes){
        int Remaining = this.expectedMinutesInOven();

        return (Remaining - Minutes);
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    int preparationTimeInMinutes(int LayerAmount){
        return LayerAmount * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    int totalTimeInMinutes(int NumOfLayers, int MinutesInOven){
        int PrepTime = this.preparationTimeInMinutes(NumOfLayers);

        return (PrepTime + MinutesInOven);
    }
}

public static void main(String[] args){
    Lasagna MyLas = new Lasagna();
    int TimeLeft = MyLas.totalTimeInMinutes(3, 20);

    System.out.println(TimeLeft);
}
