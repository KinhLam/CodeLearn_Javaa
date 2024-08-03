package Static_Java;

public class Ex4 {
    public class ArrayCalculator {

        // Method to find the maximum value in an array of integers
        public static int maxOfArray(int[] arr) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        // Method to find the maximum value in an array of doubles
        public static double maxOfArray(double[] arr) {
            double max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        // Method to find the minimum value in an array of integers
        public static int minOfArray(int[] arr) {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }

        // Method to find the minimum value in an array of doubles
        public static double minOfArray(double[] arr) {
            double min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }

        public static void main(String[] args) {
            int[] intArr = { 1, 2, 3, 4, 5 };
            double[] doubleArr = { 1.1, 2.2, 3.3, 4.4, 5.5 };

            System.out.println("Max of int array: " + maxOfArray(intArr));
            System.out.println("Max of double array: " + maxOfArray(doubleArr));
            System.out.println("Min of int array: " + minOfArray(intArr));
            System.out.println("Min of double array: " + minOfArray(doubleArr));
        }
    }

}
