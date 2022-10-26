import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int kilo;
		double kacTL;
		double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlıcan=5.00;
		String meyve;
		System.out.println("Meyve Seçiniz:");
		Scanner inp = new Scanner(System.in);
		
		meyve = inp.next();
		
		switch(meyve) {
		case "armut":
			System.out.println("Kaç kilo?: ");
			kilo= inp.nextInt();
			kacTL= armut*kilo;
			System.out.println("Ödemeniz gereken tutar: "+kacTL);
		case "elma":
			System.out.println("Kaç kilo?: ");
			kilo= inp.nextInt();
			kacTL= elma*kilo;
			System.out.println("Ödemeniz gereken tutar: "+kacTL);
		case "domates":
			System.out.println("Kaç kilo?: ");
			kilo= inp.nextInt();
			kacTL= domates*kilo;
			System.out.println("Ödemeniz gereken tutar: "+kacTL);
		case "muz":
			System.out.println("Kaç kilo?: ");
			kilo= inp.nextInt();
			kacTL= muz*kilo;
			System.out.println("Ödemeniz gereken tutar: "+kacTL);
		case "patlıcan":
			System.out.println("Kaç kilo?: ");
			kilo= inp.nextInt();
			kacTL= patlıcan*kilo;
			System.out.println("Ödemeniz gereken tutar: "+kacTL);
		}
		
		
	}

}
