package iphone;

public class main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		iphone.ligar("41 99999-8888");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.selecionarMusica("Too Sweet - Hozier");
		iphone.tocar();
		iphone.pausar();
		
		iphone.exibirPagina("www.uol.com.br");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		

	}

}
