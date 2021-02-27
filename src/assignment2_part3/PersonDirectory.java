/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_part3;

/**
 *
 * @author dhankuwarsisodiya
 */
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author adicyborg
 */
public class PersonDirectory extends Person{

    public PersonDirectory(int personId, String name, int age, LocalDate dob) {
        super(personId, name, age, dob);
    }

    public static ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public static void setPersonDirectory(ArrayList<Person> personDirectory) {
        PersonDirectory.personDirectory = personDirectory;
    }
  
    private static ArrayList<Person> personDirectory;
    
    
}