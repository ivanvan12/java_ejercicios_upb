public class OperadorTernario{
	public static void main(String args[]){

		//Operador ternario java
      
       //Declaracion de variables e inicializacion de las mismas

	   int x = 2;
	   String cadenas = "¿cómo estás?";

	   //Aquí empieza el operador ternario y su estructura

	   cadenas = (7>=12)?"verdadero":"falso";
	   System.out.println(cadenas);

	    cadenas=(7<=12)?"verdadero":"falso";
	   System.out.println(cadenas);

	  
      x = (true&&false)?1:0;
      System.out.println(x);
	   
	}

}