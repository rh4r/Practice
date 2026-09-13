public class Secrets {
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        int ReturnedBits = value | mask;
        
        return ReturnedBits;
    }

    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }
    //                              0b0110    0b0101
    public static int clearBits(int value, int mask) {
        int FirstClear = value ^ mask; // 0b0011
        int SecondClear = FirstClear & value; // 0b0010
        
        return SecondClear;
        // return                          0b0010
    }
}
