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
public class House{
    private int houseId;
    private String addressLine;
    Community community;
    
    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public House() {
        community = new Community();
    }

    void setCommunityDetails(int communityId, String city) {
        community.setCommunityId(communityId);
        community.add(communityId);
        community.setCityDetails(city);
    }

    int getcommunity() {
        return community.getCommunityId();
    }

    String getcity() {
        return community.getCity();
    }
    
}