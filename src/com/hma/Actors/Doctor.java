package com.hma.Actors;

public class Doctor {
    public int  did;
   public String dname;
   public String specialization;
   public float cFee;
   public static String hName="akhila hospital";
    public Doctor(int did, String dname, String specialization, float cFee) {
        this.did = did;
        this.dname = dname;
        this.specialization = specialization;
        this.cFee = cFee;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", specialization='" + specialization + '\'' +
                ", cFee=" + cFee +
                '}';
    }
}
