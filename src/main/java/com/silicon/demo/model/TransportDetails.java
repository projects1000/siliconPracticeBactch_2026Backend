package com.silicon.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;

public class TransportDetails {

    @Schema(description = "Driver Name", example = "Ramesh Kumar")
    private String driverName;

    @Schema(description = "Vehicle Registration Number", example = "OD02AB1234")
    private String vehicleNumber;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}