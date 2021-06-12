import java.util.Scanner;
public class Jimpre {
	public static void main(String[] args) {
		
		/*Este programa saca el promedio de 5 notas ingresadas, se pueden agregar porcentajes
		y cambiar el limite en donde se gana o se pierde la materia o area.*/

		Scanner hello = new Scanner(System.in);
		System.out.println("ingresa nota 1");
		float nota1 = hello.nextFloat();
		System.out.println("ingresa nota 2");
		float nota2=hello.nextFloat();
		System.out.println("ingresa nota 3");
        float nota3=hello.nextFloat();
        System.out.println("ingresa nota 4");
        float nota4=hello.nextFloat();
        System.out.println("ingresa nota 5");
        float nota5=hello.nextFloat();
		float resultado = nota1+nota2+nota3+nota4+nota5;
		float rfinal=resultado/5;

		if(rfinal>=3) {
			System.out.println("Ganaste :D , tu nota final es de "+rfinal);
		}
		else {
			System.out.println("perdiste :( , tu nota final es de "+rfinal);
		}

	}
}