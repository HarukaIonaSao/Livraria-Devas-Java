package POO;

import java.util.Scanner;

public class LivrariaTeste {
public static void main(String[] args) {
		
		LivrariaDevas lv1 = new LivrariaDevas("Bom Dia Verônica","Raphael Montes e Ilana Casoy","Policial e Mistério",4002,15,"Digital", "uiui");
		LivrariaDevas lv2 = new LivrariaDevas("Romance e Sensibilidade","Jane Austen","Romance",1234,30,"Físico");
		LivrariaDevas lv3 = new LivrariaDevas("Eu,Rob��","Isaac Asimov","Futuro Distópico",9788,39.90,"Físico");
		
	
	
		System.out.println("*****LIVRARIA DEVAS*****");
		System.out.println("Digite o g�nero do livro: ");
		System.out.println("1- Terror");
		System.out.println("2 - Romance");
		System.out.println("3 - Fic��o");
		
		
		Scanner leia = new Scanner(System.in);
		int op;
		
		System.out.println("Digite uma opção: ");
		op = leia.nextInt();
		
		if(op == 1)
		{
			
			lv1.imprimirInfo();
			
		} else if (op == 2)
		{
			
			lv2.imprimirInfo();
			romance.imprimirNovaInfo();
			
		} else if (op == 3)
		{
			
			lv3.imprimirInfo();
			
		{
			
			System.out.println("Opção inválida!");
			
		}
	}
}
}

