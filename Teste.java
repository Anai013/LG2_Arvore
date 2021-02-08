package arvore;

public class Teste {

	public static void main(String[] args) {

		Arvore<Integer> a1 = new Arvore<Integer>();

		a1.add(16);
		a1.add(13);
		a1.add(17);
		a1.add(01);

		System.out.println("\nEm ordem: ");
		a1.emOrdem(a1.getRaiz());

		System.out.println("\nPré-Ordem: ");
		a1.preOrdem(a1.getRaiz());

		System.out.println("\nPós-Ordem: ");
		a1.posOrdem(a1.getRaiz());

	}

}
