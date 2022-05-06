package Ex23;

import java.util.Scanner;

public class Ex23_while {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);	

	char sexo;
	
	System.out.printf("Digite seu sexo (F ou M): ");
	sexo = ler.next().charAt(0);
	sexo = Character.toUpperCase(sexo);
	
	while (sexo != 'F' && sexo != 'M') {
		System.out.printf("Inválido. Usar 'F' ou 'M': ");
		sexo = ler.next().charAt(0);
		sexo = Character.toUpperCase(sexo);
	}
	
	if (sexo == 'F')
		System.out.printf("%c molier", sexo);
	else
		System.out.printf("%c macholo", sexo);
}
}


