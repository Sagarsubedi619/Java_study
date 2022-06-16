package recursion;

public class Factorial {

    public int FactorialUsingRecursion(int n){
        if(n==0){
            return 1;
        }
        return n*FactorialUsingRecursion(n-1);
    }
    public int FactorialUsingIteration(int n){
        int result=1;
       for(int i=1;i<=n;i++){
           result*=i;
       }
       return result;
    }
}


