package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class modulos {
	public modulos() {
		super();
	}
	
	public Pilha pilha = new Pilha();
	
	public void exercA() throws Exception {
		for(int i=0; i < 10; i++) {
			if(i%2 == 0) {
				pilha.push(i*i);
			}else {
				if(i<=5) {
					pilha.push(i);
				}else {
					pilha.pop();
				}
			}
			
			pilha.top();
		}
		pilha.size();
		
		while(pilha.isEmpty() == false) {
			int x = pilha.pop();
			System.out.print(x + " ");
		}
	}
	

	public void exercB() throws Exception {
		for(int i= 100; i < 115; i++ ){
			if(pilha.isEmpty() ) {
				pilha.push(i+100);
			}else {
				if(pilha.size() <= 4) {
					pilha.push(i+50);
				}else {
					pilha.pop();
				}
			}
			pilha.top();
		}
		pilha.size();
		
		while(pilha.isEmpty() == false) {
			int x = pilha.pop();
			System.out.print(x + " ");
		}
	}
	
}