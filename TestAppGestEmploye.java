package com.cloudsoftware.rendujava;

import com.cloudsoftware.rendujava.*;
import java.util.Scanner;

public class TestAppGestEmploye {

  public static void main(String[] args) {
   
  Scanner s=new Scanner(System.in); 
   // Test Cases
Employe[] e={
  
 new Employe("Insaf",28000),
 new Employe("Emily",15000)
 };

e[0].SetBirth(2000);
e[1].SetBirth(2005);
e[0].SetStarted(2008);
e[1].SetStarted(2009);
System.out.println(e[0].toString());
System.out.println(e[1].toString());
 
 




System.out.println("Visit:\nhttps://github.com/cloudsoftwareoff/Help-JAVARendu");
  }
}


// StackOverFlow
