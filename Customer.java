import java.util.Scanner;
 class Bank
           {
   private int bal=5000;
   private int pwd;
   private int money;
  public void deposite()
           {
        System.out.println("Enter your password: ");
          Scanner p=new Scanner(System.in);
             pwd=p.nextInt();
           System.out.println("Enter your Deposite Money: ");
          Scanner m=new Scanner(System.in);
             money=m.nextInt();
                
           if(pwd==123)
              {
             bal=bal+money;
              System.out.println("Deposite money is : " +money);
              System.out.println("Total Balance : " +bal);
                  }
           else
               {
                  System.out.println("Incorrect Password..... ");
                   } 
                }
   public void withdraw()
            {
        System.out.println("Enter your password: ");
          Scanner p=new Scanner(System.in);
             pwd=p.nextInt();
   System.out.println("Enter your Withdraw: ");
          Scanner m=new Scanner(System.in);
             money=m.nextInt();
           if(pwd==123)
              {
             bal=bal-money;
              System.out.println("withdraw money is : " +money);
              System.out.println("Total Balance : " +bal);
                }
           else
                     {
                  System.out.println("Incorrect Password..... ");
                      }  
              } 
  public void checked()
             {
        System.out.println("Enter your password: ");
          Scanner p=new Scanner(System.in);
             pwd=p.nextInt();
           if(pwd==123)
                {
              System.out.println("Total Balance : " +bal);
                }
           }
              }
class Customer
                   {
  public static void main(String[] args)
      {
       Bank b=new Bank();
        int ch;
          System.out.println(" 1. Deposite Balance");
           System.out.println(" 2. Withdraw Balance");
           System.out.println(" 3. Checked Balance");
           System.out.println("Enter your Choice: ");
          Scanner c=new Scanner(System.in);
             ch=c.nextInt();
          switch(ch)
           {
          case 1:  b.deposite();
           break;
        case 2:  b.withdraw();
           break;
          case 3:  b.checked();
           break;
           default:   System.out.println("Invalid Choice");
           }
       }
    }
