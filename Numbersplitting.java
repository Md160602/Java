class Numbersplitting
//This program is used to finding the numbers like middle ,unit in given number.
{
  public static void main(String args[])
   {
     Numbersplitting numbersplitting=new Numbersplitting();
     int lastvalue=numbersplitting.lastdigit(10);
     System.out.println("The last digit in givrn number : " + lastvalue);
     int tensvalue=numbersplitting.tens(738);
     System.out.println("The tens number in given number is : " + tensvalue);
     int hunsvalue=numbersplitting.huns(34567);
     System.out.println("The huns number in given number is : " + hunsvalue);
     int thousandvalue=numbersplitting.thousand(5678);
     System.out.println("The thous number in given number is : " + thousandvalue);
     int sumvalue=numbersplitting.sum(lastvalue,tensvalue,hunsvalue,thousandvalue);
     System.out.println("THhe sum of the given number is :" + sumvalue);
     numbersplitting.swap(sumvalue);
     
   }
    // This method is finding the unit digit in given number.
    public int lastdigit(int number)
      {
       
       int lastnum=number%10;
       return lastnum;
      }
   //This method is used in to finding 10th position number in given number.
    public int tens(int number)
      { 
       int tens=number%100;
       int tensnum=tens/10;
       return tensnum;
      }
    //This method used to finding 100th position of given number.
    public int huns(int number)
      {
       int huns=number/100; 
       int hunsnum=huns%10;
       return hunsnum;
      }    
    // This method is used to finding 1000th position of given number.
     public int thousand(int number)
     {
      int thousand=number/1000;
      int thousandnum=thousand%10;
      return thousandnum;
     }
    //This method is used to sum of finding number.
     public int sum(int num1,int num2,int num3,int num4)
     {
       int sum=num1+num2+num3+num4;
       return sum;
     } 
   // This method is used to swap the sum number.
    
    public void swap(int num)
    {
     int first=num%10;
     int second=num/10;
     int swap1=first;
     int swap2=second; 
     
     
     System.out.println("Swaping value is : " +swap1+swap2);
    }
 }
