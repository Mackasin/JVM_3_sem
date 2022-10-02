package com.nki.dzhurynskyi.laboratorywork.lb3.part2.phones;

import java.util.Objects;

public class Phone {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private int accountNumber;
    private double timeForTownCalls;
    private double timeForLongDistanceCalls;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Phone phone = (Phone) o;
        return id == phone.id && Double.compare(phone.timeForTownCalls,timeForTownCalls) == 0 &&
                 Double.compare(phone.timeForLongDistanceCalls,timeForLongDistanceCalls) == 0 &&
                 accountNumber == phone.accountNumber && Objects.equals(name, phone.name) && Objects.equals(surname, phone.surname) && Objects.equals(middleName, phone.middleName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, middleName,
                accountNumber, timeForTownCalls,timeForLongDistanceCalls);
    }
    @Override
    public String toString(){
        return "Phone{"+
                "id= "+id+
                ", name=' "+name+'\''+
                ", surname=' "+ surname+'\''+
                ", middleName=' "+middleName+'\''+
                ", accountNumber= "+accountNumber+
                ", timeForTownCalls= "+timeForTownCalls+
                ", timeForLongDistanceCalls= "+timeForLongDistanceCalls+
                '}';
    }
    public Phone(int id,String surname,String name,String middleName,int accountNumber, double timeForTownCalls,double timeForLongDistanceCalls){
        this.id=id;
        this.surname=surname;
        this.name=name;
        this.middleName=middleName;
        this.accountNumber=accountNumber;
        this.timeForTownCalls=timeForTownCalls;
        this.timeForLongDistanceCalls=timeForLongDistanceCalls;
    }
    public Phone(){
        this(0,"","","",0,0.0,0.0);
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }

    public String getMiddleName(){
        return middleName;
    }
    public void setMiddleName(String middleName){
        this.middleName=middleName;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public double getTimeForTownCalls(){
        return timeForTownCalls;
    }
    public void setTimeForTownCalls(double timeForTownCalls){
        this.timeForTownCalls=timeForTownCalls;
    }

    public double getTimeForLongDistanceCalls(){
        return timeForLongDistanceCalls;
    }
    public void setTimeForLongDistanceCalls(double timeForLongDistanceCalls){
        this.timeForLongDistanceCalls=timeForLongDistanceCalls;
    }
}
