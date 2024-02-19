public class ArrayOps {
    public static void main(String[] args) 
    {
        int[] exampleArray_missing = {0};
        int missingNumber = findMissingInt(exampleArray_missing);
        System.out.println("The missing number is:"+missingNumber);
        int[] exampleArray_second = {1, -2, 3, -4, 5};
        int SecondMaxValue = secondMaxValue(exampleArray_second);
        System.out.println("The second biggest number is:"+SecondMaxValue);

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
            if (array[i] >= 0 && array[i] <= Array_length) 
            { // Only mark true if the number is within the range
                boolArray[array[i]] = true;
            }
        }
        for (int i = 0; i < Array_length; i++) 
        { 
            if (!boolArray[i]) 
            {
                return i;
            }
        }
        return Array_length;
    }

    public static int secondMaxValue(int [] array) 
    {
        int temp_max=array[0];
        int max=array[0];
        for (int i = 0; i < array.length; i++) 
        {
            if(array[i]>=temp_max)
            {
                temp_max=array[i];
            }
        }
        for (int i = 0; i < array.length; i++) 
        {
            if(array[i]>=max && array[i]!=temp_max)
            {
                max=array[i];
            }
        }
        return max;
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
