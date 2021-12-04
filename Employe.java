package com.cloudsoftware.rendujava;
import java.util.*;
public class Employe implements IEmploye,IComparable {
private static int count = 0; 
   
 
public int mlte;
public String nom;
public int Birthdate;// _dateNaissance
public int Started; // _dateEmbauche
public int salaireBase;

  // Get Current Year
  Date dt=new Date();
  int year=dt.getYear()+1900; 
  
  
public void SetBirth(int Birthdate){

  this.Birthdate=Birthdate;
}
public void SetStarted(int Started){

 // Check Age >16?
if (year - this.Birthdate >=16){
  this.Started=Started;
  }else{
System.out.println("You're a minor 🚨");
}}

// Constructor
public  Employe(String nom,int salaireBase){
  this.nom=nom;
  this.salaireBase=salaireBase;
  // Initialize
  this.Birthdate=this.Started=0;
  mlte=++count;
}
public Employe(){}
// Methods
public int SalaireAPayer(){
  return salaireBase;}

public int WorkingFor(){
  return year-Started; }

public int Age(){
  return year-Birthdate;}
  
public int DateRetraite(int ageRetraite){
  // Return Retraite year 
  return year+(ageRetraite-Age());
}

public String OwO(int _){
  return String.valueOf(_);  
}
public String toString(){
  return "> "+OwO(mlte)+"||Nom:"+nom+"||BornOn: "+OwO(Birthdate)+"||Ancianete: "+OwO(year-Started)+"y||Salary:"+OwO(salaireBase)+"||Retraite:"+OwO(DateRetraite(60));}


public boolean Compare(Employe e){
  if (this.nom==e.nom)
  return true ;
  else
return false;
}

public boolean Equals (Employe e){
  if (this.mlte==e.mlte)
  return true;
  else 
  return false;
}
}