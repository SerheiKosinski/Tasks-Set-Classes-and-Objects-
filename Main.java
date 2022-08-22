package triangle;

public class Main {

	public static void main(String[] args) {
		
	Triangle trngl1 = new Triangle(20,25,57 );
	
	Logic logik = new Logic();
	Viev print = new Viev();
	
	double perim1;
	perim1 = logik.Perim(trngl1);
	double sqr1;
	sqr1 = logik.Sqr(trngl1);	
	double amed;
	amed = logik.aMedian(trngl1);
	double bmed;
	bmed = logik.bMedian(trngl1);
	double cmed;
	cmed = logik.cMedian(trngl1);
	
			
	print.Perimetr(perim1);
	print.Sqr(sqr1);
	print.Median(amed, bmed, cmed);
	}
}
	



