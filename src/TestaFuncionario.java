
public class TestaFuncionario extends Funcionario {
	
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		gerente.setsenha(0001);
		
		System.out.println(gerente.autentica(0001));
		System.out.println(gerente.salario);
	}

	@Override
	public double getBonificacao() {
		
		return 0;
	}

}
