public class StaticInstance {
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

   
    public void instanceMethod() {
        System.out.println("This is an instance method.");
        
       
        staticMethod();  
    }
   
    public static void main(String[] args) {
       
        StaticInstance obj = new StaticInstance();
        
        
        obj.instanceMethod();
    }
}

