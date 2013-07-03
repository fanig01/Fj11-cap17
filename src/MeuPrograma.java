public class MeuPrograma {

	public static void main(String[] args) throws InterruptedException {

		GeraPDF gera = new GeraPDF();
		gera.start();

		BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
		barraDeProgresso.start();
		Thread.sleep(3 * 1000);

	}

}