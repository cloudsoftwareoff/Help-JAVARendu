package com.cloudsoftware.rendujava;

public class Agent extends Employe {
private int primeResponsabilite;

private class B extends IR{

public int getIR(int salaire){
  for (int i=0;i<6;i++){
    if (salaire>=tranches[i])
    return tauxIR[i];
  }
  return 35;
}

public int SalaireAPayer(){
  return (salaireBase+primeResponsabilite)*(1-getIR(salaireBase));
}

}
}
