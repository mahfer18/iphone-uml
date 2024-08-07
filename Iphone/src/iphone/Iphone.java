package iphone;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	
	private String reproduzirMusica;
	private String fazerLigacao;
	private String acessarPagina;

	@Override
	public void tocar() {
		if(reproduzirMusica != null) {
			System.out.println("Tocando música"+ reproduzirMusica);
		} else {
			System.out.println("Nenhuma música selecionada");
		}
		
	}

	@Override
	public void pausar() {
		if(reproduzirMusica != null) {
			System.out.println("Pause - Música: " + reproduzirMusica);
		} else {
			System.out.println("Nenhuma música selecionada");
		}
		
	}

	@Override
	public void selecionarMusica(String musica) {
		this.reproduzirMusica = musica;
		System.out.println("Música selecionada: " + reproduzirMusica);
	}

	@Override
	public void exibirPagina(String url) {
		this.acessarPagina = url;
		System.out.println("Carregando página: " + acessarPagina);
		
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova Aba...");
		
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
		
	}

	@Override
	public void ligar(String numero) {
		this.fazerLigacao = numero;
		System.out.println("Ligar número: " + fazerLigacao);
		
		
	}

	@Override
	public void atender() {
		System.out.println("Atender Ligação...");
		
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Acessando Correio de Voz...");
		
		
	}

}
