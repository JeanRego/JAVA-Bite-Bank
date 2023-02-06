
public class SistemaInterno {
	
	private int senha = 0000;
	
	public void autentica(Autenticavel g) {
		boolean autenticou = g.autentica(this.senha);
		
		if(autenticou) {
			System.out.println("ACESSO LIBERADO!");
		}else {
			System.out.println("ACESSO NEGADO!");
		}
	}
	
}
