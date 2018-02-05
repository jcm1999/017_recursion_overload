
package pkg017_recursion_overload;

/**
 * This is the main class for the project
 * @author compsci
 */
public class StartRecursion {
    /**
     * This is the method that calls all the different types of recursion methods.
     * @param args displays args in the console
     */
    public static void main(String[] args) {
        int n = 10;
        recurse(n);
        n = 0;
        recurseUp(n);
        System.out.println("");
        int startValue=0;
        int stopValue=50;
        n = 2;
        recurseEvens(startValue, stopValue, n);
        
        System.out.println("");
        startValue=10;
        stopValue=30;
        recurseEvens(startValue, stopValue);
    }
    /**
     * This method counts down from 10
     * @param n placeholder for which number we are on
     */
    private static void recurse(int n) {
        
        System.out.println("We have done recurse " + n + " times");
        n--;
        if(n >= 0) {
            recurse(n);
        }
        
    }
    /**
     * This method counts up from 10
     * @param n placeholder for which number we are on
     */
    private static void recurseUp(int n) {
        
        System.out.println("We have done recurse " + n + " times");
        n++;
        if(n <= 10) {
            recurseUp(n);
        }
        
    }
    /**
     * Display even numbers from startValue inclusive
     * to stopVaule exclusive
     * @param startValue lower boundary inclusive
     * @param stopValue upper boundary inclusive
     */
    // overload define: methods have the same name!!
    // but differ in pass parms
    // and that is how Java tells them apart!
    private static void recurseEvens(int startValue, int stopValue) {
        
        if(startValue % 2 != 0) {
            recurseEvens(startValue + 1, stopValue);
        } else if (startValue < stopValue) {
            System.out.println(startValue);
            recurseEvens(startValue+1,stopValue);
        }
    }
    /**
     * non-modulus way of displaying even numbers
     * 
     * @param startValue lower boundary inclusive
     * @param stopValue upper boundary exclusive
     * @param n placeholder to prevent changes in startValue/stopValue
     */
    private static void recurseEvens(int startValue, int stopValue, int n) {
        
        n = startValue + n;
        
        System.out.println("recurseEvens value is " + n);
        
        n+=2;
        if(n < stopValue) {
            recurseEvens(startValue, stopValue, n);
        }
        
        
    }
} // end of class
