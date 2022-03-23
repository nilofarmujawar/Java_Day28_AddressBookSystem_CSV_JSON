package com.day28;

/**
 * import all classes
 */

import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/**
 * create a class name as JSONService
 */
public class JSONService {
    /**
     * create a variable and STRING_ARRAY_SAMPLE varible assign the addressBook.json
     */
    private static final String STRING_ARRAY_SAMPLE = "addressBook.json";

    /**
     * crete a parameterized method name as writeJson
     * Method for write JSON file
     * @param addressBookSystem all persons data stored
     * @throws Exception
     */
    public void writeJson(Map<String, Set<ContactPerson>> addressBookSystem) throws Exception {
        /**
         * crete a list and create object name as contactList
         */
        List<ContactPerson> contactList = new ArrayList<ContactPerson>();
        for (Map.Entry<String, Set<ContactPerson>> me : addressBookSystem.entrySet()) {
            /**
             * crete a list the getvalue is value corresponding to this entry and collect data to list and
             *
             */
            List<ContactPerson> contactDeatilsList = me.getValue().stream().collect(Collectors.toList());
            /**
             * calling add all method from contactList object
             */
            contactList.addAll(contactDeatilsList);
        }
        /**
         * crete object name as gson
         */
        Gson gson = new GsonBuilder().create();
        /**
         * crete a list
         */
        List list = contactList.stream().collect(Collectors.toList());
        String json = gson.toJson(list);
        /**
         * crete object for  FileWriter class ,object name is writer
         */
        FileWriter writer = new FileWriter(STRING_ARRAY_SAMPLE);
        /**
         * calling write method from writer object
         */
        writer.write(json);
        /**
         * calling close method from writer object
         */
        writer.close();
        /**
         * display 123
         */
        System.out.println("123");
    }

    /**
     * crete a method name as readJson
     * Method for Read JSON file
     * @return count
     */
    public int readJson() {
        //variable
        int count = 0;
        /**
         * using try catch block for exception handling
         */
        try {
            Reader reader = Files.newBufferedReader(Paths.get(STRING_ARRAY_SAMPLE));
            /**
             * crete a list and object ,object name is addresBook
             */
            List<ContactPerson> addresBook = new Gson().fromJson(reader, new TypeToken<List<ContactPerson>>() {
            }.getType());
            /**
             * Iterators allow the caller to remove elements from the
             * underlying collection during the iteration with well-defined semantics.
             */
            Iterator<ContactPerson> jsonIterator = addresBook.iterator();

            /**
             * calling hasNextmethod from jsonIterator object
             */
            while (jsonIterator.hasNext()) {
                count++;
                ContactPerson adressBook = jsonIterator.next();
                /**
                 * here calling getFirstname method from addressbook object
                 * get first name in addressbook and display first name
                 */
                System.out.println("First Name : " + adressBook.getFirstName());
                /**
                 * here calling getLastname method from addressbook object
                 * Display Last name of person in addressbook
                 */
                System.out.println("Last Name : " + adressBook.getLastName());
                /**
                 * here calling getAddress method from addressbook object
                 * get persons address in addressbook and display
                 */
                System.out.println("Address: " + adressBook.getAddress());
                /**
                 * here calling getCity method from addressbook object
                 * get persons city in addressbook and displaying data
                 */
                System.out.println("City : " + adressBook.getCity());
                /**
                 * here calling getState method from addressbook object
                 * get persons state name in addressbook and display
                 */
                System.out.println("State : " + adressBook.getState());
                /**
                 * here calling getZip method from addressbook object
                 * get persons zip code in addressbook and display
                 */
                System.out.println("Zip : " + adressBook.getZip());
                /**
                 * here calling getPhoneNo method from addressbook object
                 * get persons phone no in addressbook and display
                 */
                System.out.println("Number : " + adressBook.getPhoneNo());
                /**
                 * here calling getEmailId method from addressbook object
                 * get persons email id in addressbook and display
                 */
                System.out.println("Email : " + adressBook.getEmailId());
                System.out.println("*****************");
            }
            /**
             * calling close method from reader object
             */
            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return count;
    }
}