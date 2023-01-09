import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
		public static void main(String[] args) {

			metodo1();
			System.out.println("Fim do Programa");
		}
		
		public static void metodo1() {
			System.out.println("Metodo 1 - Inicio");
			metodo2();
			System.out.println("Metodo 1 - Final");
		}
		
		public static void metodo2() {
			System.out.println("Metodo 2 - Inicio");
			Scanner sc = new Scanner(System.in);
			
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("Posicao Invalida!");
			//StackTrace
			e.printStackTrace();
			sc.next();
		}
		catch (InputMismatchException e) {
			System.out.println("Erro de Entrada!");
		}
		
		sc.close();
		
		System.out.println("Metodo 2 - Final");
		}

}


