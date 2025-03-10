public class MatchString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String regex = "Hello,.*!";
        if (str.matches(regex)) {
          System.out.println("String matches the regular expression");
        } else {
          System.out.println("String does not match the regular expression");
        }
      }
    
}

