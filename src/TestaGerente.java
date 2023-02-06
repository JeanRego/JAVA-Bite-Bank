
public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Jean");
		gerente.setSalario(10000);
	
		
		System.out.println("Nome: " + gerente.getNome() + ", Salario: " + 
		gerente.getSalario());
		
		gerente.getBonificacao();
		
		System.out.println(gerente.getSalario());
	}
}
