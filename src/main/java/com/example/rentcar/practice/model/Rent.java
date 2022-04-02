package com.example.rentcar.practice.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Document("rent")
public class Rent {
    public int getRentId() {
        return rentId;
    }

    public void setRentId(int rentId) {
        this.rentId = rentId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Id
    private int rentId;
    private int empId;
    private String vehicle;
    private String duration;
}
