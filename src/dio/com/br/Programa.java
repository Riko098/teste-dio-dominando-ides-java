package dio.com.br;

import dio.com.br.model.Gato;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato =  new Gato("Tom", "Marrom", 2);
		System.out.println(gato);
		System.out.println(gato.getNome());
		System.out.println(gato.getCor());
		System.out.println(gato.getIdade());
	}

}
