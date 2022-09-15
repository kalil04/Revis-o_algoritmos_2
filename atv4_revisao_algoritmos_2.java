
import java.util.Scanner;

public class atv4_revisao_algoritmos_2 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int quantidadeElementos = 0;
		int[] elementos;
		
		System.out.println("Quantos elementos você deseja inserir? ");
		quantidadeElementos = sc.nextInt();
		
		elementos = new int[quantidadeElementos];
		for(int i= 0; i< elementos.length; i++) {
			elementos[i] = (int)(Math.random()*100);
			
			if(elementos[i] %2!= 0 && elementos[i] %3!= 0 && elementos[i] %5!= 0) {
				System.out.println("Números primos: " + elementos[i]);
			}
		}
		sc.close();
	}

}
