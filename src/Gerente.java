
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() { //CONSTRUTOR
		
		autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 200;
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
