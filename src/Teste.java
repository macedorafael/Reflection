
public class Teste {
	
	public Teste() {	}

	public Teste(String teste) {
		this.teste = teste;
	}

	public String teste = "Teste OK!";
	private String teste2 = "Teste privado OK!";

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}

	public String getTeste2() {
		return teste2;
	}

	public void setTeste2(String teste2) {
		this.teste2 = teste2;
	}
	
	public void testeReflection(){
		System.out.println("Chamou o metodo publico da classe!");
	}

	private void testeReflectionPrivate(){
		System.out.println("Chamou o metodo privado da classe!");
	}
	
}
