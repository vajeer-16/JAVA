public class LocalGlobalVariable {
        
        int a = 11;
        void localVariable() {
            
            int a = 22;
            System.out.println("Local variable a : " + a);
        }
    
        public static void main(String[] args) {
            LocalGlobalVariable obj = new LocalGlobalVariable();
            System.out.println("Instance variable a : " + obj.a);
            
            obj.localVariable();
        }
    
    }

