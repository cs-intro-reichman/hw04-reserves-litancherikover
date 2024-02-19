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
        String answer_vowels=capVowlesLowRest("Hello World");   
        System.out.println(answer_vowels);
    }

    public static String capVowlesLowRest(String string) 
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

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
