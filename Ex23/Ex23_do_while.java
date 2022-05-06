package Ex23;

import java.util.Scanner;

public class Ex23_do_while {
public static void main (String []args) {
Scanner ler = new Scanner(System.in);	

	char sexo;
			
			
	do {
		System.out.printf("Digite seu sexo (F ou M): ");
		sexo = ler.next().charAt(0);
		sexo = Character.toUpperCase(sexo);
	}
	while (sexo != 'F' && sexo != 'M');
	
	
	if (sexo == 'F')
		System.out.printf("%c molier", sexo);
	else
		System.out.printf("%c macholo", sexo);
		}
}
