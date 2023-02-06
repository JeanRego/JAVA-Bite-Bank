
public class TestaProgramador {
	
	public static void main(String[] args) {
		
		Programador programador = new Programador();
		ControleBonificacao controle = new ControleBonificacao();
		
		programador.setSalario(1000);
		controle.registra(programador);
		
		System.out.println(controle.getSoma());

		
	}

}
