package WrapperClasses;

public class CharacterClass
{
    public static void main(String[] args)
    {
        // Java program to demonstrate isLetter() method
        // boolean isLetter(char ch) 1. boolean isLetter(char ch): This method is used to determine whether the specified char
        // value(ch) is a letter or not. The method will return true if it is letter([A-Z],[a-z]), otherwise return false
        {
            System.out.println(Character.isLetter('A'));

            System.out.println(Character.isLetter('0'));

            // print false as A is character
            //It returns true if ch is a digit, otherwise, return false
            System.out.println(Character.isDigit('A'));

            System.out.println(Character.isDigit('0'));

           // It returns true if ch is whitespace, otherwise, returns false
            System.out.println(Character.isWhitespace('A'));
            System.out.println(Character.isWhitespace(' '));
            System.out.println(Character.isWhitespace('\n'));
            System.out.println(Character.isWhitespace('\t'));
            // ASCII value of tab
            System.out.println(Character.isWhitespace(9));

            System.out.println(Character.isWhitespace('9'));

            //It returns true if ch is upper case, otherwise, returns false.
            System.out.println(Character.isUpperCase('A'));
            System.out.println(Character.isUpperCase('a'));
            System.out.println(Character.isUpperCase(65));

            //It returns true if ch is lower case, otherwise, returns false.
            System.out.println(Character.isLowerCase('A'));
            System.out.println(Character.isLowerCase('a'));
            System.out.println(Character.isLowerCase(97));

        }
    }
}
