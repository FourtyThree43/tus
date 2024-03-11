/**
 * 
 */
package com.tus.farmservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author User
 *
 */
@Entity
public class Farm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long farmId;
    private String farmName;
    private String location;
    private double area;
    private Long ownerId;
    private int farmSize;

    // @OneToMany(mappedBy = "farm")
    // private List<Crop> crops;

    // Constructors, getters, and setters
    public Farm() {}

    public Farm(String farmName, String location, double area, Long ownerId, int farmSize) {
        this.farmName = farmName;
        this.location = location;
        this.area = area;
        this.ownerId = ownerId;
        this.farmSize = farmSize;
        // this.crops = crops;
    }

    public Long getFarmId() {
        return farmId;
    }

    public void setFarmId(Long farmId) {
        this.farmId = farmId;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public int getSize() {
        return farmSize;
    }

    public void setSize(int size) {
        this.farmSize = size;
    }

    // public List<Crop> getCrops() {
    //     return crops;
    // }

    // public void setCrops(List<Crop> crops) {
    //     this.crops = crops;
    // }
}
