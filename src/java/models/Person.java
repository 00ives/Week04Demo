package models;

import java.io.Serializable;

/**
 *
 * @author ivorl
 */
public class Person implements Serializable{
    private String firstname;
    private String lastname;

    public Person() {
        firstname = "";
        lastname = "";
    }

    public Person(String firstName, String lastName) {
        this.firstname = firstName;
        this.lastname = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastName) {
        this.lastname = lastName;
    }
    
    
    
}
