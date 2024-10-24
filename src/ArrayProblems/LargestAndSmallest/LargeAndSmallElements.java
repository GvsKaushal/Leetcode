package ArrayProblems.LargestAndSmallest;

public class LargeAndSmallElements {
    public static void main(String[] args) {

        int[] array = {1, 2, 4, 7, 7, 5};

        findFirstAndSecondLargeElement(array);
        findFirstAndSecondSmallElement(array);

    }

    private static void findFirstAndSecondLargeElement(int[] arr) {

        if (arr.length == 0) {
            System.out.println("Array is empty");
        } else if (arr.length < 2) {
            System.out.println("only one element in array");
        } else {
            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > firstMax) {
                    secondMax = firstMax;
                    firstMax = arr[i];
                } else if (arr[i] > secondMax && arr[i] < firstMax) {
                    secondMax = arr[i];
                }

            }
            System.out.println("Largest Element = " + firstMax);
            System.out.println("Second Largest Element = " + secondMax);
        }

    }

    private static void findFirstAndSecondSmallElement(int[] arr) {

        if (arr.length == 0) {
            System.out.println("Array is empty");
        } else if (arr.length < 2) {
            System.out.println("only one element in array");
        } else {
            int firstMin = Integer.MAX_VALUE;
            int secondMin = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < firstMin) {
                    secondMin = firstMin;
                    firstMin = arr[i];
                } else if (arr[i] < secondMin && arr[i] > firstMin) {
                    secondMin = arr[i];
                }
            }

            System.out.println("Smallest Element = " + firstMin);
            System.out.println("Second Smallest Element = " + secondMin);
        }
    }

}
