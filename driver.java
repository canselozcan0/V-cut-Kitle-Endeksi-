import java.util.Scanner;

public class driver {
	public static void main(String[] args) {
		double boy, kilo;
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
		boy = input.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz: ");
		kilo = input.nextDouble();
		double vKitleEndeksi = (kilo / (boy*boy));
		System.out.println("Vücut kitle endeksiniz: " + " " + vKitleEndeksi);
		
	}

}
