public class Main {

    public static void main(String[] args) {
//        int fac = factorial(4);
//        System.out.println(fac);
        int[] result = {1, 3, 5};
        System.out.println(sumOfEvenNum(result));
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i < n; i++) {
            factorial += factorial * i;
        }
        return factorial;
    }

    public static int sumOfEvenNum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                result += arr[i];
            }
        }
        return result;
    }
}