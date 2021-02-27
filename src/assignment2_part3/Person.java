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
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author adicyborg
 */
public class Person {

//    public int personId;
    public String name;
    public int age;
    private LocalDate dob;
    
    public Person(int personId, String name, int age, LocalDate dob) {
        //this.personId = personId;
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    Person() {
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(LocalDate dob) {
        LocalDate today = LocalDate.now();
        Period diff = Period.between(
            LocalDate.parse(""+dob.getYear()+"-"+(dob.getMonthValue()<10 ? "0"+dob.getMonthValue(): dob.getMonthValue())+"-"+(dob.getDayOfMonth()<10 ? "0"+dob.getDayOfMonth(): dob.getDayOfMonth())+"").withDayOfMonth(1),
            LocalDate.parse(today.toString()).withDayOfMonth(1));

        this.age = (diff.getMonths()+(diff.getYears()*12));
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.setAge(dob);
        this.dob = dob;
    }   
}