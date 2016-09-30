package objects;

import objects.Person;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public class Customer extends Person {

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /*
    @Override
    public String introduceYourSelf () {
        String fname = getFirstName();
        String lname = getLastname();

        String introd = "Hi," + " " +fname + " " + lname + " " + "and a customer.";
        return introd;
    }
    */

    public String introduceYourSelf (String buySomething){

        String fname = getFirstName();
        String lname = getLastname();

        String introd  = "Hi, I'm" + " " + fname + " " + lname + " " + "and I "  + buySomething ;
        return introd;
    }

    private String address;
    private int telephoneNumber;
    private int customerId;
}
