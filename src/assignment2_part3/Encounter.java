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

/**
 *
 * @author adicyborg
 */
public class Encounter extends VitalSigns{
  
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

  


}