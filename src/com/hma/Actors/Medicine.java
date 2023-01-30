package com.hma.Actors;

public class Medicine {
    public int mid;
    public String mname;
    public String manufacturer;
    public String expiryDate;
    public float price;

    public Medicine(int mid, String mname, String manufacturer, String expiryDate, float price) {
        this.mid = mid;
        this.mname = mname;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", price=" + price +
                '}';
    }
}
