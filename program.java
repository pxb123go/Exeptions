import java.util.Scanner;

class program{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter  two numbers:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("The division of a and b is " + c);
        }
        catch(ArithmeticException e){
            System.out.println("The error is " + e.toString());
        }
        finally{
            System.out.println("Program has ended.");
        }
    }
}