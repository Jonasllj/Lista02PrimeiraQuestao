import java.util.Scanner;

public class PrimeiraQuestao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1,nota2,nota3,media;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite as notas:");
		
		nota1 = sc.nextFloat();
		nota2 = sc.nextFloat();
		nota3 = sc.nextFloat();

		media = (nota1+nota2+nota3)/3;
		
		if(media >= 0.0 && media < 3.0) {
			System.out.println("Reprovado");
		}else if(media >=3.0 && media <7) {
			System.out.println("Prova Final");
		}else if(media>=7.0 && media <=10) {
			System.out.println("Aprovado");
		}
		
	}
}
