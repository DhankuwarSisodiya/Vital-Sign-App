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
public class Patient extends Person{
    
    public int patientId;
    public int personID;
    public int encounterHistoryId;

    public Patient(int patientId, int personID, int encounterHistoryId, int personId, String name, int age, LocalDate dob) {
        super(personId, name, age, dob);
        this.patientId = patientId;
        this.personID = personID;
        this.encounterHistoryId = encounterHistoryId;
    }

    Patient() {
        
        this.vitalSignHistory = new ArrayList<VitalSigns>() ;
    }
    
    private  ArrayList<VitalSigns> vitalSignHistory;

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
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

    public void setAge(int age) {
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getEncounterHistoryId() {
        return encounterHistoryId;
    }

    public void setEncounterHistoryId(int encounterHistoryId) {
        this.encounterHistoryId = encounterHistoryId;
    }

}