
public class ControleBonificacao {
	
	private double soma;
	
	public void registra(Funcionario x) {
		double boni = x.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
}
