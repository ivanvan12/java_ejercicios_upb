public class Bandeva{
	public static void main(String args[]){
		boolean bandera = true;
		int x = 0; 

		while(bandera)
		{
			System.out.println("hola");
			if(x>20)
			{
				bandera = false;
			}	

		 
		x++;
	    }
		System.out.println("bandera "+bandera);
	}
}