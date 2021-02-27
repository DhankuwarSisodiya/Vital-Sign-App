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
public class Community{
    private int communityId;
    City city;
    public int getCommunityId() {
        return communityId;
    }

    public void setCommunityId(int communityId) {
        this.communityId = communityId;
    }

    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }
    
    
    private ArrayList<Community> communities = new ArrayList<Community>();
    Community() {
        city = new City();
    }

    void add(int communityId) {
        if(communities != null){
            if(!communities.contains(communityId)){
            communities.add(this);
            }
        }
        
    }

    void setCityDetails(String cityName) {
        city.addCity(cityName);
    }

    String getCity() {
        return city.getCityName();
    }

}