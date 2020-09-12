
public class Catapult {

	private double distance;
	private int [] currentSpeed;
	private int [] currentAngle;
	private int currentMin;
	private int currentMax;
	private double sqrtSpeed;
	private double sinAngle;
	private double bestValue;
	
public  Catapult(int [] projectileSpeeds, int [] projectileAngles, int min, int max) {
		
		sqrtSpeed = 0.0;
		sinAngle = 0.0;
		distance = 0.0;
		currentSpeed = projectileSpeeds;
		currentAngle = projectileAngles;
		currentMin = min;
		currentMax = max;
		
	}


public void calculations() {
	
	for(int i = 0; i < currentSpeed.length; i++) {
		sqrtSpeed = Math.sqrt(i);
	}
	
	for(int i = 0; i < currentAngle.length; i++) {  
		sinAngle= Math.sin(2*(Math.toRadians(i)));
	}
	distance = (double)((sqrtSpeed * sinAngle)/ 9.8);
	
		for(int row = 0; row < currentSpeed.length; row++) {
			for(int col = 0; col < currentAngle.length; col++) { 
				double [][] resultsMatrix = new double [currentSpeed.length][currentAngle.length];
				resultsMatrix [row][col] = distance;
				System.out.printf("%.3f\n", distance);
			 }
		}
		if(distance < currentMax && distance > currentMin) {
				  bestValue = distance;
				  System.out.printf("%.3f\n", bestValue);
				}
	
}
	

public double getDistance() {
	return distance;
}

public double getBestValue() {
	return bestValue;
}

public double getSinAngle() {
	return sinAngle;
}

public double getSqrtSpeed() {
	return sqrtSpeed;
}


}
