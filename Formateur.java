package com.cloudsoftware.rendujava;

public class Formateur extends Employe{
// Globe
private int heureSup;
final int remunerationHSup=15000;
public Formateur(int h){
  heureSup=h;
}
// Just to use IR :(
private class A extends IR{


public int RemunerationHSup(){
  return  remunerationHSup;
}

public int getIR(int salaire){
  for (int i=0;i<6;i++){
    if (salaire>=tranches[i])
    return tauxIR[i];
  }
  return 35;
}
public int SalaireAPayer(){
  return (salaireBase+heureSup*RemunerationHSup())*(1-getIR(salaireBase));
}
}}