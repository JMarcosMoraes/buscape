package br.com.buscape.main;


/**
 * Observação, 
 * Teste 1 OK.
 * Teste 2, falta especificar o que acontece quando o submarino sobe.
 * 
 * 
 * @author josemarcos
 * 28/06/2016
 *
 */

public class main {

	//Norte,Leste,Sul,Oeste == 0,1,2,3
	static int direcaoAtual = 0;
	
	// 0 reto, 1 Sobe e 2 Desce
	static int sobeDesce = 0;

	static int eixoX = 0;
	static int eixoY = 0;
	static int eixoZ = 0;

	// L M R D D M M U U
	static final char[] COMANDOS1 = {'L','M','R','D','D','M','M','U','U'};
	
	// R M M L M M M D D L L
	static final char[] COMANDOS2 = {'R','M','M','L','M','M','M','D','D','L','L'};

	public static void main(String[] args) {
		teste1();
		teste2();
	}
		
	private static void teste1() {
		executar(COMANDOS1);
	}
	
	private static void teste2() {
		executar(COMANDOS2);
	}
	
	private static void executar(char[] comandos){
		zerar();
		for (char comando : comandos) {
			if(comando == 'L' || comando == 'R'){
				girar(comando);
			}else if(comando == 'U' || comando == 'D'){
				subirDescer(comando);
			} else {
				mover();
			}
		}
		imprimePosicao();
	}
	
	private static void mover(){
		
		if(direcaoAtual == 0){
			eixoY++;
		}
		
		if(direcaoAtual == 3){
			eixoX++;
		}
		
		if(direcaoAtual == 1){
			eixoX++;
		}
		
		if(sobeDesce != 0){
			if(sobeDesce == 2){
				eixoZ--;
			}
			sobeDesce = 0;
		}
	}
	
	/**
	 * Marca a variavel para subir ou descer o submarino
	 * @param comando
	 */
	private static void subirDescer(char comando){
		if(comando == 'U'){
			sobeDesce = 1;
		}else if(comando == 'D'){
			sobeDesce = 2;
		} else {
			sobeDesce = 0;
		}
	}

	/**
	 * Imprime a posição final do submarino.
	 */
	private static void imprimePosicao() {

		String direcaoFinal = "";
		if (direcaoAtual == 0) {
			direcaoFinal = "NORTE";
		} else if (direcaoAtual == 1) {
			direcaoFinal = "LESTE";
		} else if (direcaoAtual == 2) {
			direcaoFinal = "SUL";
		} else {
			direcaoFinal = "OESTE";
		}
		System.out.println("(" + eixoX + "," + eixoY + "," + eixoZ + "," + direcaoFinal + ")");
	}

	/**
	 * Girar Esquerda e Direira muda a posição;
	 * 
	 * @param girar
	 */
	private static void girar(char girar) {
		if (girar == 'L') {
			if (direcaoAtual == 0) {
				direcaoAtual = 3;
			} else {
				direcaoAtual--;
			}
		} else {
			if (direcaoAtual == 3) {
				direcaoAtual = 0;
			} else {
				direcaoAtual++;
			}
		}
	}
	
	/**
	 * Resetar posição.
	 */
	private static void zerar(){
		eixoX = 0;
		eixoY = 0;
		eixoZ = 0;
		sobeDesce = 0;
		direcaoAtual = 0;
	}
}
