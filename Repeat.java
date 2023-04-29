class Repeat
////This is an simple whils class program.
{
 public static void main(String args[])
  {
    Repeat object=new Repeat();
    object.message();
    object.alter();
    object.value();
    object.div();
    object.sub();
  }
//This is an method to print same req in five times.
 public void message()
   {
     int count=5;
     int i=0;    
     while(i<5)
      {
       System.out.println("Hai");
       i++;
      }
    System.out.println("_________________________");
   }
//This method is print huns in 10 times with using decrement.
  public void alter()
        { 
          int count=10;
          int i=10;
          int num=100;
          while(i>0)
           {
            System.out.println(num);
            i--;
           }
           System.out.println("_________________________");
        }
//THis method is print 1 to 10 numbers.
  public void value()
   {
    int i=0;
    int count=10;
    int num=1;
    while(i<10)
     {
        System.out.println(num);
        num+=1;
        i++;
     }
     System.out.println("_________________________");
   }
//This method is used to print even to 10 .
   public void div()
    {
      int i=0;
      int count=5;
      int num=2;
      while(i<5)
      {
        System.out.println(num);
        num=num+2;
        i++;
      }
       System.out.println("_________________________");
    }
//THhis method is print reverse even number.
     public void sub()
  { 
    int i=5;
    int count=5;
    int num=10;
    while(i>0)
     {
       System.out.println(num);
       num-=2;
       i--;
     }
    System.out.println("_________________________");
  }
}


