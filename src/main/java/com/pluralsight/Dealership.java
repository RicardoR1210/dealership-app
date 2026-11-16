package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    public static List<Vehicle> getVehiclesByPrice(List<Vehicle> max,List<Vehicle> min){
        return null;
    }
    public static List<Vehicle> getVehiclesByMakeModel(List<Vehicle> make,List<Vehicle> model){
        return null;
    }
    public static List<Vehicle> getVehiclesByYear(List<Vehicle> min,List<Vehicle> max){
        return null;
    }
    public static List<Vehicle> getVehiclesByColor(List<Vehicle> Color){
        return null;
    }
    public static List<Vehicle> getVehiclesByMileage(List<Vehicle> min,List<Vehicle> max){
        return null;
    }
    public static List<Vehicle> getVehiclesByType(List<Vehicle> vehicleType){
        return null;
    }
    public static List<Vehicle> getAllVehicles(){
        return null;
    }
    public static void AddVehicle(Vehicle vehicle){

    }
    public static void RemoveVehicle(Vehicle vehicle){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
