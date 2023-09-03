package hw2;

public class task2 {
    /*Если необходимо исправьте данный код:
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
*/
public static void main(String[] args) {
    try {
        int d = 0;
        int[] intArray = new int[]{1,222,32,4,53,62,17,86};
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Catching exception: " + e.getMessage());
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e.getMessage());
    }
    System.out.println("-------------------------");
}

}
