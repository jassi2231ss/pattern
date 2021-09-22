import java.util.Scanner; 
public class pattern{
public static void main(String[] args){
int a,i,j,n1,n2;
while(true){
    Scanner sc = new Scanner(System.in); 
System.out.println("Enter the Number of rows : "); 
a = sc.nextInt();
    if(a%2!=0){
       n1=a/2;
       n2=a-n1;
       for(i=0;i<=n2;i++)
       {
           for(j=0;j<i;j++)
           {
               System.out.print("* ");
           }
           System.out.println("\n");
       }
       for(i=n1;i>0;i--)
       {
           for(j=0;j<i;j++)
           {
               System.out.print("* ");
           }
           System.out.println("\n");
       }

    }
    else
    System.out.println("Enter odd number ");
}


    }
}

