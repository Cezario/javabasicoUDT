package cursoJava.basico;
/*
 * Classe de explicação e demonstração dos operadores
 * 
 * versão: 1.0
 * 
 * autor: João Paulo
 * 
 * */

public class Operadores {

	public static void main(String[] args) {
		
		int numero1 = 10, numero2 = 8;
		
		//Operadores aritiméticos + - * / %
		int resultado1 = numero1 + numero2;
		System.out.println(resultado1);
		
		int resultado2 = numero1 - numero2;
		System.out.println(resultado2);
		
		int resultado3 = numero1 * numero2;
		System.out.println(resultado3);
		
		double resultado4 = (double)numero1 / numero2;
		System.out.println(resultado4);
		
		int resultado5 = numero1 % numero2;
		System.out.println(resultado5);
		
		//Operadores de incremento
		System.out.println(numero1++);
		System.out.println(numero1);
		
		System.out.println(--numero2);
		
		System.out.println(numero1+=10);
		
		System.out.println(numero1*3);
		
		System.out.println(numero1/=4);
		
		System.out.println(numero1);
		
		//Operador de igualdade
		System.out.println(numero1==numero2);
		
		//Operadores de relacionamento
		System.out.println(numero1 > numero2);
		System.out.println(numero1 >= numero2);
		System.out.println(numero1 < numero2);
		System.out.println(numero1 <= numero2);
		
		//Operadores lógicos %% ||
		System.out.println(false && false);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(true && true);
		
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(true || true);
		
	}

}
