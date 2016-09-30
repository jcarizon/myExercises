import Exercises.MyCollections;
import objects.Animal;
import objects.Employee;
import objects.Person;
import objects.Customer;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        MyCollections.MyGirlFriends();
        MyCollections.Space();
        MyCollections.MyFriends();
        MyCollections.Relationship();
        */
        MyCollections.generator();



        // this is just a comment (one line comment)

        /*
            this a comment block
         */

        /** (a documentation comment block)
         *
         * this is also a comment
         * (multiple line comment)
         *
         * */

        /* TODO comments */


        /** Primitive variables */
        //int x = x;

        /*
        byte bytevariable = 102; //range from -128 tp 127
        short mediumRangeDecimalVariable = 12345; //range from -32768 to 32767
        int decimalVariableUpTo = 123123; //in java <8 from -2147483648 to 214783647 Java+ 4294967296
        long largeDecimalVariableFrom = -23487953L;
        long largeDecimalVariableUpTo = largeDecimalVariableFrom;
        float numberWithDecimalPlaces = 2.12f;
        double veryLargeNumberWithDecimalPlaces = 1.323878783;
        boolean isTrueOrFalse = false;
        char singleCharacter = '\ubaba'; //min \u0000 max \uffff

        largeDecimalVariableFrom = largeDecimalVariableUpTo;

        String someText = "this is a string variable";


        System.out.println(bytevariable);
        System.out.println(mediumRangeDecimalVariable);
        System.out.println(decimalVariableUpTo);
        System.out.println(largeDecimalVariableFrom);
        System.out.println(largeDecimalVariableUpTo);
        System.out.println(numberWithDecimalPlaces);
        System.out.println(veryLargeNumberWithDecimalPlaces);
        System.out.println(isTrueOrFalse);
        System.out.println(singleCharacter);
        System.out.println(someText);
        System.out.println("Hello World!");
        */

        // Objects

        // first exercise
        /*
        Person person = new Person("Juan","Marcos","haha@gmail.com");
        person.introduceYourSelf();

        String theFirstname = person.getFirstName();
        String theLastName = person.getLastname();
        String theEmail = person.getEmail();

        System.out.println(theFirstname);
        System.out.println(theLastName);
        System.out.println(theEmail);
        */
        /*
        //second exercise

        String theIntro = person.introduceYourSelf();

        System.out.println(theFirstname);
        System.out.println(theLastName);
        System.out.println(theEmail);
        System.out.println(theIntro);
        */

        /*
        // inheritance exercise
        Employee employee = new Employee();
        employee.setFirstName("Jhon");
        employee.setLastName("Mark");

        String introduce =  employee.introduceYourSelf();

        System.out.println("+++++++++++++++++++");
        System.out.println(introduce + " " + ".");

        /*
        // homework activity
        Animal animal = new Animal();
        animal.setName("Lizard");
        animal.setLegs(4);
        animal.setExtinctOrNot(false);

        String name = animal.getName();
        int legs = animal.getLegs();
        boolean extinct = animal.isExtinctOrNot();

        System.out.println("+++++++++++++++++++");
        System.out.println("Animal Name:" +" " + name);
        System.out.println("Number of legs:" +" " + legs);
        System.out.println("Is extinct or not:" + " " + extinct);
        */

        // polymorphism exercise

        /*
        Customer customer = new Customer();
        String introduceI = customer.introduceYourSelf("want to buy something.");

        System.out.println("+++++++++++++++++++");
        System.out.println(introduceI);


        int x = 0;
        if (x == 5) {
            System.out.println("You are handsome");
        } else if (x != 5) {
            System.out.println("You're ugly");
        } else {
            System.out.println("haha");
        }
        */

        /*
        int n = 1;
        int sum = 0;

        /*
        do {
            System.out.print("[" + n +"]");
            n++;
        }
        while (n <= 6);
        */
        /*
        int y = 1;
        int sum = 0;
        while (y <= 6) {
            sum += y;
            y++;
        }
            System.out.print(sum);
        */
        /*
         for(n = 1; n <= 6; n++){
             sum = sum + n;
         }
             System.out.print("[" + sum + "]");
        */



    }
}
