package sl;
//懒汉式
public class Singleton {
	private Singleton(){}
	private static Singleton singleton = null;
	public static synchronized Singleton getInstance(){
		if(singleton==null)
			singleton = new Singleton();
		return singleton;
	}
	
}
