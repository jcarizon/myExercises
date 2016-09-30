package objects;

/**
 * Created by nxtlvl on 9/28/2016.
 */

public abstract class Person {

    public Person(){

    }
    private String firstName;
    private String lastName;
    private String email;

    // constructor, work as a setter
    public Person (String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String introduceYourSelf () {
        String intro = "Hi I'm " + firstName + " " + lastName;
        return intro;
    }

    /**
    public void setFirstName(String firstName) {
       this.firstName = firstName;

    }
    */

    public String getFirstName () {

        return this.firstName;
    }

    /**
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

     */
    public String getLastname () {
        return this.lastName;
    }

    /**
    public void setEmail (String email) {
        this.email = email;
    }

    */
    public String getEmail () {
        return this.email;
    }
}
