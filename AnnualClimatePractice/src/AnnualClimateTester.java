                          /**
 * Display Weather Statistics.
 * 
 * @author Dr. Walker 
 * @version (12/30/2018)
 * AnnualClimate Solution Tester File
 */

public class AnnualClimateTester {

	 public static void main(String [] args)
	    {
	        double sumPrecip = 0.0;
	        double avgTempHi = 0.0;
	        double avgTempLow = 0.0;
	        String location = "Gainesville, Florida";
	        
	        //Create the arrays from the data provided
	        
	        int [] temperatureHi = new int[12];
	        	temperatureHi[0] = 66;
	        	temperatureHi[1] = 70;
	        	temperatureHi[2] = 75;
	        	temperatureHi[3] = 80;
	        	temperatureHi[4] = 87;
	        	temperatureHi[5] = 90;
	        	temperatureHi[6] = 91;
	        	temperatureHi[7] = 90;
	        	temperatureHi[8] = 87;
	        	temperatureHi[9] = 81;
	        	temperatureHi[10] = 74;
	        	temperatureHi[11] = 68;
	        	
	        int [] temperatureLow = new int[12];
	        	temperatureLow[0]= 42;
	        	temperatureLow[1]= 45;
	        	temperatureLow[2]= 50;
	        	temperatureLow[3]= 55;
	        	temperatureLow[4]= 62;
	        	temperatureLow[5]= 69;
	        	temperatureLow[6]= 71;
	        	temperatureLow[7]= 72;
	        	temperatureLow[8]= 69;
	        	temperatureLow[9]= 60;
	        	temperatureLow[10]= 51;
	        	temperatureLow[11]= 44;
	        	
	        double [] precipitation = new double[] {3.31, 3.19, 4.33, 2.68, 2.48, 7.13, 6.06, 6.38, 4.41, 2.87, 2.05, 2.48};
	        	
	        String [] months = new String[12];
	        	months[0] = "Jan.";
	        	months[1] = "Feb.";
	        	months[2] = "Mar.";
	        	months[3] = "Apr.";
	        	months[4] = "May";
	        	months[5] = "Jun.";
	        	months[6] = "Jul.";
	        	months[7] = "Aug.";
	        	months[8] = "Sep.";
	        	months[9] = "Oct.";
	        	months[10] = "Nov.";
	        	months[11] = "Dec";
	        	
	 
	        //Create the calcClimate object and run the calculations
	        AnnualClimate calcClimate = new AnnualClimate(temperatureHi, temperatureLow, precipitation);
	        calcClimate.calculations();	
	               
	        System.out.println();
	        System.out.println("                   Climate Data");
	        System.out.println("           Location: " + location);
	        System.out.println();
	        System.out.println("         Temperature F (High/Low)     Precipitation in ");
	        System.out.println("****************************************************");
	 
	        //Create the for loop to walk the arrays and print the appropriate values. HINT: \t will tab over to create columns
	        // Example:
	        //System.out.println(variable1 + "\t\t " + variable2 + "\t\t    " + variable3] + "\t\t\t    " + variable4);
	        //will give you columnar output like in the example output of the assignment
	 
	        	for(int i = 0; i < months.length; i++) {
	        		System.out.println(months[i] + "\t\t " + temperatureHi[i] + "\t\t " + temperatureLow[i] + "\t\t " + precipitation[i]);
	        	}
	 
	        System.out.println("****************************************************");
	        
	        //Complete the print statements with the appropriate method calls from the object
	        System.out.println("\tAverage High Temp:    " + calcClimate.getAvgTempHi());
	        System.out.println("\tAverage Low Temp:     " + calcClimate.getAvgTempLow());
	        System.out.println("\tAnnual Precipitation: " + calcClimate.getPrecipSum());
	    }
}
