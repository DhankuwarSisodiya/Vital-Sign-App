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

/**
 *
 * @author adicyborg
 */
public class VitalSigns {
    
    private int patientId;
    private int respiratoryRate;
    private int heartRate;
    private int bloodPressure;
    private double weightInKgs;
    private double weightInPounds;

    public VitalSigns(int respiratoryRate, int heartRate, int bloodPressure, double weightInKgs, double weightInPounds) {
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.weightInKgs = weightInKgs;
        this.weightInPounds = weightInPounds;
    }

    VitalSigns() {
        
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

  
    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeightInKgs() {
        return weightInKgs;
    }

    public void setWeightInKgs(double weightInKgs) {
        this.weightInKgs = weightInKgs;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
    
    public boolean isPatientNormal(Patient p, String parameter){
        boolean isAbnormal = false;
        
        if(p.getAge() < 1){
            System.out.println(p.getName()+" is a newborn");
            if((checkLimits(30,50,this.getRespiratoryRate()) && parameter.equals("RR")) || (checkLimits(120,160,this.getHeartRate()) && parameter.equals("HR")) || (checkLimits(50,70,this.getBloodPressure()) && parameter.equals("BP")) || (checkLimitsDouble(2,3,this.getWeightInKgs()) && parameter.equals("WKG")) || (checkLimitsDouble(4.5,7,this.getWeightInPounds()) && parameter.equals("WP"))){
                isAbnormal = true;
            }
        } else if(p.getAge() < 12 && p.getAge() > 0){
            System.out.println(p.getName()+" is an infant");
            if((checkLimits(20,30,this.getRespiratoryRate()) && parameter.equals("RR")) || (checkLimits(80,140,this.getHeartRate()) && parameter.equals("HR")) || (checkLimits(70,100,this.getBloodPressure()) && parameter.equals("BP")) || (checkLimitsDouble(4,10,this.getWeightInKgs()) && parameter.equals("WKG")) || (checkLimitsDouble(9,22,this.getWeightInPounds()) && parameter.equals("WP"))){
                isAbnormal = true;
            }
        } else if(p.getAge() < 36 && p.getAge() > 12){
            System.out.println(p.getName()+" is a toddler");
            if((checkLimits(20,30,this.getRespiratoryRate()) && parameter.equals("RR")) || (checkLimits(80,130,this.getHeartRate()) && parameter.equals("HR")) || (checkLimits(80,110,this.getBloodPressure()) && parameter.equals("BP")) || (checkLimitsDouble(10,14,this.getWeightInKgs()) && parameter.equals("WKG")) || (checkLimitsDouble(22,31,this.getWeightInPounds()) && parameter.equals("WP"))){
                isAbnormal = true;
            }
        } else if(p.getAge() < 60 && p.getAge() > 35){
            System.out.println(p.getName()+" is a preschooler");
            if((checkLimits(20,30,this.getRespiratoryRate()) && parameter.equals("RR")) || (checkLimits(80,120,this.getHeartRate()) && parameter.equals("HR")) || (checkLimits(80,110,this.getBloodPressure()) && parameter.equals("BP")) || (checkLimitsDouble(14,18,this.getWeightInKgs()) && parameter.equals("WKG")) || (checkLimitsDouble(31,40,this.getWeightInPounds()) && parameter.equals("WP"))){
                isAbnormal = true;
            }
        } else if(p.getAge() < 144 && p.getAge() > 60){
            System.out.println(p.getName()+" is of school age");
            if((checkLimits(20,30,this.getRespiratoryRate()) && parameter.equals("RR")) || (checkLimits(70,110,this.getHeartRate()) && parameter.equals("HR")) || (checkLimits(80,120,this.getBloodPressure()) && parameter.equals("BP")) || (checkLimitsDouble(20,42,this.getWeightInKgs()) && parameter.equals("WKG")) || (checkLimitsDouble(41,92,this.getWeightInPounds()) && parameter.equals("WP"))){
                isAbnormal = true;
            }
        } else if(p.getAge() > 144){
            System.out.println(p.getName()+" is an adolescent");
            if((checkLimits(12,20,this.getRespiratoryRate()) && parameter.equals("RR"))|| (checkLimits(55,105,this.getHeartRate()) && parameter.equals("HR")) || (checkLimits(110,120,this.getBloodPressure()) && parameter.equals("BP")) || (checkLimitsDouble(50,0.0,this.getWeightInKgs()) && parameter.equals("WKG")) || (checkLimitsDouble(110,0.0,this.getWeightInPounds()) && parameter.equals("WP"))){
                isAbnormal = true;
            }
        }
        return isAbnormal;
    }
    public boolean checkLimits(int lower,int higher, int value){
        if( value > lower && value < higher){
            return false;
        }
        return true;
    }
    
    public boolean checkLimitsDouble(double low, double high, double value){
        if( high !=0.0 && value > low && value < high){
            return true;
        }
        else if(high == 0.0 && value < low){
            return true;
        }
        return false;
    }
}