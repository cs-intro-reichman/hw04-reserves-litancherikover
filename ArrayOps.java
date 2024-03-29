public class ArrayOps {
    public static void main(String[] args) 
    {
        int[] exampleArray_missing = {0};
        int missingNumber = findMissingInt(exampleArray_missing);
        System.out.println("The missing number is:"+missingNumber);
        int[] exampleArray_second = {2,8,3,7,1};
        int SecondMaxValue = secondMaxValue(exampleArray_second);
        System.out.println("The second biggest number is:"+SecondMaxValue);
        int[] array1 = {2,8,2,7,1};
        int[] array2 = {2,8,2,7,1};
        boolean containsTheSameElements_answer = containsTheSameElements(array1, array2);
        System.out.println("Is both arrays have same digits:"+containsTheSameElements_answer);
        int[] array_asc_desc = {1,2,-1,3};
        boolean isSorted_answer = isSorted(array_asc_desc);
        System.out.println("Is array decreasing or ascending:"+isSorted_answer);

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
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 1; j < (n - i); j++) 
            {
                if (array[j-1] < array[j]) 
                {
                    // Swap elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[1];
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean Flag=false;
        for(int i=0;i<array1.length;i++)
        {
            for(int k=0;k<array2.length;k++)
            {
                if(array1[i]==array2[k])
                {
                    Flag=true;
                }
            }
            if(Flag==false)
                {
                    return false;
                }
            Flag=false;
        }
        for(int i=0;i<array2.length;i++)
        {
            for(int k=0;k<array1.length;k++)
            {
                if(array2[i]==array1[k])
                {
                    Flag=true;
                }
            }
            if(Flag==false)
                {
                    return false;
                }
            Flag=false;
        }
        return true;
    }

    public static boolean isSorted(int [] array) 
    {
        boolean increasing = true;
        boolean decreasing = true;
        // Check if the array is sorted in increasing order
        for (int i = 0; i < array.length - 1; i++) 
        {
            if (array[i] > array[i + 1]) 
            {
                increasing = false;
                break;
            }
        }

        // Check if the array is sorted in decreasing order
        if (!increasing) 
        {
            for (int i = 0; i < array.length - 1; i++) 
            {
                if (array[i] < array[i + 1]) 
                {
                    decreasing = false;
                    break;
                }
            }
        }
        return increasing || decreasing;
    }

}
