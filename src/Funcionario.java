
public abstract class Funcionario {

	private String nome;
	private String cpf;
	protected double salario; //PROTECTED = PUBLICO PARA OS FILHO
	
	public abstract double getBonificacao();
		//return this.salario = (this.salario*0.1) + this.salario;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
