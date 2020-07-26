package design_patterns.design_patterns.Creational;

class SingletonEagar {
  private static SingletonEagar instance = new SingletonEagar(); 
  
  private SingletonEagar(){}
  
  public static SingletonEagar getInstance() {
    return instance;
  }
}

class Singleton {
  private static Singleton instance; 
  
  private Singleton(){}
  
  public static Singleton getInstance() {
    if(instance == null) {
      instance = new Singleton();
    }
    
    return instance;
  }
}




public class SingletonExample {

  public static void main(String[] args) {
	  //SingletonEagar instance = SingletonEagar.getInstance();
	  Singleton instance = Singleton.getInstance();
    
    System.out.println(instance);
    
    //SingletonEagar instance1 = SingletonEagar.getInstance();
    Singleton instance1 = Singleton.getInstance();
    
    System.out.println(instance1);
  }
}