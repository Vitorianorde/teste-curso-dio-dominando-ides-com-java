package repositoriojavaeclipse;

import repositoriojavaeclipse.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
	Gato gato = new Gato ();
	Livros livros = new Livros ();
		
		System.out.println(gato);
		System.out.println(livros);
		/*int a = 10;
		int b = 10;
		System.out.println("Hello World " + (a+b));*/
	}

}
class Livros{
	private String nome;
	private String npag;
}