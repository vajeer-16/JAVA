public class SttaicAndInstance {
    [20:30, 06/03/2025] vajeer(MECS): public class StaticAndInstance {

   
        static int staticVar1 = 100;
        static int staticVar2 = 200;
    
        
        int instanceVar1 = 10;
        int instanceVar2 = 20;
    
        
        public static void main(String[] args) {
            
            System.out.println("Static Variable 1: " + staticVar1);
            System.out.println("Static Variable 2: " + staticVar2);
    
            
            StaticAndInstance obj = new StaticAndInstance();
    
            
            System.out.println("Instance Variable 1: " + obj.instanceVar1);
            System.out.println("Instance Variable 2: " + obj.instanceVar2);
        
    
    [20:30, 06/03/2025] vajeer(MECS): public class StaticInstance {
    
        
        public static void staticMethod() {
            System.out.println("This is a static method.");
        }
    
       
        public void instanceMethod() {
            System.out.println("This is an instance method.");
            
           
            staticMethod();  
        }
       
        public static void main(String[] args) {
           
            StaticInInstance obj = new StaticInInstance();
            
            
            obj.instanceMethod();
        }
    }
}
