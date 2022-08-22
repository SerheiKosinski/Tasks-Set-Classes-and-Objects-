package triangle;

public class Triangle {
	
	private double a;
	private double b;
	private double c;
		
		public Triangle() {
			a = 0;
			b = 0;
			c = 0;
		}
		
		public Triangle(double a, double b, double c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}

		public double getC() {
			return c;
		}

		public void setC(double c) {
			this.c = c;
		}

		@Override
		public String toString() {
			return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", getA()=" + getA() + ", getB()=" + getB()
					+ ", getC()=" + getC() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
	
}
