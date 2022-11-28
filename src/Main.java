public class Main {
    public static void main( String[] args )
    {
        testMethods();
    }

    public static void testMethods()
    {

        Fraction[] testArr1 = {new Fraction(1,5), new Fraction(1,4), new Fraction(1,3), new Fraction(1,2), new Fraction(1,1)};
        Fraction[] testArr2 = {new Fraction(1,5), new Fraction(1,4), new Fraction(1,3), new Fraction(1,2), new Fraction(1,10)};
        Fraction[] testArr3 = {new Fraction(1,2), new Fraction(1,4), new Fraction(1,5), new Fraction(1,6), new Fraction(1,7)};
        Fraction[] testArr4 = {new Fraction(-1,2), new Fraction(-1,4), new Fraction(-1,5), new Fraction(-1,6), new Fraction(1,7)};
        Fraction[] testArr5 = {new Fraction(1,2), new Fraction(-1,4), new Fraction(-1,5), new Fraction(-1,6), new Fraction(-1,7)};
        Fraction[] testArr6 = {new Fraction(-1,2), new Fraction(1,4), new Fraction(1,5), new Fraction(1,4), new Fraction(-1,2)};
        Fraction[] testArr7 = {new Fraction(1,2), new Fraction(1,3), new Fraction(1,4), new Fraction(1,4), new Fraction(1,3), new Fraction(1,2)};

        System.out.println("Test maximum");
        System.out.println("SOLL: 1/1 - IST: " + PraktikumBlatt_4.maximum( testArr1, testArr1.length-1 ) );
        System.out.println("SOLL: 1/2 - IST: " + PraktikumBlatt_4.maximum( testArr2, testArr1.length-1 ) );
        System.out.println("SOLL: 1/2 - IST: " + PraktikumBlatt_4.maximum( testArr3, testArr1.length-1 ) );

        System.out.println("Test lastPositive");
        System.out.println("SOLL: 1/1 - IST: " + PraktikumBlatt_4.lastPositive( testArr1, testArr1.length-1 ) );
        System.out.println("SOLL: 1/7 - IST: " + PraktikumBlatt_4.lastPositive( testArr3, testArr1.length-1 ) );
        System.out.println("SOLL: 1/2 - IST: " + PraktikumBlatt_4.lastPositive( testArr5, testArr1.length-1 ) );
        System.out.println("SOLL: 1/4 - IST: " + PraktikumBlatt_4.lastPositive( testArr6, testArr1.length-1 ) );

        System.out.println("Test firstPositive");
        System.out.println("SOLL: 1/5 - IST: " + PraktikumBlatt_4.firstPositive( testArr1, testArr1.length-1 ) );
        System.out.println("SOLL: 1/7 - IST: " + PraktikumBlatt_4.firstPositive( testArr4, testArr1.length-1 ) );
        System.out.println("SOLL: 1/2 - IST: " + PraktikumBlatt_4.firstPositive( testArr5, testArr1.length-1 ) );
        System.out.println("SOLL: 1/4 - IST: " + PraktikumBlatt_4.firstPositive( testArr6, testArr1.length-1 ) );

        System.out.println("Test isSorted");
        System.out.println("SOLL: true  - IST: " + PraktikumBlatt_4.isSorted( testArr1, testArr1.length-1 ) );
        System.out.println("SOLL: true  - IST: " + PraktikumBlatt_4.isSorted( testArr4, testArr1.length-1 ) );
        System.out.println("SOLL: false - IST: " + PraktikumBlatt_4.isSorted( testArr6, testArr1.length-1 ) );

        System.out.println("Test contains");
        System.out.println("SOLL: true  - IST: " + PraktikumBlatt_4.contains( testArr1, testArr1.length-1, new Fraction(1,5) ) );
        System.out.println("SOLL: true  - IST: " + PraktikumBlatt_4.contains( testArr4, testArr1.length-1, new Fraction(-1,5) ) );
        System.out.println("SOLL: true  - IST: " + PraktikumBlatt_4.contains( testArr5, testArr1.length-1, new Fraction(-1,7) ) );
        System.out.println("SOLL: false - IST: " + PraktikumBlatt_4.contains( testArr5, testArr1.length-1, new Fraction(1,9) ) );

        System.out.println("Test countPositives");
        System.out.println("SOLL: 4  - IST: " + PraktikumBlatt_4.countPositives( testArr1, 1,testArr1.length-1 ) );
        System.out.println("SOLL: 0  - IST: " + PraktikumBlatt_4.countPositives( testArr4, 0,testArr1.length-2 ) );
        System.out.println("SOLL: 3  - IST: " + PraktikumBlatt_4.countPositives( testArr6, 0,testArr1.length-1 ) );

        System.out.println("Test contentCheck");
        System.out.println("SOLL: true  - IST: " + PraktikumBlatt_4.contentCheck( testArr1, testArr1, testArr1.length-1 ) );
        System.out.println("SOLL: false - IST: " + PraktikumBlatt_4.contentCheck( testArr4, testArr5, testArr1.length-1 ) );

        System.out.println("Test palindromCheck");
        System.out.println("SOLL: true  - IST: " + PraktikumBlatt_4.palindromCheck( testArr6, 0 ) );
        System.out.println("SOLL: true  - IST: " + PraktikumBlatt_4.palindromCheck( testArr7, 0 ) );
        System.out.println("SOLL: false - IST: " + PraktikumBlatt_4.palindromCheck( testArr4, 0 ) );

        System.out.println("Test getIndex");
        System.out.println("SOLL: 0   - IST: " + PraktikumBlatt_4.getIndex( testArr1, testArr1.length-1, new Fraction(1,5) ) );
        System.out.println("SOLL: 4   - IST: " + PraktikumBlatt_4.getIndex( testArr2, testArr1.length-1, new Fraction(1,10) ) );
        System.out.println("SOLL: -1  - IST: " + PraktikumBlatt_4.getIndex( testArr5, testArr1.length-1, new Fraction(1,10) ) );
    }
}