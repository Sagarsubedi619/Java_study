package recursion;

public class recursionMain {
    public static void main(String[] args) {
        Factorial demo1=new Factorial();
        TowerOfHanoi demo2=new TowerOfHanoi();

        //System.out.println(demo1.FactorialUsingRecursion(5));
        //System.out.println(demo1.FactorialUsingIteration(5));
        demo2.SolveTOH(2,"A","C","B");
    }
}
