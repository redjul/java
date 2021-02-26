import javax.swing.*;

public class ex2
{   public static void main (String args[]){
     int a=1;
     int ant=1;
     int fib=0;
     int add=0;
     while(a<400000){
        fib=ant+a;
        if(fib%2==1){
            add=add+fib; 
        }
        a=fib+ant;
        if(a%2==1){
                add=add+fib;
        }
        ant=a+fib;
        if(ant%2==1){
                add=add+ant;
        }
       }
     System.out.println(add+"somme des termes entiers");
    }
}
