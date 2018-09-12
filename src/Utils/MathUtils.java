package Utils;

public class MathUtils {

	public static Double getQuadraticSolution(double a, double b, double c)
	
	{
		double discriminant = b * b - 4 * a * c;
	
		
		if (discriminant <= 0)
		{
			return null;
		}
		
		double x1 = (-b + Math.sqrt(discriminant)) / (2*a);
		double x2 = (-b - Math.sqrt(discriminant)) / (2*a);		
		
		x1 = Math.abs(x1);
		x2 = Math.abs(x2);
		
		if (x1 < x2)
		{
			return x1;
		}
		
		return x2;
		
	}
	
	
}
