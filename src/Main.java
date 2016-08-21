import java.lang.reflect.InvocationTargetException;


public class Main {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Teste t = new Builder().getInstance(Teste.class);
		System.out.println(t.teste);
		
		//Lendo campos por reflection
		new Builder().lendoCampos(new Teste());
		
		new Builder().chamadorDeMetodos(new Teste());
		
	}

}
