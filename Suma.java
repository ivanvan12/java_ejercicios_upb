public class Suma{
	public static void main(String args[]){
		// resta,suma,multiplicacion, division y operador modulo (%).
		int x = 7 + 10 * 3 -40,y = 45 % 3 /2;

		int result = x + y;

		double z =15,p=4;
		double zz = z / p;//se usa double porque el resultado no es un numero entero.

		System.out.println(result);//crear una variable tipo entero y convovarla para que almacene el resultado de la suma de x y y.
		System.out.println(x+y);//otra manera de sumar 
		System.out.println(zz);
	}
}