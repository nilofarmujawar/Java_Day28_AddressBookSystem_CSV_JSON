package com.day28;

/**
 * create a class name as ContactPerson
 */
public class ContactPerson {
    /**
     * private variables can only be accessed within the same class (an outside class has no access to it)
     * private = restricted access
     * However, it is possible to access them if we provide public get and set methods.
     */

    // variables
    private String firstName, lastName, address, city, state;
    private int zip;
    private long phoneNo;
    private String emailId;

    /**
     * Used getter and setter to set and get the value.
     * Setter is used to set the value
     * Getter is used to get the value
     */


    /**
     * crete a get method name as getFirstName
     * The get method returns the value of the variable
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * crete a get method name as getLastName
     * The get method returns the value of the variable
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * crete a get method name as getAddress
     * The get method returns the value of the variable
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * crete a get method name as getCity
     * The get method returns the value of the variable
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * crete a get method name as getState
     * The get method returns the value of the variable
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * crete a get method name as  getZip
     * The get method returns the value of the variable
     * @return zip
     */
    public int getZip() {
        return zip;
    }

    /**
     * crete a get method name as getPhoneNo
     * The get method returns the value of the variable
     * @return phoneNo
     */
    public long getPhoneNo() {
        return phoneNo;
    }

    /**
     * crete a get method name as getEmailId
     * The get method returns the value of the variable
     * @return emailId
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * create a parameterized constructor
     * @param firstName persons in address book
     * @param lastName persons in address book
     * @param address persons in address book
     * @param city persons in address book
     * @param state persons in address book
     * @param zip persons in address book
     * @param phoneNo persons in address book
     * @param emailId persons in address book
     */
    public ContactPerson(String firstName, String lastName, String address, String city, String state, int zip,
                         long phoneNo, String emailId) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ContactPerson other = (ContactPerson) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        return true;
    }

    /**
     * create a method hashcode
     * @return 10
     */
    public int hashCode() {
        return 10;
    }

    /**
     * overriding the toString() method
     * @return firstname , lastName,Address,Zip,City,State,email,phone number.
     *
     */
    @Override
    public String toString() {
        return "firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + ", emailId=" + emailId;
    }
}