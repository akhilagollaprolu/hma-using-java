package com.hma.Actors;
import java.util.*;
public class Patient {
  public  int pid;
  public  String pname;
  private  int age;
  private  String address;
   private String disease;
  private ArrayList<Medicine> medicineList;
  public int roomNo;

    public Patient(int pid, String pname, int roomNo) {
        this.pid = pid;
        this.pname = pname;
        this.roomNo = roomNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", disease='" + disease + '\'' +
                ", medicineList=" + medicineList +
                ", roomNo=" + roomNo +
                '}';
    }
}

