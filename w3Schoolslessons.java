public class w3schoolslessons{
    public static void main(String[] args){
/*
 * If you want to print something there are two differnt ways. You can use the print() o
 * or the print;n() way. 
 * the println() way will first print what you want and then go to the next line
 */
        System.out.println("This will print and then go to the next line");
        /*
         * The next way to print something is to use the print() way. 
         * the differece is that it will print what you want but not do the same thing as
         * a println() it wont go to the next line. 
         */
        System.out.print("After this the next line will execute");
     



    /*
     * Varaibles:
     * to instantiate a variabe it goes in this order:
     * type name = value;
     * example:
     */
    // int myNum = 15;
    // System.out.println(nyNum);

    // use the final keywod if you do not want other or yourself to overwrite
    // the existing values of the variable 

    // example:
    final int number = 15;

    // now no one later in the code can change this variable value
    // here are some more examples of declaring variables
    int myinteger = 5;
    float myFloatNum = 5.99f;
    char myLetter = 'D';
    boolean myBool = true;
    String myText = "Hello";

    /*
     * If you want to desply variables you can use the println() method aslo. 
     * To combine both text and a variable, use the + charcter:
     */
    
     //Example:
     String name = "John";
     System.out.println("Hello" + name);

     /*
      * Additionally you can use the + character to add a variable to another variable:
      */

      String firstName = "John";
      String lastName = "Doe";
      String fullName= firstName + lastName;
      System.out.println(fullName);

      /*
       * For numeric values, the + character works as a mathematical operator
       */

       int x = 5;
       int y = 6;
       System.out.println(x + y); // print the value of x + 
       
       /* 
        * If yuou want to decare mroe than one variable of the same type, you can use a comma-separated list:
        */
        //ex:
        int a = 6, b = 7, c = 8;
        System.out.println( a + b + c);
        
        /*
         * One value to multiple varaibles:
         * You can also assign the same value to multiple variable in one line
         */

         int d, e, f;
         d = e = f = 50;
         System.out.println(d + e + f);

         /*
          * Identifieers are the unique names people call the java variables
          */
          int myNum2 = 5;   //Integer (whole number)
          float myFloatNum2 = 5.99f;    // floating point number
          char myLetter2 = 'D';     // character
          boolean mybooli = true;   // boolean
          String mytexti = "Hello";   //String
        /*
         * primitive data types - includes, byte, short, int, long, float, double, boolean, and char
         * non-primitive data types - such as String, Arrays anc classes
         * 
         * Primitive number types are divided into two groups:
         *  Integer types:
         *      Stores whole numbers, positive or ngavtive without decimals:
         *          byte, short, int, long
         * Floating point types: 
         *      Represents numbers wioth a fractional part containing one or more decimals
         *          float double
         * 
         * 
         * Characters
         *  the char data type is used to store a single character. The character must be
         * surrounded by single quotes like 'A' or 'C' 
         *  or yuou can use the ASCII values
         */

         char myvar1 = 65, myVar2 = 66, myVar3 = 67;
         System.out.println(myvar1);
         System.out.println(myVar2);
         System.out.println(myVar3);



         /*
          * Java Type Casting
            Thgere are two types of casting:
            Widening casting (automatically) -  converting a smaller type to a larger type size
                byte --> short --> char --> int --> long --> float --> double 
            narrowing Casting (manually) - converting a larger type to a smaller size type
                double --> float --> long --> int --> char --> short --> byte
        */


        /* 
        * IMPORTANT NEW
        * for this one instead of just writting the variables such as:
        */

        String randomName = "Sarah ";
        String bandomName = "Samantha";
        System.out.println(randomName + bandomName);

        /*
        * You can do the exact same thing but using the concat() method. 
        * this is how you use it:
        */
        System.out.println(randomName.concat(bandomName));
        /*
         * See?? exactly the same but a differnt way to execute it. 
        */


        /*
         * Another thing is this: when you use the + opperator there are differnt 
         * outputs.
         * For example when you use the + opperator for Strings the result will be 
         * concatenated.
         * While when you use the + opperator for int the result will be added. 
         * When you use a mixture of Strings and ints, then the result will be concatenated.
         */


         /*
          * when you want to do the if statements in a differnt way you can do this:
          
          switch(expression) {
            case x:
                // code block
                break;
            case y:
                // code block
                break;
            default:
                // code block
          }
          */

          /*
           * This is the do/while loop:
           * do {
                // code block to be executed
            }
            while (condition);

            for this one. while the code will execute once then check if the condition 
            is still true. Then after that it will continue like a while loop would have

           */

            /* 
            there is also a for each loop which will loop items through an array
            
           for (type variableName : arrayName) {
            // code block to be executed
          }
        */

        /*
         * IMPORTANT
         * the 
         * import java.util.Scanner
         * is for the user input. 
         */




    }

}
