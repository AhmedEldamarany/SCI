package com.example.ahmed.sci;

/**
 * Created by ahmed on 5/1/17.
 */

public class Student {
    public String fistName;
    public String fathersName;
    public String gName;
    public String vGname;
    public String nId;
    public String phone;
    public String mobilephone;
    public String Email;
    public String PysicalAdrees;
    public String Gender;
    public String notes;

    public Student(String fistName,String fathersName,String gName ,
                   String vGname,String nId, String phone,String mobilephone ,String Email, String pysicalAdrees
    , String Gender,String notes){
        this.Email=Email;
        this.fathersName=fathersName;
        this.fistName=fistName;
        this.Gender=Gender;
        this.gName=gName;
        this.mobilephone=mobilephone;
        this.nId=nId;
        this.phone=phone;
        this.PysicalAdrees=pysicalAdrees;
        this.vGname=vGname;
        this.notes=notes;



    }




}
