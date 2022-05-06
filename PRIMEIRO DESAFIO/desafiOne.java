import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class desafiOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();
		List<Integer> par = new ArrayList<>();
		List<Integer> impar = new ArrayList<>();

		// System.out.println("Insira a quantidade de numeros que deseja colocar em
		// sequencia: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++)
			lista.add(sc.nextInt());

		for (Integer x : lista) {
			if (x % 2 == 0)
				par.add(x);
			else
				impar.add(x);
		}

		Collections.sort(par);
		Collections.sort(impar);
		Collections.reverse(impar);

		// System.out.println("Numeros Pares: ");
		for (Integer p : par) {
			System.out.println(p);
		}
		// System.out.println("Numeros impares: ");
		for (Integer i : impar) {
			System.out.println(i);
		}
		sc.close();
	}

}