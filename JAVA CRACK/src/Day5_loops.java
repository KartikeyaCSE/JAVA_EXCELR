public class Day5_loops {
    public static void main(String[] args) {
        











        for(int count = 0; count <= 4; count++) {
            System.out.println(count);

            // 20 and 35
            for(int i = 20; i <=35; i++) {
                System.out.println(i);
            }
        }

        /*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, 
        or whatever is there if the string is less than length 3. Return n copies of the front;

            frontTimes("Chocolate", 2) → "ChoCho"
            frontTimes("Chocolate", 3) → "ChoChoCho"
            frontTimes("Abc", 3) → "AbcAbcAbc"
         */
        
         public String frontTimes(String str, int n) {
            String result = "";
            int end=3;
            if(str.length()<3) {
              end = str.length();
            }
            
            String front = str.substring(0,end);
            for(int i=0;i<n;i++) {
              result = front + result;
            }
            return result;
          }
          
    }

    
}
