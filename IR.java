package com.cloudsoftware.rendujava;

public abstract class IR {
final int tranches[]={
0,5600,8000,10000,12000,30000  
};
final int tauxIR[]={
0,5,15,25,30,35 
};
public abstract int getIR(int salaire);
}
