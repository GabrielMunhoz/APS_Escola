import java.util.Scanner;

public class Console {

	public String dString(String string) {
		System.out.println(string);
		while(true) {	
			try {
				return new Scanner(System.in).nextLine();
				
			}catch(Exception ex){
				
				System.out.println("Valor inserido Invalido");
				
				}	
			}
		
	}

	public int dInt(String string) {
		System.out.println(string);
		
		while(true) {	
		
			try {
			
				return new Scanner(System.in).nextInt();
			}
			catch(Exception ex){
				
				System.out.println("Valor inserido Invalido");
				
			}	
		}
	}

}
