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
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author adicyborg
 */
public class EncounterHistory extends Encounter implements Comparator<Encounter>{
  
    private static ArrayList<Encounter> encounterHistory = new ArrayList<Encounter>();

    public EncounterHistory(int encounterId, LocalDate encounterDate) {
        super(encounterId, encounterDate);
    }
    
    public static ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public static void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        EncounterHistory.encounterHistory = encounterHistory;
    }

    EncounterHistory() {
    }

    
    

    public int getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(int encounterId) {
        this.encounterId = encounterId;
    }

    public LocalDate getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(LocalDate encounterDate) {
        this.encounterDate = encounterDate;
    }
    
    public void addEncounterHistory(Encounter e){
        int id = this.encounterHistory.size()+1;
       e.setEncounterId(id);
       encounterHistory.add(e);
    }

    @Override
    public int compare(Encounter o1, Encounter o2) {
        return o1.getEncounterDate().compareTo(o2.getEncounterDate());
    }
}