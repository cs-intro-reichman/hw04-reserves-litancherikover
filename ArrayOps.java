public class ArrayOps {
    public static void main(String[] args) 
    {
        int[] exampleArray = {0, 1, 2, 4, 5, 6, 7, 8, 9};
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
        for (int i = 0; i <array.length; i++)
        {
            boolArray[array[i]]=true;
        }
        for (int i = 0; i <array.length; i++)
        {
            if (boolArray[i]==false) 
            {
                return i;    
            }
        }
        return -1;
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
