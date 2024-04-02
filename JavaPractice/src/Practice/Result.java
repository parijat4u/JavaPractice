package Practice;

public class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */
	
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    	double tip= (tip_percent * meal_cost)/100;
  
    	double tax= (tax_percent * meal_cost)/100;
   
    	
    	int total_cost=(int)Math.round(meal_cost+tip+tax);
    	
    
    	
    	
    	System.out.println("The total meal cost is: " + total_cost+ " dollars.");
    

    }

}