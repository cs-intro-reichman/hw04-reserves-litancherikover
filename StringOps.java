public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) 
    {
        //Different tests that i have created
        String answer_vowels=capVowelsLowRest("Hello World");   
        System.out.println(answer_vowels);
        String answer_camel=camelCase("HELLO world");   
        System.out.println(answer_camel);
        int[] answer_indexes=allIndexOf("Hello world",'l');   
        for (int i = 0; i < answer_indexes.length; i++) 
        {
            System.out.println(answer_indexes[i]);
        }

    }

    public static String capVowelsLowRest(String string) 
    {
        char[] result = new char[string.length()];
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < string.length(); i++) 
        {
            char c = string.charAt(i);
            boolean isVowel = vowels.indexOf(c) >= 0;
            if (isVowel) 
            {
                // Convert to uppercase if it's a vowel
                if (c >= 'a' && c <= 'z') 
                {
                    result[i] = (char) (c - 32);
                } 
                else 
                {
                    result[i] = c;
                }
            } 
            else 
            {
                // Convert to lowercase if it's not a vowel
                if (c >= 'A' && c <= 'Z') 
                {
                    result[i] = (char) (c + 32);
                } 
                else 
                {
                    result[i] = c;
                }
            }
        }
        return new String(result);
    }

    public static String camelCase (String string)
     {
        String result = "";
        boolean isNewWord = false;
        // Process first character
        char firstChar = string.charAt(0);
        if (firstChar >= 'A' && firstChar <= 'Z')
        {
            // conversion to lowercase
            result += (char) (firstChar + 32); 
        } 
        else 
        {
            result += firstChar;
        }

        for (int i = 1; i < string.length(); i++) 
        {
            char c = string.charAt(i);
            if (c == ' ') 
            {
                isNewWord = true;
            } 
            else 
            {
                if (isNewWord) 
                {
                    if (c >= 'a' && c <= 'z') 
                    {
                        result += (char) (c - 32); // Convert to upper
                    } 
                    else 
                    {
                        result += c;
                    }
                    //Not new word anymore
                    isNewWord = false;
                } 
                else 
                {
                    if (c >= 'A' && c <= 'Z')
                    {
                        result += (char) (c + 32); // Convert to lower
                    } 
                    else
                    {
                        result += c;
                    }
                }
            }
        }
        return result;
    }

    public static int[] allIndexOf (String string, char chr) 
    {
        // We are counting the number of occurences in the string
        int count = 0;
        for (int i = 0; i < string.length(); i++) 
        {
            if (string.charAt(i) == chr) 
            {
                //The number of cells in the new array
                count++;
            }
        }

        // Initialize an array of size count
        int[] occurences = new int[count];
        for (int i = 0; i < occurences.length; i++) 
        {
            occurences[i]=0;
        }
        // Now we fill the array that we will return. 
        int index = 0;
        for (int i = 0; i < string.length(); i++) 
        {
            if (string.charAt(i) == chr) 
            {
                occurences[index++] = i;
            }
        }
        //the array will not return empty
        return occurences;
    }
    
}
