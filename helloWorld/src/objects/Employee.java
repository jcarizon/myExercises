package objects;

import objects.Person;

/**
 * Created by nxtlvl on 9/28/2016.
 */
public class Employee extends Person {


    private String department;
    private float payGrade;
    private int employeeId;


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(float payGrade) {
        this.payGrade = payGrade;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String introduceYourSelf () {
        String lname = getLastname();
        String fname = getFirstName();

        String introd = "I'm" + " " + lname + " " + fname + " " + "and an employee.";
        return introd;
    }

}
