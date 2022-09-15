
import java.util.Scanner;

public class atv1_revisao_algoritmos_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidade = 0;
		float[] notas;
		float resultado = 0f;
		
		System.out.println("Quantas notas você deseja inserir? ");
		quantidade = sc.nextInt();
		
		notas = new float[quantidade];
		
		for(int i= 0; i < notas.length; i++) {
			System.out.println("Insira a nota " +(i+1));
			notas[i]= sc.nextFloat();
			resultado = (resultado + notas[i]);
		}
		System.out.println("A média aritmética é "+(resultado/notas.length));
		sc.close();
	}

}
