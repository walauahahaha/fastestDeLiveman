package ClockInAndOut;


import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author End User
 */

    import java.io.Serializable;
import java.util.*;
import java.util.GregorianCalendar;

public class Employee implements Serializable {
  private static int nextID= 1000;

    

    
  private String name;
  private int EmployeeID;
  private int finishPosition;
  private String EmployeeStatus;
  private Calendar realTime;
  public Employee(int EmployeeID) {
    this.EmployeeID = EmployeeID;
  }
  
  public Employee(String name) {
    this.name = name;
    this.EmployeeID = nextID++;
    this.realTime = new GregorianCalendar();
  }

    

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getEmployeeID() {
    return EmployeeID;
  }

  public void setEmployeeID(int EmployeeID) {
    this.EmployeeID = EmployeeID;
  }
  public static String getTime(Calendar time) {
    return String.format("%02d:%02d:%02d", time.get(Calendar.HOUR_OF_DAY),
            time.get(Calendar.MINUTE), time.get(Calendar.SECOND));
  }
  
 
  public void setRealTime(Calendar realTIme){
      this.realTime = realTime;
  }
  public String getEmployeeStatus(){
      return EmployeeStatus;
  }
  
  public void setEmployeeStatus(String EmployeeStatus){
      this.EmployeeStatus = EmployeeStatus;
  }

  public static int getNextID() {
    return nextID;
  }

  public static void setNextID(int nextID) {
    Employee.nextID = nextID;
  }

  public int getFinishPosition() {
    return finishPosition;
  }

  public void setFinishPosition(int finishPosition) {
    this.finishPosition = finishPosition;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Employee other = (Employee) obj;
    if (this.EmployeeID != other.EmployeeID) {
      return false;
    }
    return true;
  }
  
  
      
  @Override
  public String toString() {
    return String.format("No. %-10d %-20s \n This Employee are available.\n",+ EmployeeID, name + "\n Check in Time :" +getTime(realTime));
  }
  
  
}


