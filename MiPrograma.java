public class MiPrograma{
   public static void main(String argrs[])
{
	//declaracion de variables

byte numero1;
int numero2;
long numero3;
float numero4;
double numero5;
char caracter;
String cadenas;
boolean bandera;


//Inicializacion de las variables.
numero1 = 2;
numero2 = 50;
numero3 = 1234567;
numero4 = 55.4f;
numero5 = 7.14;
caracter = 'a';
cadenas = "Hola Mundo";
bandera = true;// false


//operadores aritmeticos.
numero2 = numero1 + numero2;
System.out.println(numero2);
numero1 = 3;
System.out.println(numero1);
numero3 =numero3 - numero2;
System.out.println(numero3);
numero5 = numero5 % numero1;
System.out.println(numero5);
numero4 = 12.7f/2;
System.out.println(numero4);

//Impresion de los caracteres y cadenas.
System.out.println(cadenas);
System.out.println(caracter);

//operadores de relacion.
System.out.println(7>2);
System.out.println(6<3);
System.out.println(77==76);
System.out.println(45>=12);
System.out.println(12<=12);
System.out.println(numero1<numero2);

//Operadores logicos.
System.out.println(true&&true);
System.out.println(true&&false);
System.out.println(true||false);
System.out.println(!false&&true);
}

}