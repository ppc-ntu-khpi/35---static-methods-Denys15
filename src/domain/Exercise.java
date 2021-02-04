Аpackage domain;

/**
 * Class that callculates palindrome
 * @author Denys15
 */
public class Exercise {
    
    /**
     * Method returns whether the string is a palindrome
     * @param string string that will be check
     * @return boolean(true: if string is palindrome, false: if string isn`t palindrome)
     */
    public static boolean IsPalindrome(String string){
        
        string = string.replace(" ", "");
        
        String reverseString = new StringBuilder(string).reverse().toString();

        return reverseString.equalsIgnoreCase(string);
    }
}