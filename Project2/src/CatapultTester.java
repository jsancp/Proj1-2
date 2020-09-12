import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class CatapultTester {

	 public static void main(String [] args) throws IOException {
		
		 int sets = 0;
		 int speedSets = 0;
		 int angleSets = 0;
		 int min = 0;
		 int max = 0;
		 int[] projectileSpeeds = null;
		 int[] projectileAngles = null;
		 
		 File text = new File("testdata.txt");
		 Scanner file = new Scanner(text);
		 sets = file.nextInt();

		for(int i = 0; i < sets; i++) {
			 
		    speedSets = file.nextInt();  
		    projectileSpeeds =new int[speedSets];
			for(int s = 0 ; s < speedSets; s++) {
				projectileSpeeds[s] = file.nextInt();
					}
			angleSets = file.nextInt();
			projectileAngles = new int[angleSets];
			 		for(int a = 0; a < angleSets; a++) {
					projectileAngles[a] = file.nextInt();
				}
			 min = file.nextInt();
			 max = file.nextInt();	
		}
		
	
	
	Catapult CalcTrajectory = new Catapult(projectileSpeeds, projectileAngles, min, max);
	CalcTrajectory.calculations();
	
	file.close();
	
	
	for(int i = 0; i < projectileSpeeds.length; i++) {
		for(int j = 0; j < projectileAngles.length; j++) {
			System.out.println("***************" + "\t" + " Projectile Table " + "\t" + "***************");
			System.out.println();
			System.out.println("Speed\t\t " + j + " deg");
			System.out.println(i + "\t\t "+ CalcTrajectory.getDistance());
			System.out.println("----------------------------------------");
			System.out.println("Best Distance Values: ");
			System.out.println(CalcTrajectory.getBestValue());
			System.out.println();
		}	
	} 
	
		
		
	 }
	 }	
		
		
			 
	
		
	 

