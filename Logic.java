package triangle;

public class Logic {
	
	public double Perim(Triangle triangle) {
		double perim;
		perim = triangle.getA() + triangle.getB() + triangle.getC();
		return perim;
		
	}
	
	public double Sqr(Triangle triangle) {
		
		double sqr;
		double p;
		
		p = triangle.getA() + triangle.getB() + triangle.getC();
		
		sqr = Math.sqrt(p*(p-triangle.getA())*(p-triangle.getB())*(p-triangle.getC()));
		
		return sqr;
		
	}
	
	public double aMedian(Triangle triangle) {
		double x;
		
		x = triangle.getA() / 2;
		
		return x;
	}
	
	public double bMedian(Triangle triangle) {
		double y;
		
		y = triangle.getB() / 2;
		
		return y;
	}
	public double cMedian(Triangle triangle) {
		double z;
		
		z = triangle.getC() / 2;
		
		return z;
	}
	

}
