package WrapperClasses;

public class ExplicitConverstion
{
    // Java program to Illustrate Explicit Type Conversion

    // Main class

        // Main driver method
        public static void main(String[] args)
        {

            // Double datatype
            double d = 100.04;

            // Explicit type casting by forcefully getting
            // data from long datatype to integer type
            long l = (long)d;

            // Explicit type casting
            int i = (int)l;

            // Print statements
            System.out.println("Double value " + d);

            // While printing we will see that
            // fractional part lost
            System.out.println("Long value " + l);

            // While printing we will see that
            // fractional part lost
            System.out.println("Int value " + i);
        }
    }

