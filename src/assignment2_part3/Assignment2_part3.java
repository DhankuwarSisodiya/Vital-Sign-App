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
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2_part3 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
        PatientDirectory pd = new PatientDirectory();
        VitalSigns vs = new VitalSigns(); 
        EncounterHistory eh = new EncounterHistory();
        System.out.println("MEDICAL RECORD");
        System.out.println("Enter Patient Details");
        
        int op;
        do {
            System.out.println("1. Add new Patient");
            System.out.println("2. View all patients");
            System.out.println("3. Add vital Signs");
            System.out.println("4. View vital sign history");
            System.out.println("5. View community statistics");
            System.out.println("Enter your choice");
       
            Scanner scanner2 = new Scanner(System.in);
            int choice = scanner2.nextInt();
        
            switch (choice)
            {
                case 1:  addNewPatient(pd);
                break;
        
                case 2: viewPatients(pd);
                break;
            
                case 3: addVitalSigns(pd, eh);
                break;
                
                case 4: displayRecords(pd, eh);
                break;
                
                case 5: viewCommunityStats(pd, eh);
                break;
                        
                default : System.out.println("You have entered an invalid choice");
                break;

            }
            System.out.println("Do you wish to continue? If yes, press '1' else press '0'");
            op = scanner2.next().charAt(0);
        
        } while(op!='0');
    }

    private static void addNewPatient(PatientDirectory pd) {
        Scanner scanner = new Scanner(System.in);
        
        Patient p = new Patient();
        System.out.println("1. Enter name.");
        p.setName(scanner.nextLine());
        
        System.out.println("2. Enter date of birth");
        String dateString = scanner.next();
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        p.setDob(date);
        
        System.out.println("3. Enter house No.");
        int houseId = scanner.nextInt();
        
        System.out.println("4. Enter pincode for community.");
        int communityID = scanner.nextInt();
        
//        System.out.println("4. Enter house address.");
        String address = "Address line";
        
        
        
        System.out.println("5. Enter city");
        String city = scanner.next();
        
        p.setHouse(houseId, address, communityID, city);
        
        pd.add(p);
        scanner.nextLine();
        System.out.println("Patient with patient id "+ p.getPatientId() +" created");
    }
    
    private static void viewPatients(PatientDirectory pd) {
        for(int i =0 ; i < pd.getPatientDirectory().size(); i++){
            System.out.println("Patient ID:" + pd.getPatientDirectory().get(i).getPatientId());
            System.out.println("Name:" + pd.getPatientDirectory().get(i).getName());
            System.out.println("Date of Birth:" + pd.getPatientDirectory().get(i).getDob());
            System.out.println("Age:" + pd.getPatientDirectory().get(i).getAge() + " months");
            System.out.println("House No:" + pd.getPatientDirectory().get(i).getHouseID());
            //System.out.println("Address:" + pd.getPatientDirectory().get(i).getAddressLine());
            System.out.println("Community:" + pd.getPatientDirectory().get(i).getCommunity());
            System.out.println("City:" + pd.getPatientDirectory().get(i).getCity());
            System.out.println("---------------------------------------------------------------");
        }
    }
    

        public static void addVitalSigns(PatientDirectory patients,EncounterHistory vitalSignHistory){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("M/dd/yyyy");
        Patient p1 = new Patient();
        
        System.out.println("Enter patient Id: ");
        p1.setPatientId(scanner.nextInt());
        boolean doesPatientRecordExists = false;
        doesPatientRecordExists = patients.doesPatientRecordExists(p1.patientId);
        scanner.nextLine();
        if(!doesPatientRecordExists){
          System.out.println("Enter patient name: ");
          p1.setName(scanner.nextLine());
          scanner.nextLine();
          
          System.out.println("Date of Birth (MM/DD/YYYY): ");
          String dateString = scanner.next();
          LocalDate date = LocalDate.parse(dateString, formatter);
          p1.setDob(date);  
          patients.add(p1);
        }
       
        Encounter vsh = new Encounter();
         
        vsh.setPatientId(p1.patientId);
        System.out.println("Enter patient's respiratory rate count: ");
        int respRate = scanner.nextInt();
        vsh.setRespiratoryRate(respRate);
        
        System.out.println("Enter patient's heart rate count: ");
        int heartRate = scanner.nextInt();
        vsh.setHeartRate(heartRate);
        
        System.out.println("Enter patient's blood pressure count: ");
        int bp = scanner.nextInt();
        vsh.setBloodPressure(bp);
        
        System.out.println("Enter patient's weight in kgs: ");
        double weightKgs = scanner.nextDouble();
        vsh.setWeightInKgs(weightKgs);
        
        System.out.println("Enter patient's weight in pounds: ");
        double weightPounds = scanner.nextDouble();
        vsh.setWeightInPounds(weightPounds);
        
        System.out.println("Enter date in MM/DD/YYYY format, on which the signs were recorded");
        vsh.setEncounterDate(LocalDate.parse(scanner.next(), formatter));
        
        vitalSignHistory.addEncounterHistory(vsh);
        scanner.nextLine();
        System.out.println("Do you want to enter more details?(Y/N)");
        String ans = scanner.nextLine();
        if("y".equals(ans.toLowerCase())  ){
            addVitalSigns(patients,vitalSignHistory);
        }
        else{
            return;
        }
        
    }
        
    public static void displayRecords(PatientDirectory patients, EncounterHistory vitalSignHistory){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Patient's Records are: ");
        for(Patient p : patients.getPatientDirectory()){
            System.out.println("----------------------------------");
            int j =1;
            System.out.println("Patient Id: "+ p.patientId);
            System.out.println("Patient Name: "+ p.getName());
            System.out.println("Patient's age in months is: "+ p.age);
            for(int i =0 ; i<vitalSignHistory.getEncounterHistory().size();i++){
                if(p.patientId == vitalSignHistory.getEncounterHistory().get(i).getPatientId()){            
                    System.out.println();
                    System.out.println("History "+ j+":");
                    System.out.println("History Date: "+ vitalSignHistory.getEncounterHistory().get(i).getEncounterDate());
                    System.out.println("Respiratory rate count: "+vitalSignHistory.getEncounterHistory().get(i).getRespiratoryRate());
                    System.out.println("Heart rate count: "+vitalSignHistory.getEncounterHistory().get(i).getHeartRate());
                    System.out.println("Blood pressure count: "+vitalSignHistory.getEncounterHistory().get(i).getBloodPressure());
                    System.out.println("Weight in kgs: "+vitalSignHistory.getEncounterHistory().get(i).getWeightInKgs());
                    System.out.println("Weight in pounds: "+vitalSignHistory.getEncounterHistory().get(i).getWeightInPounds());
                    System.out.println("To check for abnormality of this record you need enter parameter");
                    String para = scanner.nextLine();
                    
                    if(vitalSignHistory.getEncounterHistory().get(i).isPatientNormal(p,para)){
                        System.out.println(p.getName()+"'s health is not normal");
                    } else{
                        System.out.println(p.getName()+"'s health is healthy"); 
                    }
                    j++;
                }
            }          
        }
    }

    private static void viewCommunityStats(PatientDirectory patients, EncounterHistory vitalSignHistory) {
        Scanner scanner = new Scanner(System.in);
       
        for(Patient p : patients.getPatientDirectory()){
            for(int i =0 ; i<vitalSignHistory.getEncounterHistory().size();i++){
                if(p.patientId == vitalSignHistory.getEncounterHistory().get(i).getPatientId()){    
                    //vitalSignHistory.getEncounterHistory().get(i).checkForAbnormalBP(p);
                    System.out.println(vitalSignHistory.getEncounterHistory().get(i).getEncounterDate());
                }
            }  
        }
    }
}
