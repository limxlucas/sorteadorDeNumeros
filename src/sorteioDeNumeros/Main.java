package sorteioDeNumeros;
import java.util.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Integer> Numeros = new ArrayList<Integer>();
		Random random = new Random();
		
		System.out.println("Sorteador de numeros pra mega-sena (Se ganhar vem com o pix :D)");
		while(Numeros.size() < 6) {
			int numero = random.nextInt(60);
			if(Numeros.contains(numero)) {
			}else
			Numeros.add(numero);
		}
		Collections.sort(Numeros);
		for(int i = 0; i < Numeros.size(); i++) {
			Thread.sleep(800);
			System.out.println("Numero " + (i + 1) + ": " + Numeros.get(i));
		}
		Thread.sleep(400);
		System.out.println("Boa sorte !");
	}
}
