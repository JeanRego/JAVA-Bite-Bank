
public class Administrador extends Funcionario implements Autenticavel {
	
	private int senha;
	
	@Override
	public double getBonificacao() {
	
		return 0;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void setsenha(int x) {
		this.senha = x;
		
	}

}
