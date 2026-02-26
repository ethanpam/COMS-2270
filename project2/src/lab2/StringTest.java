package lab2;

public class StringTest
{
    public static void main(String[] args)
    {
        String message = "Hello World";
        System.out.println(message);

        // .length; = len()
        int theLength = message.length();
        System.out.println(theLength);

        //charAt(int index); = [:] in python
        char theChar = message.charAt(0);
        System.out.println(theChar);

        theChar = message.charAt(1);
        System.out.println(theChar);

        //Largest index
        theChar = message.charAt(theLength-1);
        System.out.println(theChar);

        // Uppercase version of 'message'
        System.out.println(message.toUpperCase());

        // Substring method
        System.out.print(message.substring(0,5));
    }
}
