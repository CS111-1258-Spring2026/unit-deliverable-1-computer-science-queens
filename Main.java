********************************************
* AUTHORS: <Jaya Eckert>
* COLLABORATORS: <Diana Cruz, Ava Gamble>
* LAST MODIFIED: <03/15/2026>
********************************************/


/********************************************
* <Paper Waste Tracker>
*********************************************
* PROGRAM DESCRIPTION:
* <Our code's purpose is to create a baseline for paper waste tracking in businesses to optimize the potential and set up the option for future waste reduction and conservation.>
*********************************************
* ALGORITHM:
* 1. Declare variables for sheet type, amount, weight, distribution, frequency
* 2. Initialize variables with example sheet type data.
* 3. Calculate total sheet waste
* 4. Calculate average paper waste using static methods.
* 5. Output formatted summary.
*********************************************
* STATIC METHODS:
* calculateTotalWasteYear - Jaya
* calculateAverageWasteYear - Jaya
* calculateAverageWasteDaily - Ava
* calculateAverageWastePerEmployee- Ava
* calculateAverageWasteMonthly - Diana
* calculateAverageWaste - Diana


*********************************************/






public class Main
{
/***** CONSTANT SECTION *****/
public static final int numSheets = 3;
public static final int weeks_InYear = 52;


public static void main(String[] args)
{
/***** DECLARATION SECTION *****/
String sheet1, sheet2, sheet3;
int amount1, amount2, amount3;
double weight1, weight2, weight3;
int distribution1, distribution2, distribution3;
double frequency1, frequency2, frequency3;




/***** INITIALIZATION SECTION *****/
sheet1 = "Magazines and Catalogs";
amount1 = 4;
weight1 = 0.5;
distribution1 = 100;
frequency1 = 10.0;








sheet2= "Newspaper";
amount2 = 8;
weight2 = 1.0;
distribution2 = 100;
frequency2 = 10.0;




sheet3 = "Miscellaneous";
amount3 = 20;
weight3= 0.01;
distribution3= 100;
frequency3 = 10.0;


/***** INTRO SECTION *****/
System.out.println("Hello! Welcome to our Paper Waste calculator!\n");


/***** PROCESSING SECTION *****/
int totalAmount = calculateTotalAmount(amount1, amount2, amount3);
double totalWeight = calculateTotalWeight(weight1, weight2, weight3);
int avgDistribution = calculateAverageDistribution(distribution1, distribution2, distribution3);
double avgFrequency = calculateAverageFrequency(frequency1, frequency2, frequency3);
double totalWaste1 = calculateTotalWaste1(amount1, weight1, distribution1, frequency1);
double totalWaste2 = calculateTotalWaste2(amount2, weight2, distribution2, frequency2);
double totalWaste3 = calculateTotalWaste2(amount3, weight3, distribution3, frequency3);
double totalWasteYear = calculateTotalWasteYear(amount1, weight1, distribution1, frequency1, amount2, weight2, distribution2, frequency2, amount3, weight3, distribution3, frequency3);
double avgWasteYear = calculateAverageWasteYear(amount1, weight1, distribution1, frequency1, amount2, weight2, distribution2, frequency2, amount3, weight3, distribution3, frequency3);




/***** OUTPUT SECTION *****/
System.out.println("Paper Waste Summary:");
System.out.printf("%-25s %10s %15s %15s %15s %15s \n", "Sheet Type", "Amount", "Weight", "Distrubution", "Frequency", "Total Waste");
System.out.printf("%-25s %10d %12.2f lb %15d %15.1f %15.1f lb\n", sheet1, amount1, weight1, distribution1, frequency1, totalWaste1);
System.out.printf("%-25s %10d %12.1f lb %15d %15.1f %15.1f lb\n", sheet2, amount2, weight2, distribution2, frequency2, totalWaste2);
System.out.printf("%-25s %10d %12.2f lb %15d %15.1f %15.1f lb\n", sheet3, amount3, weight3, distribution3, frequency3, totalWaste3);








System.out.println("\nTotal Waste Summary:");
System.out.printf("Total Amount: %d\n", totalAmount);
System.out.printf("Total Weight: %.1f lb\n", totalWeight);
System.out.printf("Average Distribution: %d\n", avgDistribution);
System.out.printf("Average Frequency: %.1f\n", avgFrequency);


System.out.printf("Total Waste in a Year: %f lb\n", totalWasteYear);
System.out.printf("Average Waste in a Year: %f lb\n", avgWasteYear);
}


/***** STATIC METHODS *****/


/**
* //DESCRIPTION: Calculates total amount of sheets of paper including magazines and catalogs,
* // newspapers, and miscellaneous by adding
* //PRECONDITION: all values are >= 0
* //POSTCONDITION: Returns total amount of sheets of paper
*
* @param a1 (amount1) amount of sheets of paper for magazines and catalogs, must be >= 0
* @param a2 (amount2) amount of sheets of paper for newspapers, must be >= 0
* @param a3 (amount3) amount of sheets of paper for miscellaneous, must be >= 0
*
* @return returns the calculated amount of all sheets of paper taking into account all parameter values
* @author Jaya Eckert <jayachristianlopez@gmail.com>
*/


public static int calculateTotalAmount(int a1, int a2, int a3){


return (a1 + a2 + a3);


}


/**
* //DESCRIPTION: Calculates total weight including magazines and catalogs, newspapers,
* // and miscellaneous by adding
* //PRECONDITION: all values are >= 0
* //POSTCONDITION: Returns total weight across all sheets of paper combined
*
* @param w1 (weight1) weight of one magazine and catalog, must be >= 0
* @param w2 (weight2) weight of one newspaper, must be >= 0
* @param w3 (weight3) weight of one average sheet (miscellaneous), must be >= 0
*
* @return returns the calculated weight of all seperate weights combined taking into account all parameter values
* @author Jaya Eckert <jayachristianlopez@gmail.com>
*/


public static double calculateTotalWeight(double w1, double w2, double w3){


return (w1 + w2 + w3);


}


/**
* //DESCRIPTION: Calculates average distribution of all sheets by adding all distributions and dividing by 3
* //PRECONDITION: all values are >= 0
* //POSTCONDITION: Returns calculated average distribution taking into account all parameter values
*
* @param d1 (distribution1) total distribution of magazines and catalogs, must be >= 0
* @param d2 (distribtuion2) total distribution of newspapers, must be >= 0
* @param d3 (distribution3) total distribution of miscellaneous, must be >= 0
*
* @return Returns average distribution taking into account all parameter values by adding then dividing by 3
* @author Jaya Eckert <jayachristianlopez@gmail.com>
*/


public static int calculateAverageDistribution(int d1, int d2, int d3){


return (d1 + d2 + d3/3);


}


/**
* //DESCRIPTION: Calculates average frequency of all sheets by adding all frequencies of each type then dividing by 3
* //PRECONDITION: all values are >= 0
* //POSTCONDITION: Returns calculated average of frewuency taking unto account all parameter values
*
* @param f1 (frequency1) how frequently a magazine or catalog is distributed, must be >=0
* @param f2 (frequency2) how frequently a newspaper is distributed, must be >=0
* @param f3 (frequency3) how frequently a miscellaneous sheet of paper is distributed, must be >=0
*
* @return Returns calculated average of frequency by adding all frequencies then dividing by 3 taking unto account all parameter values
* @author Jaya Eckert <jayachristianlopez@gmail.com
*/


public static double calculateAverageFrequency(double f1, double f2, double f3){


return (f1 + f2 + f3/3);


}
/**
* //DESCRIPTION: Calculates total waste for Magazines and Catalogs
* //PRECONDITION: all values are >= 0
* //POSTCONDITION: Returns total calculated waste for category 1
*
* @param a1 (amount1) number of magazines, must be >= 0
* @param w1 (weight1) weight per magazine, must be >= 0
* @param d1 (distribution1) total distribution, must be >= 0
* @param f1 (frequency1) how often distributed, must be >= 0
*
* @return returns the product of a1, w1, d1, and f1
* @author Ava Gamble <ava.gamble37@gmail.com>
*/






public static double calculateTotalWaste1(int a1, double w1, int d1, double f1){


return (a1*w1*d1*f1);


}


/**
* // DESCRIPTION: Calculates total waste for Newspapers
* // PRECONDITION: all values are >= 0
* //POSTCONDITION: Returns total calculated waste for category 2
*
* @param a2 (amount2) number of newspapers, must be >= 0
* @param w2 (weight2) weight per newspaper, must be >= 0
* @param d2 (distribution2) total distribution, must be >= 0
*
* @param f2 (frequency2) how often distributed, must be >= 0
* @return returns the product of a2, w2, d2, and f2
* @author Ava Gamble <ava.gamble37@gmail.com>
*/








public static double calculateTotalWaste2(int a2, double w2, int d2, double f2){


return (a2*w2*d2*f2);


}


/**
* //DESCRIPTION: Calculates total waste for Miscellaneous paper
* //PRECONDITION: all values are >= 0
* //POSTCONDITION: Returns total calculated waste for category 3
*
* @param a3 (amount3) number of misc sheets, must be >= 0
* @param w3 (weight3) weight per misc sheet, must be >= 0
* @param d3 (distribution3) total distribution, must be >= 0
* @param f3 (frequency3) how often distributed, must be >= 0
*
* @return returns the product of a3, w3, d3, and f3
* @author Ava Gamble <ava.gamble37@gmail.com>
*/


public static double calculateTotalWaste3(int a3, double w3, int d3, double f3){


return (a3*w3*d3*f3);


}


/**
* //DESCRIPTION: Calculates the total waste off all sheet types within a year by adding the total waste of each sheet
* //PRECONDITION: all values are >= 0
* //POSTCONDITION: Returns total amount of waste across all sheets combined
*
* @param a1 (amount1) amount of sheets of paper for magazines and catalogs, must be >= 0
* @param w1 (weight1) weight of one magazine and catalog, must be >= 0
* @param d1 (distribution1) how many employees that had one magazine and catalog distributed to them, must be >= 0
* @param f1 (frequency1) how frequently a magazine and catalog was distrubted, must be >= 0
* @param a2 (amount2) amount of sheets of paper for newspapers, must be >= 0
* @param w2 (weight2) weight of one newspaper, must be >= 0
* @param d2 (distribution2) how many employees that had one newspaper distributed to them, must be >= 0
* @param f2 (frequency2) how frequently a newspaper was distrubted, must be >= 0
* @param a3 (amount3) amount of sheets of paper for miscellaneous, must be >= 0
* @param w3 (weight3) weight of one average sheet (miscellaneous), must be >= 0
* @param d3 (distribution3) how many employees that had one miscellaneous sheet of paper distributed to them, must be >= 0
* @param f3 (frequency3) how frequently a miscellaneous sheet of paper was distrubted, must be >= 0
*
* @return returns the calculated total waste of all types of sheet of paper taking into account all parameter values
* @author Jaya Eckert <jayachristianlopez@gmail.com
*/


public static double calculateTotalWasteYear(int a1, double w1, int d1, double f1,int a2, double w2, int d2, double f2, int a3, double w3, int d3, double f3){


return ((a1*w1*d1*f1)+(a2*w2*d2*f2)+(a3*w3*d3*f3));
}


/**
* //DESCRIPTION: Calculates the average waste of sheets of paper within a year considering all sheet types by adding then dividing
* //PRECONDITION: all values are >= 0
* //POSTCONDITION: Returns average amount of all sheet types combined
*
* @param a1 (amount1) amount of sheets of paper for magazines and catalogs, must be >= 0
* @param w1 (weight1) weight of one magazine and catalog, must be >= 0
* @param d1 (distribution1) how many employees that had one magazine and catalog distributed to them, must be >= 0
* @param f1 (frequency1) how frequently a magazine and catalog was distributed, must be >= 0
* @param a2 (amount2) amount of sheets of paper for newspapers, must be >= 0
* @param w2 (weight2) weight of one newspaper, must be >= 0
* @param d2 (distribution2) how many employees that had one newspaper distributed to them, must be >= 0
* @param f2 (frequency2) how frequently a newspaper was distributed, must be >= 0
* @param a3 (amount3) amount of sheets of paper for miscellaneous, must be >= 0
* @param w3 (weight3) weight of one average sheet (miscellaneous), must be >= 0
* @param d3 (distribution3) how many employees that had one miscellaneous sheet of paper distributed to them, must be >= 0
* @param f3 (frequency3) how frequently a miscellaneous sheet of paper was distributed, must be >= 0
*
* @return returns the calculated average waste of all types of sheet of paper within a year taking into account all parameter values
* @author Jaya Eckert <jayachristianlopez@gmail.com
*/
public static double calculateAverageWasteYear(int a1, double w1, int d1, double f1,int a2, double w2, int d2, double f2, int a3, double w3, int d3, double f3){


return (((a1*w1*d1*f1)+(a2*w2*d2*f2)+(a3*w3*d3*f3))/3);


}












}



 
