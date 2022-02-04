package java2lab02;

import java.util.Scanner;

public class TrucksDriver {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		Truck[] trucks = new Truck[N];
		for (int i = 0; i < N; i++) {
			String registrationNo = scan.next();
			int maxLoadCap = scan.nextInt();
			int nBoxes = scan.nextInt();
			trucks[i] = new Truck(registrationNo, maxLoadCap, nBoxes);
			trucks[i].validate();

		}
		for (Truck truck : trucks) {
			System.out.println(truck);
		}
		scan.close();
	}

}
