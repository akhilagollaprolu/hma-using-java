import com.hma.Actors.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.System.exit;
class Main {
    public static void main(String args[])
    {
        ArrayList<Doctor> doctorsList = new ArrayList<Doctor>();
        ArrayList<Patient> patientsList = new ArrayList<Patient>();
        ArrayList<Medicine> medicinesList = new ArrayList<Medicine>();
        ArrayList<Room> roomsList = new ArrayList<Room>();

        Scanner sc = new Scanner(System.in);
        int choice;
        callMenu();
       try
       {
           while(true)
           {
               System.out.println("enter your choice");
               choice=sc.nextInt();
               if(choice<=18)
               {
                   switch(choice)
                   {
                       case 1:
                           System.out.println("Creating a Doctor Record");
                           Doctor d1 = addDoc();
                           doctorsList.add(d1);
                           break;
                       case 2:
                           System.out.println("Reading the Doctors List");
                           readDoc(doctorsList);
                           break;
                       case 3:
                           System.out.println("Updating the Doctors List");
                           System.out.println("Enter the Doctor ID: ");
                           int id = sc.nextInt();
                           for(Doctor doctor : doctorsList)
                           {
                               if(doctor.did==id)
                               {
                                   System.out.println("Enter new Name: ");
                                   String name = sc.next();
                                   System.out.println("Enter new Specialization: ");
                                   String spec = sc.next();
                                   System.out.println("Enter new Fee: ");
                                   Float fee = sc.nextFloat();
                                   doctor.dname=name;
                                   doctor.specialization=spec;
                                   doctor.cFee=fee;
                                   System.out.println("Updated the details");
                               }

                           }
                           break;
                       case 4:
                           System.out.println("Deleting the Doctor Record");
                           System.out.println("Enter the Doctor ID: ");
                           int id1 = sc.nextInt();
                           for(Doctor doctor : doctorsList)
                           {
                               if(doctor.did==id1)
                               {
                                   doctorsList.remove(doctor);
                                   System.out.println("Deleted the details");
                                   break;
                               }

                           }
                           break;
                       case 5:
                           System.out.println("Creating a Patient Record");
                           Patient p1 = addPat();
                           patientsList.add(p1);
                           break;
                       case 6:
                           System.out.println("Reading the Patients List");
                           readPat(patientsList);
                           break;
                       case 7:
                           System.out.println("Updating the Patients List");
                           System.out.println("Enter the Patient ID: ");
                           int id2 = sc.nextInt();
                           for(Patient patient : patientsList)
                           {
                               if(patient.pid==id2)
                               {
                                   int age,roomNo;
                                   String name, address, disease;
                                   ArrayList<Medicine> medList = new ArrayList<Medicine>();
                                   System.out.println("Enter the Patient new Name: ");
                                   name = sc.next();
                                   System.out.println("Enter the Patient new Age: ");
                                   age = sc.nextInt();
                                   System.out.println("Enter the Patient new Address: ");
                                   address = sc.next();
                                   System.out.println("Enter the Patient new Disease: ");
                                   disease = sc.next();
                                   System.out.println("Enter the Patient new RoomNo: ");
                                   roomNo = sc.nextInt();
                                   Medicine m = addMed();
                                   medList.add(m);
                                   patient.roomNo=roomNo;
                                   patient.pname=name;
                                   patient.setAge(age);
                                   patient.setAddress(address);
                                   patient.setDisease(disease);
                                   patient.setMedicineList(medList);
                                   System.out.println("Updated the details");
                               }

                           }
                           break;
                       case 8:
                           System.out.println("Deleting a Patient Record");
                           System.out.println("Enter the Patient ID: ");
                           int id3 = sc.nextInt();
                           for(Patient patient : patientsList)
                           {
                               if(patient.pid==id3)
                               {
                                   patientsList.remove(patient);
                                   System.out.println("Deleted the details");
                                   break;
                               }
                           }
                           break;
                       case 9:
                           System.out.println("Create a Medicine Record");
                           Medicine m1 = addMed();
                           medicinesList.add(m1);
                           break;
                       case 10:
                           System.out.println("Reading the Medicines List");
                           readMed(medicinesList);
                           break;
                       case 11:
                           System.out.println("Updating the MedicinesList");
                           System.out.println("Enter the  Medicine ID: ");
                           int id4 = sc.nextInt();
                           for(Medicine medicine : medicinesList)
                           {
                               if(medicine.mid==id4) {
                                   String name, manf, expd;
                                   float price;
                                   System.out.println("Enter the new Medicine Name: ");
                                   name = sc.next();
                                   System.out.println("Enter the new Medicine Manufacturer: ");
                                   manf = sc.next();
                                   System.out.println("Enter the Expiry Date: ");
                                   expd = sc.next();
                                   System.out.println("Enter the new Price: ");
                                   price = sc.nextFloat();
                                   medicine.mname = name;
                                   medicine.manufacturer = manf;
                                   medicine.expiryDate = expd;
                                   medicine.price = price;
                                   System.out.println("Updated the details");
                               }
                           }
                           break;
                       case 12:
                           System.out.println("Deleting a Medicine Record");
                           System.out.println("Enter the Medicine ID: ");
                           int id5 = sc.nextInt();
                           for(Medicine medicine : medicinesList)
                           {
                               if(medicine.mid==id5)
                               {
                                   medicinesList.remove(medicine);
                                   System.out.println("Deleted the details");
                                   break;
                               }

                           }
                           break;
                       case 13:
                           System.out.println("Create a Room Record");
                           Room r1 = addRoom();
                           roomsList.add(r1);
                           break;
                       case 14:
                           System.out.println("Reading the Rooms List");
                           readRoom(roomsList);
                           break;
                       case 15:
                           System.out.println("Updating the Room List");
                           System.out.println("Enter the Room ID: ");
                           int id6 = sc.nextInt();
                           for(Room room : roomsList)
                           {
                               if(room.rid==id6)
                               {
                                   String type;
                                   float price;
                                   System.out.println("Enter the Room Type: ");
                                   type = sc.next();
                                   System.out.println("Enter the Room Price: ");
                                   price = sc.nextFloat();
                                   room.type=type;
                                   room.price=price;
                                   System.out.println("Updated the details");
                               }

                           }
                           break;
                       case 16:
                           System.out.println("Deleting a Room Record");
                           System.out.println("Enter the room ID: ");
                           int id7 = sc.nextInt();
                           for(Room room : roomsList)
                           {
                               if(room.rid==id7)
                               {
                                   roomsList.remove(room);
                                   System.out.println("Deleted the details");
                                   break;
                               }

                           }
                           break;
                       case 17:
                           callMenu();
                           break;
                       case 18:
                           exportDB(doctorsList,patientsList,medicinesList,roomsList);
                           break;
                       case 0:
                           exit(0);
                       default:
                           System.out.println("Invalid Input");
                   }
               }
           }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }
    public static void callMenu()
    {
        System.out.println("1. Create a Doctor Record");
        System.out.println("2. Read a Doctor Record");
        System.out.println("3. Update a Doctor Record");
        System.out.println("4. Delete a Doctor Record");
        System.out.println("5. Create a Patient Record");
        System.out.println("6. Read a Patient Record");
        System.out.println("7. Update a Patient Record");
        System.out.println("8. Delete a Patient Record");
        System.out.println("9. Create a Medicine Record");
        System.out.println("10. Read a Medicine Record");
        System.out.println("11. Update a Medicine Record");
        System.out.println("12. Delete a Medicine Record");
        System.out.println("13. Create a Room Record");
        System.out.println("14. Read a Room Record");
        System.out.println("15. Update a Room Record");
        System.out.println("16. Delete a Room Record");
        System.out.println("17. Display the menu");
        System.out.println("0. Exit");
    }
    public static Doctor addDoc() {
        Scanner s = new Scanner(System.in);
        int id;
        String name, spec;
        float fee;
        System.out.println("Enter the Doctor ID: ");
        id = s.nextInt();
        System.out.println("Enter the Doctor Name: ");
        name = s.next();
        System.out.println("Enter the Specialization: ");
        spec = s.next();
        System.out.println("Enter the Fee: ");
        fee = s.nextFloat();
        Doctor d = new Doctor(id, name, spec, fee);
        return d;
    }
    public static void readDoc(ArrayList<Doctor> dl)
    {
        for(Doctor doctor : dl)
        {
            System.out.println(doctor.toString());
        }
    }
    public static Medicine addMed()
    {
        Scanner s = new Scanner(System.in);
        int id;
        String name, manf,expd;
        float price;
        System.out.println("Enter the medicine ID: ");
        id = s.nextInt();
        System.out.println("Enter the medicine Name: ");
        name = s.next();
        System.out.println("Enter the Manufacturer: ");
        manf = s.next();
        System.out.println("Enter the Expiry Date: ");
        expd = s.next();
        System.out.println("Enter the medicine Price: ");
        price = s.nextFloat();
        Medicine m = new Medicine(id,name,manf,expd,price);
        return m;

    }
    public static void readMed(ArrayList<Medicine> ml)
    {
        for(Medicine medicine : ml)
        {
            System.out.println(medicine.toString());
        }
    }
    public static Room addRoom()
    {
        Scanner s = new Scanner(System.in);
        int id;
        String type;
        float price;
        System.out.println("Enter the Room ID: ");
        id = s.nextInt();
        System.out.println("Enter the Room Type: ");
        type = s.next();
        System.out.println("Enter the Room  Price: ");
        price = s.nextFloat();
        Room r = new Room(id,type,price);
        return r;

    }
    public static void readRoom(ArrayList<Room> rl) {
        for (Room room : rl) {
            System.out.println(room.toString());
        }
    }
    public static Patient addPat()
    {
        Scanner s = new Scanner(System.in);
        int id,age,roomNo;
        String name, address, disease;
        ArrayList<Medicine> medList = new ArrayList<Medicine>();

        System.out.println("Enter the Patient ID: ");
        id = s.nextInt();
        System.out.println("Enter the Patient Name: ");
        name = s.next();
        System.out.println("Enter the Patient Age: ");
        age = s.nextInt();
        System.out.println("Enter the Patient Address: ");
        address = s.next();
        System.out.println("Enter the Patient Disease: ");
        disease = s.next();
        System.out.println("Enter the Patient RoomNo: ");
        roomNo = s.nextInt();
        Medicine m = addMed();
        medList.add(m);
        Patient p = new Patient(id,name, roomNo);
        p.setMedicineList(medList);
        p.setAge(age);
        p.setAddress(address);
        p.setDisease(disease);
        return p;
    }
    public static void readPat(ArrayList<Patient> pl)
    {
        for(Patient patient : pl)
        {
            System.out.println(patient.toString());
        }
    }
    public static void exportDB(ArrayList<Doctor> doctorslist,ArrayList<Patient> patientslist,ArrayList<Medicine> medicineslist,ArrayList<Room> roomslist)
    {

        storeDoctorsData(doctorslist);
        storePatientsData(patientslist);
        storeMedicinesData(medicineslist);
        storeRoomsData(roomslist);

    }
    public static void storeDoctorsData(ArrayList<Doctor> dl)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/akhila","root","Akhila@123");

            for(Doctor doctor: dl)
            {
                PreparedStatement stmt=con.prepareStatement("insert into doctors values(?,?,?,?,?)");
                stmt.setInt(1,doctor.did);
                stmt.setString(2,doctor.dname);
                stmt.setString(3,doctor.specialization);
                stmt.setFloat(4,doctor.cFee);
                stmt.setString(5,"akhilahospital");
                int i=stmt.executeUpdate();
                System.out.println(i+"doctor record inserted");
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    public static void storePatientsData(ArrayList<Patient> pl)
    {


        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/akhila","root","Akhila@123");

            for(Patient patient: pl)
            {
                PreparedStatement stmt=con.prepareStatement("insert into patients values(?,?,?,?,?,?,?,?,?,?,?)");
                stmt.setInt(1,patient.pid);
                stmt.setString(2,patient.pname);
                stmt.setInt(3,patient.getAge());
                stmt.setString(4,patient.getAddress());
                stmt.setString(5,patient.getDisease());
                for(Medicine med: patient.getMedicineList())
                {
                    stmt.setInt(6,med.mid);
                    stmt.setString(7,med.mname);
                    stmt.setString(8,med.manufacturer);
                    stmt.setString(9,med.expiryDate);
                    stmt.setFloat(10,med.price);
                }
                stmt.setInt(11,patient.roomNo);


                int i=stmt.executeUpdate();
                System.out.println(i+" patient record inserted");


            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            }
    public static void storeMedicinesData(ArrayList<Medicine> ml)
    {


        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/akhila","root","Akhila@123");

            for(Medicine medicine: ml)
            {
                PreparedStatement stmt=con.prepareStatement("insert into medicines values(?,?,?,?,?)");
                stmt.setInt(1,medicine.mid);
                stmt.setString(2,medicine.mname);
                stmt.setString(3,medicine.manufacturer);
                stmt.setString(4,medicine.expiryDate);
                stmt.setFloat(5,medicine.price);
                int i=stmt.executeUpdate();
                System.out.println(i+"medicines record inserted");
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    public static void storeRoomsData(ArrayList<Room> rl)
    {


        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/akhila","root","Akhila@123");

            for(Room room: rl)
            {
                PreparedStatement stmt=con.prepareStatement("insert into rooms values(?,?,?)");
                stmt.setInt(1,room.rid);
                stmt.setString(2,room.type);
                stmt.setFloat(3,room.price);
                int i=stmt.executeUpdate();
                System.out.println(i+"rooms records inserted");


            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
