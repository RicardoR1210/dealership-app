package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.regex.Pattern;

public class DealershipFileManager {

    public Dealership getDealership() {
        Dealership dealership = null;
        try {
            BufferedReader br = new BufferedReader(new FileReader("inventory.csv"));
            String firstLine = br.readLine();
            String[] dealershipInfo = firstLine.split(Pattern.quote("|"));
            String name = dealershipInfo[0];
            String address = dealershipInfo[1];
            String phone = dealershipInfo[2];
            dealership = new Dealership(name, address, phone);
            String line;

            while ((line = br.readLine()) != null) {
                String[] valuesDealer = line.split(Pattern.quote("|"));
                int vin = Integer.parseInt(valuesDealer[0]);
                int year = Integer.parseInt(valuesDealer[1]);
                String make = valuesDealer[2];
                String model = valuesDealer[3];
                String vehicleType = valuesDealer[4];
                String color = valuesDealer[5];
                int odometer = Integer.parseInt(valuesDealer[6]);
                BigDecimal price = new BigDecimal(valuesDealer[7]);
                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                dealership.addVehicle(vehicle);

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dealership;
    }
    public void saveDealership(Dealership dealership){

    }
}

