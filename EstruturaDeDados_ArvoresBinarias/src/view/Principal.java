package view;
import controller.*;

public class Principal {
	public static void main(String[] args) {
		Arvore<Integer> arvore= new Arvore<Integer>();
		arvore.adc(10);
		arvore.adc(8);
		arvore.adc(5);
		arvore.adc(9);
		arvore.adc(7);
		arvore.adc(18);
		arvore.adc(13);
		arvore.adc(20);
		
		System.out.println("Arvore em ordem:");
		arvore.emOrdem(arvore.getRaiz());
		
		System.out.println("Arvore em pre-ordem");
		arvore.preOrdem(arvore.getRaiz());
		
		System.out.println("Arvore em pos-ordem");
		arvore.posOrdem(arvore.getRaiz());
	}
}
