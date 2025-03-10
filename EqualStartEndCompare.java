public class EqualStartEndCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "World";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.startsWith("He"));
        System.out.println(str1.startsWith("hE")); 
        System.out.println(str1.endsWith("lo"));  
        System.out.println(str1.endsWith("LO")); 
        System.out.println(str1.compareTo(str2)); 
        System.out.println(str1.compareTo(str3));  
    } 
}