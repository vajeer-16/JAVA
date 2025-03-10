public class ConvertNumbersToString {
    public class SplittingString {
        public static void main(String[] args) {
            String str = "apple,banana,cherry,date";
            String[] fruits = str.split(",");
            for (String fruit : fruits) {
              System.out.println(fruit);
            }
          }
        
    }
}
