package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa(1,"Paulo Duarte", "psmduarte@live.com");
		Pessoa p2 = new Pessoa(2,"Daniela Chambel", "danielachambel@hotmail.com");
		Pessoa p3 = new Pessoa(3,"Maria Duarte","não tem email");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
