package Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by nxtlvl on 9/30/2016.
 */
public class MyCollections {

    public static String randomizer(List<String> randomizer) {

        int x = randomizer.size();
        Random random = new Random();
        int randomNum = random.nextInt(x) + 0;

        return randomizer.get(randomNum);
    }
    public static void generator(){
        String myFriend = randomizer(myFriends());
        String girlFriend = randomizer(myGirlFriends());
        String relationship = randomizer(relationship());

        String generate = myFriend +" is " + relationship + " with " +girlFriend +".";
        System.out.println(generate);
    }
    public static List relationship(){

        List<String> relationship = new ArrayList<String>();

        relationship.add("In love");
        relationship.add("Complicated");
        relationship.add("Married");

        return relationship;

    }
    public static void Space() {
        System.out.println("++++++++++++++++++++");
    }
    public static List myFriends(){

        //arrays
        List<String> myFriends = new ArrayList<String>();

        myFriends.add("Aliparts");
        myFriends.add(1, "Chevy");
        myFriends.add(2, "Jeremiah");
        myFriends.add(3, "JM");
        myFriends.add(4, "Loki");
        myFriends.add(5, "Peen");
        myFriends.add(6, "Peter");
        myFriends.add(7, "Roden");
        myFriends.add(8, "Sol");

        return myFriends;

 //       for(int i = 0; i < myFriends.size(); i++){
 //           System.out.println("Friends:" + " " +myFriends.get(i));
 //       }

    }

    public static List myGirlFriends (){
        List<String> myGirlFriends = new ArrayList<String>();

        myGirlFriends.add("Angel Locsin");
        myGirlFriends.add(1, "himself");
        myGirlFriends.add(2, "his thing");
        myGirlFriends.add(3, "Jennifer Lawrence");
        myGirlFriends.add(4, "Liza Soberano");
        myGirlFriends.add(5, "Selena Gomez");
        myGirlFriends.add(6, "Wala bitaw");

        return myGirlFriends;

 //        for(int i = 0; i < myGirlFriends.size(); i++){
 //           System.out.println("Girl Friends:" + " " +myGirlFriends.get(i))
 //   }


    }
}
