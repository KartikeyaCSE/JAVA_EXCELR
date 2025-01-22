public class evenOdd
{
   public static void main(String args[])
   {
      //an integr variable 'number' declared and initialized
      int number = 6547;
   
       //declaring two variables evenSum and oddSum 
       //and initializing both to 0
       int evenSum=0;
       int oddSum=0;
       
      //continue loop till number becomes 0
      while(number!=0)
        {
            //getting digit of number
            int rem=number%10;
            
            //if 'rem' is even digit then add it to evenSum
            if(rem%2==0)
            {
                evenSum=evenSum+rem;
            }
            else
            {
                oddSum=oddSum+rem;
            }
            
            number=number/10;
        }
      System.out.println("Sum of even digits: "+ evenSum);
      System.out.println("Sum of odd digits: "+ oddSum);
   }
}