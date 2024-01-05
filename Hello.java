public class Hello{
    public static void main(String[] args){
        // single line comment
        /*multi line comment
          we can use this to comment multiple lines
         */

        //  this is used print the output
        // System.out.println("Hello World");


        // we can do any mathematical stuff in between the parantheses
        // System.out.println(12*5);


        // this will throw an error...java is case sensitive...we cannot change the syntax
        // system.out.println("hello");

        // error---to print the exact, we put the sentence in betweeen the " "
        // System.out.println(hello);

        // prints hello
        // System.out.println("hello");

        // concatination---it is done using + operator
        // System.out.println(10+6 + "hello");


        // Basic operators

        // add
        // System.out.println(5+2);

        // subtract
        // System.out.println(43-4);

        // multiply
        // System.out.println(4*2);

        // division
        // System.out.println(5/2);

        
        // BODMAS---it is followed here as well, and follows the precedence
        /*
         * () highest
         * * and / are same...whatever comes first, executes
         * + and - are same
         */

        //  System.out.println(4 + 3 * 6 - 7/2);       //prints 19



        // DATATYPES
        // creating variable with name temp and assigning the value of 20
        // int temp; // declaration
        // temp = 20; // initialization
        // shortcut
        // int temp = 20;  //int datatype is stores only integer type data
        // System.out.println(temp);


        // int temp= 12;  // throws an error...cannot make a variable of same name
        // System.out.println(temp);


        int temp = 10;
        System.out.println(10); //prints 10
        temp = 23;  //reinitialize temp = 23
        System.out.println(temp);   //prints 23
    }

}