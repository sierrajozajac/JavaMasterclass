public class Main {
    public static void main(String[] args) {
        intTest();
        byteTest();
        shortTest();
        longTest();
        primitiveTypesChallenge();
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

        // IntelliJ knows the literal limits to ints
        //int myMaxIntTest = 2147483648;
        //int myMinIntTest = -2147483649;

        // Casting isn't necessary with arithmetic expressions
        int total1 = myValue / 2;
        int total2 = (int) (myMinIntValue / 2);
    }

    public static void byteTest() {
        //byte bigByteLiteralValue = 2343;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Max Value: " + myMaxByteValue);
        System.out.println("Byte Minimum Value - 1: " + (myMinByteValue - 1));
        System.out.println("Byte Max Value + 1: " + (myMaxByteValue + 1));

        // Casting is necessary with arithmetic expressions
        byte total1 = (byte) (myMinByteValue / 2);
        byte total2 = (byte) (myMaxByteValue / 2);
    }

    public static void shortTest() {
        //short bigShortLiteralValue = 2342342;
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Max Value: " + myMaxShortValue);
        System.out.println("Short Minimum Value - 1: " + (myMinShortValue - 1));
        System.out.println("Short Max Value + 1: " + (myMaxShortValue + 1));

        // Casting is necessary with arithmetic expressions
        short total1 = (short) (myMinShortValue / 2);
        short total2 = (short) (myMaxShortValue / 2);
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

        // Casting isn't necessary with arithmetic expressions
        long total1 =  myLongValue / 2;
        long total2 = (long) (bigLongLiteralValue / 2);
    }

    public static void primitiveTypesChallenge() {
        byte b_value = 45;
        short s_value = 6787;
        int i_value = 245893;
        long total = 50_000L + (10L * (b_value + s_value + i_value));
        System.out.println("Total: " + total);
    }
}
