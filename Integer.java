class Integer
{
 public static void main(String args[])
  {
    Integer object=new Integer();
    object.digit(8608);
    object.find(86);
    object.sum(86);
    object.sumdigit(8608);
    object.reverse(8608);
  }
 public void digit(int num)
   {
    int n=num;
    int count=0;
    while(n>0)
    {
      int a=n%10;
      count++;
      n=n/10;
    }
     System.out.println("Number of digits in given number " +count);
     System.out.println("___________________________");
   }
  public void find(int num)
   {
    int n=num;
    while(n>0)
    {
     int l=n%10;
     System.out.println("In 86 the last digit is  " +l); 
     int f=n/10;
     System.out.println("in 86 the first digits  is " +f);
      System.out.println("___________________________");
     break;
    }    
   }
  
  public void sumdigit(int num)
  {
    int n=num;
    int sum=0;
    while(n>0)
    {
     int a=n%10;
     sum=sum+a;
     n=n/10;
    }
    System.out.println("Sum of the given number "+sum);
  }
 public void reverse(int num)
  {
   int n=num;
   int rev=0;
   while(n>0)
   {
    int a=n%10;
    rev=rev*10+a;
    n=n/10;
   } 
     System.out.println("The reverse of given number is "+rev);
    System.out.println("___________________________");
  }
}











