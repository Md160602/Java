class Palin
{
 public static void main(String args[])
 {
  Palin object=new Palin();
  object.palindrome(1001);
  object.div(200);
  object.prime(71);
  object.revprime(18);
  object.prime(81);
  object.sumprime(567);
  object.prime(18);
 }
 public void palindrome(int num)
 {
  int n=num;
  int rev=0;
  if(n>9)
  {
   while(n>0)
   {
    int a=n%10;
    rev=rev*10+a;
    n=n/10;
   }
   if(rev==num)
   {
    System.out.println(num+" Given number is palindrome "+rev);
   }
   else
   {
    System.out.println(num+" Given number is  not a palindrome "+ rev);
   }
  }
  else
   {
    System.out.println("Please check your number"+num);
   }
  System.out.println("_____________________________");  
 }
 public void div(int num)
  {
   int n=num;
   int i=100;
   while(i<=n)
   {
    if(i%9==0)
    {
     System.out.println("Given number is div by 9 are "+i);
     
    }
    i++;
   }
   System.out.println("_____________________________"); 
  }
 public void prime(int num)
  {
   int n=num;
   if(n>9)
   {
    int i=1;
    int count=0;
    while(i<=num)
    {
     if(n%i==0)
     {
      count++;
     }
     i++;
    }
    
  if (count==2)
   {
     System.out.println("It is prime number "+num);
   }
  else
   {
    System.out.println("It is not a prime number "+num);
   }
   System.out.println("____________________");
  }
 }
public void revprime(int num)
  { 
   int n=num;
   int count=0;
   int i=1;
   if(n>9)
   {
    int rev=0;
    while(n>0)
     {
      int a=n%10;
      rev=rev*10+a;
      n=n/10;
     }
     System.out.println(num+" Reverse of given number is "+rev);
    System.out.println("____________________");
   }
   
 }
 public void sumprime(int num)
  {
    int n=num;
    int sum=0;
    while(n>0)
     {
      int a=n%10;
      sum=sum+a;
      n=n/10;
     }
     System.out.println("Sum of the number "+sum);
     System.out.println("____________________");
   }   
   
}
