import java.util.Scanner;
public class DiasaSegundo {
	public static void main(String[] args) {

		//Este programa va a pedir de entrada el numero de días y lo va a convertir a segundos.
		
        Scanner scanner = new Scanner(System.in);
        String ingresar ="ingrse número de días para convertirlos en segundos";
        System.out.println(ingresar);
        int dias = scanner.nextInt();
        int horas=24,minutos=60,segundos=60;
        int resultado=dias*horas*minutos*segundos;
        System.out.println(resultado+ " segundos");



	}
}