
/**
 * Display Weather Statistics.
 * 
 * @author Dr. Walker 
 * @version (12/30/2018)
 * AnnualClimate starter object file
 */

public class AnnualClimate {

	private int sumTempHi;
    private int sumTempLow;
    private double sumPrecip;
    private double avgTempHi;
    private double avgTempLow;
    private int [] tempHi;
    private int [] tempLow;
    private double [] precip;
    int sum = 0;
   
    
    public AnnualClimate(int [] temperatureHi, int [] temperatureLow, double [] precipitation)
    {
       
    	sumTempHi = 0;
    	sumTempLow = 0;
    	sumPrecip = 0;
    	avgTempHi = 0;
    	avgTempLow = 0;
    	tempHi = temperatureHi;
        tempLow = temperatureLow;
        precip = precipitation;
    	// Complete the constructor
    }
    
    public void calculations()
    {
    	for(int i = 0; i < tempHi.length; i++) {
    		
    		sumTempHi += tempHi[i];
    		sumTempLow += tempLow[i];
    		sumPrecip += precip[i];
    	}
    	
    	avgTempHi = sumTempHi / tempHi.length;
    	avgTempLow = sumTempLow / tempLow.length;
         //create the loop and calculations to update all needed private instance variables    
        
    }
    
    public double getPrecipSum()
    {
        return sumPrecip;
    	//get the precipitation sum amount back to the calling method
    }
     
    public double getAvgTempHi()
    {
    	return avgTempHi;
         //get the average high temperature amount back to the calling method
    }
          
    public double getAvgTempLow()
    {
    	return avgTempLow;
         //get the average low temperature amount back to the calling method
    }	 
}
