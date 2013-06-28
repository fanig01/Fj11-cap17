public class MeuPrograma {

	public static void main(String[] args) {

		GeraPDF gera = new GeraPDF();
		gera.start();

		BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
		barraDeProgresso.start();

	}

}