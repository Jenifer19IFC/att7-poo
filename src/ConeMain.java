import java.util.Scanner;

public class ConeMain {

	public static void main(String[] args) {
		
		Cone c = new Cone (0);
		Scanner input=new Scanner (System.in);
	
		System.out.println("Digite o raio: ");
		c.setRaio(input.nextFloat());
	
		System.out.println("Digite o altura: ");
		c.setAlt(input.nextFloat());
	
		System.out.println("Tipo de tinta: 1 - Tipo 1; 2 - Tipo 2; 3 - Tipo 3.");
		c.setTipo(input.nextInt());
		
		System.out.println(c);
		
		input.close();
		
	}

}
		
		
	


