import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Builder {
	
	public <E> E getInstance(Class<E> c, Object... o) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Class<?>[] tipos = new Class<?>[o.length];
		
		for(int i=0; i<tipos.length; i++)
			tipos[i] = o[i].getClass();
		
		return (E) c.getConstructor(tipos).newInstance(o);
	}
	
	public <E> void lendoCampos(Object o) throws IllegalArgumentException, IllegalAccessException {
		
		Class<?> c = o.getClass();
		
		for(Field f : c.getDeclaredFields()) {
			f.setAccessible(true);
			System.out.println(f.getName() +" - "+ f.get(o));
		}
		
	}
	
	public void chamadorDeMetodos(Object o) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> clazz = o.getClass();
		
		for( Method m : clazz.getDeclaredMethods() ) {
			if(m.getName().startsWith("test") 
					&& m.getReturnType() == void.class
					&& m.getParameters().length == 0)
				m.setAccessible(true);
				m.invoke(o);
		}
		
			
	}

}
