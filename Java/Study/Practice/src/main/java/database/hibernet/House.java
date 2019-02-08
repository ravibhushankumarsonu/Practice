package database.hibernet;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * created by ravibhushan.k on 06/02/19
 */
@Data
@Entity
@Table(name="housing")
public class House {
    //latitude | housing_median_age | total_rooms | total_bedrooms | population | households | median_income | median_house_value | ocean_proximity
    @Id
    @Column(name = "longitude")
    public double longitude;
    @Column(name = "latitude")
    public double latitude;
    @Column(name = "housing_median_age")
    public double age;
    @Column(name = "total_rooms")
    public double totalRooms;
    @Column(name= "total_bedrooms")
    public double totalBedrooms;
    @Column(name= "population")
    public double population;
    @Column(name="households")
    public double households;
    @Column(name= "median_income")
    public double medianIncome;
    @Column(name = "median_house_value")
    public double medianHouseValue;
    @Column(name = "ocean_proximity")
    public String oceanProximity;
}
