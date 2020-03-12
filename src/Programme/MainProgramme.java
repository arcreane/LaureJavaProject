package Programme;

import java.util.ArrayList;
import java.util.Scanner;

import Car.CarFast;
import Users.Personne;
import Car.Car;

public class MainProgramme {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Personne> user = new ArrayList<>();
		ArrayList<Car> car = new ArrayList<>();
		
		System.out.println("Choisie le type de voiture..., type 1 pour voiture rapide, type 2 pour voiture lent");
		while( scan.hasNextInt() == false ) {
			System.out.println("Choisie un nombre entre 1 et 3");
			scan.next();
		}	
		 int answer = scan.nextInt();
		 switch(answer) {
		  case 1:
			  System.out.println("Voiture rapide");
			 //car.add(CarFast.createcarfast());
		    break;
		  case 2:
			  System.out.println("Voiture lente");
			 
		    break;
		
		  default:
			    // code block
			 
			}
		 
		// }
	}
	

}
