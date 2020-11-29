public class Factorial_Cal {

    public static int factorial (int N) {


        if (N <= 1) {
            System.out.println("Number is 1: ");
            return 1;

    }else{
            int result=N * factorial(N-1);
            System.out.println("Returned "+ result);
            System.out.println(" : " + N + " factorial(" + N + " - 1");
            return result;
//            return (N * factorial(N-1));
        }

    }
//    public static void
}
