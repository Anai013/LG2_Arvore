package arvore;

public class Arvore<TIPO extends Comparable> {

	private Elemento<TIPO> raiz;

	public Arvore() {
		this.raiz = null;
	}

	public void add(TIPO valor) {
		Elemento<TIPO> novo = new Elemento<TIPO>(valor);

		if (raiz == null)
			this.raiz = novo;
		else {
			Elemento<TIPO> atual = this.raiz;
			while (true) {
				if (novo.getValor().compareTo(atual.getValor()) == -1) {
					if (atual.getEsquerda() != null) {
						atual = atual.getEsquerda();
					} else {
						atual.setEsquerda(novo);
						break;
					}
				} else {/* se for maior ou igual */
					if (atual.getDireita() != null) {
						atual = atual.getDireita();
					} else {
						atual.setDireita(novo);
						break;
					}
				}
			}
		}

	}

	public Elemento<TIPO> getRaiz() {
		return raiz;
	}

	public void emOrdem(Elemento<TIPO> atual) {
		if (atual != null) {
			emOrdem(atual.getEsquerda());
			System.out.print(" " + atual.getValor());
			emOrdem(atual.getDireita());
		}
	}

	public void preOrdem(Elemento<TIPO> atual) {
		if (atual != null) {
			System.out.print(" " + atual.getValor());
			preOrdem(atual.getEsquerda());
			preOrdem(atual.getDireita());
		}
	}

	public void posOrdem(Elemento<TIPO> atual) {
		if (atual != null) {
			posOrdem(atual.getEsquerda());
			posOrdem(atual.getDireita());
			System.out.print(" " + atual.getValor());
		}
	}
}