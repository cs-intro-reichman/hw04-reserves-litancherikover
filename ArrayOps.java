public class ArrayOps {
    public static void main(String[] args) 
    {
        int[] exampleArray = {0,1,2,3,4,6};
        int missingNumber = findMissingInt(exampleArray);
        System.out.println(missingNumber);
    }
    
    public static int findMissingInt (int [] array) 
    {
        int Array_length = array.length;
        boolean[] boolArray = new boolean[Array_length+1];
        /*Initializing the array */
        for (int i = 0; i <= Array_length; i++)
        {
            boolArray[i]=false;
        }
        /*Now, we will fill in the boolean array, the values that apear in the given array */
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] <= Array_length) 
            { // Only mark true if the number is within the range
                boolArray[array[i]] = true;
            }
        }
        for (int i = 1; i <= Array_length; i++) 
        { // Start from 1 as we're looking for positive integers
            if (!boolArray[i]) 
            {
                return i;
            }
        }
        return Array_length + 1;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        return 0;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
