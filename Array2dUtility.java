
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.

    public static void print(int[][] tdarray){
        System.out.println(tdarray);
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] tdarray){
        int[]oArray; int sumage = 0; int sumfinal = 0;
        for(int i = 1; i <= tdarray.length; i++){
            oArray = tdarray[i];
            for(int e = 0; e < oArray.length;){
                sumage = sumage + oArray[e];
            sumfinal = sumfinal + sumage;
            }}
        return sumfinal;}

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static int average(int[][] tdarray){
        int sum = sum(tdarray);
        int avg = sum/ tdarray.length;
        return sum ;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] tdarray){
        int min = 999999999; int[]oArray; int tempStorage;
        for(int i = 1; i <= tdarray.length; i++){
            oArray = tdarray[i];
            for(int e = 0; e < oArray.length; e++){
                if (oArray[e] < min){
                    min = oArray[e];
                }}}
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] tdarray){
        int max = -999999999; int[]oArray; int tempStorage;
        for(int i = 0; i < tdarray.length; i++){
            oArray = tdarray[i];
            for(int e = 0; e < oArray.length; e++){
                if (oArray[e] < max){
                    max = oArray[e];
                }}}
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] tdarray){
        int even = 0; int[]oArray;
        for(int i = 0; i < tdarray.length; i++){
            oArray = tdarray[i];
            for(int e = 0; e < oArray.length; e++){
                if (oArray[e] % 2 == 0){
                    even++;
                }}}
        return even;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] tdarray){
        int even = 0; int[]oArray;
        for(int i = 0; i < tdarray.length; i++){
            oArray = tdarray[i];
            for (int j : oArray) {
                if (j % 2 == 0) {
                    even++;
                }}}
        return even;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] tdarray){
        boolean a = true; int[]oArray;
        for(int i = 0; i < tdarray.length; i++){
            oArray = tdarray[i];
            for (int j : oArray) {
                if (j < 0) {
                    a = false;
                }}}
        return a;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] tdarray){
        int a[] = new int[tdarray.length];  int[]oArray;
        for(int i = 0; i < tdarray.length; i++){
            oArray = tdarray[i];  int tempadder = 0;
            for (int j : oArray) {
                tempadder = j + tempadder;}
            a[i] = tempadder;
            }return a;}

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] tdarray){
        int a[] = new int[tdarray.length]; int[]oArray;
        for(int i = 0; i < tdarray.length; i++){
            int tempadder = 0; oArray = tdarray[i];
            for(int e = 0; e < oArray.length; e++) {
                tempadder = tdarray[e][i] + tempadder;}
            a[i] = tempadder;
            }return a;}
}
