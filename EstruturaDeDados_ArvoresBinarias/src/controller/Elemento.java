package controller;

public class Elemento<T> {
	private T valor;
	private Elemento<T> direita;
	private Elemento<T> esquerda;

	public Elemento(T novoValor){
		this.valor=novoValor;
		this.direita=null;
		this.esquerda=null;
	}
	
	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public Elemento<T> getDireita() {
		return direita;
	}

	public void setDireita(Elemento<T> direita) {
		this.direita = direita;
	}

	public Elemento<T> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Elemento<T> esquerda) {
		this.esquerda = esquerda;
	}
	
}
