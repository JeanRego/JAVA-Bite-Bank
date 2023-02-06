
public class Cliente implements Autenticavel {

	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	
	}

	@Override
	public void setsenha(int x) {
		this.autenticador.setsenha(x);
		
	}

	
	}


