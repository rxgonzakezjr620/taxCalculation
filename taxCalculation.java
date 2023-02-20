import java.util.Scanner
public class taxCalculation
{
	/*
	private static Scanner keyboard = new Scanner(System.in);
}
	private static final double) <= 12950;
	private static final double) = 12950;
	private static final double) >= 12950;
	private static final double ABOVE = 0.25
	private static final double EQUAL = 0.15
	private static final double BELOW = 0.10
	*/
	public static void main(String[] args) {
	final double Method1 = 0.10;
	final double Method2 = 0.20;
	final double Method3 = 0.30;
	final double Method_1_Single_Limit >= 12950);
	final double Method_2_Single_Limit <= 12950);
	final double Method_3_Single_Limit =  12950;
	double Indulgence1 = 0;
	double Indulgence2 = 0;
	double Indulgence3 = 12950;
	
	Scanner in = new Scanner(System.in);
	System.out.print("State your income:");
	double income = in.nextDouble();
	
	if (income <= 12950){
		Indulgence1 = Method1 * income;
	}
	else {
		Indulgence1 = Method1 * Method_1_Single_Limit;
		Indulgence2 = Method2 * (income - Method_1_Single_Limit);				
	}
	if (income >= 12950) {
		Indulgence2 = Method2 * income;
	}
	else {
		Indulgence1 = Method1 * Method_2_Single_Limit;
		Indulgence2 = Method1 * (income - Method_2_Single_Limit);
	}
}
	if (income = 12950) {
		Indulgence3 = Method3 * income;
	else
		indulgence3 = Method3 * income;
	}
	}
		/*Scanner console = new Scanner (System.in);
	while(true) {
		a= keyboard.nestDouble;
		if(a> 0) {
			income = income + a;
			{else if (a < 0) {
				dod = dod + a;
				{else}
				break;
			}
		}
	}
		income = 50,000
				dod = 2000;
		*/
double tax = income * 0.30;
System.out.println("The amount of tax is $" + (int)(tax * 100)/1000.0);
System.out.println("The total cost is $" + (int)((tax + income) *100/ 100));
}}