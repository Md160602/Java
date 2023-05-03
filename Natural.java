class Natural
{
public static void main(String args[])
  {
    Natural object=new Natural();
    object.number(12);
    object.reverse(12);
    object.sum(12);
    object.even(12);
    object.odd(12);
  }
 public void number(int num)
  { 
   int n=num;
   int i=0;
   while(i<n)
    {
      i++;
      System.out.println("The natural numbers are " +i);
    }
     System.out.println("_______________________________");
   }

 public void reverse(int num)
  {
   int i=num;
   while(i>0)
   { 
     System.out.println("The natural numbers are in reverse order "+i);
     i--;
   }
    System.out.println("________________________");
  }
  public void sum(int num) 
  {
    int n=num;
    int sum=0;
    while(n>0)
    {
      int a=n%10;
      sum=sum+a;
      n=n/10;
    }
    System.out.println("The Sum of the given number " +sum);
    System.out.println("_____________________________________");
  }
  public void even(int num)
  {
    int i=0;
    int n=num;
    int a=0;
    while(i<n)
    { 
     if(i%2==0)
      {
       a=a+2;
       System.out.println("The even numbers are "+a);
      }
     i++;
   
    }
    System.out.println("_____________________________________");   
  }
 public void odd(int num)
  {
    int i=0;
    int n=num;
    int a=1;
    while(i<n)
     {
       if(i%2==1)
        {
         
         System.out.println("The odd numbers are "+a);
         a=a+2;
        }
       i++;
     }
  }
}




















