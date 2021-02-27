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
public class PatientDirectory extends Patient{
  
    private static ArrayList<Patient> patientDirectory;

    public static ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public static void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        PatientDirectory.patientDirectory = patientDirectory;
    }
    
    public PatientDirectory(int patientId, int personID, int encounterHistoryId, int personId, String name, int age, LocalDate dob) {
        super(patientId, personID, encounterHistoryId, personId, name, age, dob);
        
    }

    PatientDirectory() {
        patientDirectory = new ArrayList<Patient>();
    }
    
   public void add(Patient p){
       int id = this.patientDirectory.size()+1;
       p.setPatientId(id);
       patientDirectory.add(p);
   }
   public static boolean doesPatientRecordExists(int Id){
        if(patientDirectory != null){
           for(Patient p : patientDirectory){
            if(p.getPatientId() == Id){
                return true;
            }
            } 
        }
        return false;
    }
}