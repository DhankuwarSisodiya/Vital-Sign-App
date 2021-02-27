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
public class City{
    private int cityId;
    private String cityName;
    
    private ArrayList<City> cities = new ArrayList<City>();
    
    City() {
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    void addCity(String city) {
        this.cityName = city;
        if(cities != null){
        if(!cities.contains(this.cityName)){
            cities.add(this);
        }
        }
        
    }
}