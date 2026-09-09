static class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (!knightIsAwake && !archerIsAwake && !prisonerIsAwake){
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (archerIsAwake){
            return false;
        }
        else if (!archerIsAwake && prisonerIsAwake) {
            return true;
        }
        else return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent){
            if (!archerIsAwake) {
                return true;
            }
        } else if (prisonerIsAwake && !archerIsAwake && !knightIsAwake){
            return true;
        }
        return false;
    }
}
