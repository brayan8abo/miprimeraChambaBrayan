import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola Chamberos");
		Scanner sc = new Scanner(System.in);
		boolean opcion = true;
		int opcion2;
		do {

			System.out.println("Menu de Chambas");
			System.out.println("Feliz Navidad");
			System.out.println("1-Matón");
			System.out.println("2-Camello");
			System.out.println("3-Asesino");
			opcion2 = sc.nextInt();

			if (opcion2 == 2) {

				System.out.println("AHORA ERES UN CAMELLO");
				break;

			}

			if (opcion2 == 1) {

				System.out.println("AHORA ERES UN MATÓN");
				break;
			}

			if (opcion2 == 3) {

				System.out.println("AHORA ERES UN ASESINO");
				break;

			}
			
//			else {
//				System.out.println("ERES UN DON NADIE!!!!!!!!!!!!!!!!!");
//			}
		} while (opcion == false);

	}

}
