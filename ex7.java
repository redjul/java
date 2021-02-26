

public class ex7{
    public static int longueurSuiteSyracuse(long n){
        int rep=1;
        while(n!=1){
            if(n%2==0){n=n/2;}else{n=3*n+1;}
            rep++;
        }
        return rep;
    }
    
   public static void main (String args){
    long nb= 5;
    long lg=1;
    long i =5;
    long max = 15000000;
    do{
        int l = longueurSuiteSyracuse(i);
    if(l>lg){lg=l;nb=i;}
    i++;   //pair   
    }while(i<max);
    System.out.println(lg+" pour nb ="+nb);
}
}
