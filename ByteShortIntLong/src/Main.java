public class Main {
    public static void main(String[] args) {
        //intTest();
        //byteTest();
        //shortTest();
        longTest();
    }

    public static void intTest() {
        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);

        // Let's make some overflow!
        System.out.println("Busted maximum value = " + (myMaxIntValue + 1));
        // Now some underflow!
        System.out.println("Busted minimum value = " + (myMinIntValue - 1));

        //int myMaxIntTest = 2147483648;
        //int myMinIntTest = -2147483649;
    }

    public static void byteTest() {
        //byte bigByteLiteralValue = 2343;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Max Value: " + myMaxByteValue);
        System.out.println("Byte Minimum Value - 1: " + (myMinByteValue - 1));
        System.out.println("Byte Max Value + 1: " + (myMaxByteValue + 1));
    }

    public static void shortTest() {
        //short bigShortLiteralValue = 2342342;
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Max Value: " + myMaxShortValue);
        System.out.println("Short Minimum Value - 1: " + (myMinShortValue - 1));
        System.out.println("Short Max Value + 1: " + (myMaxShortValue + 1));
    }

    public static void longTest() {
        long myLongValue = 100L;
        long bigLongLiteralValue = 2147483648L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Max Value: " + myMaxLongValue);
        System.out.println("Busted Minimum Value: " + (myMinLongValue - 1));
        System.out.println("Busted Max Value: " + (myMaxLongValue + 1));
    }
}