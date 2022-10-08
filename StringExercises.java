package string.exercises;

public class StringExercises {

    public static void main(String[] args) {
        //Exercise 1
        //Write a Java program to get the character at the given index within the String
        /*Original String = Java Exercises!                                                                             
        The character at position 0 is J                                                                              
        The character at position 10 is i */
        
        String string = "Java Exercises!";
        
        println("The character at position 0 is " + string.charAt(0));
        println("The character at position 10 is " + string.charAt(0));
        
        //Exercise 2
        /*2. Write a Java program to compare two strings lexicographically. 
        Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.*/
        
        String str1 = "This is exercise 1";
        String str2 = "This is exercise 2";
        
        int result = str1.compareTo(str2);
        
        if(result == 0)
            println("The two strings arer equal");
        else if(result<0)
            println("String 2 is greater than string 1");
        else
            println("string 1 is greater than string 2");
        
        //Exercise 3
        /*3. Write a Java program to compare two strings lexicographically, ignoring case differences.*/
        
        str1 = "HeLLo wOrLd!";
        str2 = "hello WORLD!";
        
        result = str1.toLowerCase().compareTo(str2.toLowerCase());
        
        if(result == 0)
            println("The two strings are equal");
        else
            println("The two strings are not equal");
        
        //Exercise 4
        /*4. Write a Java program to concatenate a given string to the end of another string.*/
        
        str1 = "Java and ";
        str2 = "c++!";
        
        
        println(str1.concat(str2));
        
        //Exercise 5
        /*5. Write a Java program to test if a given string contains the specified sequence of char values.*/
        
        str1 = "Just do it";
        
        if(str1.contains("do")) println("true");
        else println("false");
        
        //Exercise 6
        /*6. Write a Java progra, to check if a string ends witdth the gioven sequence of char values
        */
        
        str1 = "hello";
        
        if(str1.endsWith("lo")) println("true");
        else println("false");
        
        
        
        
    }
    
    public static void println(String string){
        System.out.println(string);
    }
    
}
