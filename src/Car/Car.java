package Car;



import java.util.Scanner;

import Motor.Motor;
import Wheels.Wheels;

public class Car {
	int Id;
	String Name;
	Motor Moteur;
	Scanner scan = new Scanner(System.in);
	Wheels[] Arraywheels = new Wheels[4];
	String Volant;
	String Frein;
	
	
	Car(int id, String name, Motor moteur, Wheels[] arraywheels,  String volant, String frein ) {
		Name = name;
		Id = id;
		Motor Moteur = moteur;
		Wheels[] Arraywheels = arraywheels;
		Volant = volant;
		Frein = frein;
		
		
				
	}
	public void FillCarInfo(){
		 System.out.println("Vous venez de choisir une voiture de type rapide, veuillez choisir le nom de votre voiture");
			Name = scan.next();
		    System.out.println("le nom de votre voiture rapide est : " + Name);
	}
	
}
