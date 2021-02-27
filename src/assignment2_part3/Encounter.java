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
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author adicyborg
 */
public class Encounter extends VitalSigns implements Comparator<Encounter>{
  
  public int encounterId;
  public LocalDate encounterDate;  

    public Encounter(int encounterId, LocalDate encounterDate) {
        this.encounterId = encounterId;
        this.encounterDate = encounterDate;
    }

    Encounter() {
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

  @Override
    public int compare(Encounter o1, Encounter o2) {
        return o1.getEncounterDate().compareTo(o2.getEncounterDate());
    }


}