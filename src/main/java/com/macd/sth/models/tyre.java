package com.macd.sth.models;

public class tyre {

    private String modelNo, vehicleType, design;
    private String isTubeless;
    private int price, percentDiscount;
    public tyre(String modelNo, String vehicleType, String design, String isTubeless, int price, int percentDiscount) {
        this.modelNo = modelNo;
        this.vehicleType = vehicleType;
        this.design = design;
        this.isTubeless = isTubeless;
        this.price = price;
        this.percentDiscount = percentDiscount;
    }

    public tyre(){}

//    public int getLocationID() {
//        return locationID;
//    }
//
//    public void setLocationID(int locationID) {
//        this.locationID = locationID;
//    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getIsTubeless() {
        return isTubeless;
    }

    public void setIsTubeless(String isTubeless) {
        this.isTubeless = isTubeless;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(int percentDiscount) {
        this.percentDiscount = percentDiscount;
    }
}
