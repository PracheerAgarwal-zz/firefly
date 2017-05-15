package DP;

public class Fibo {
    public static void main(String [] args){
        Fibo obj = new Fibo();
        System.out.println(obj.fibo_recursion(2));
        System.out.println(obj.fibo_mem(10));
    }

    public int fibo_recursion(int n) {
        if(n == 1 || n == 0)
            return 1;

        else
            return fibo_recursion(n -1) + fibo_recursion(n-2);
    }

    public int fibo_mem(int n) {
        int fib[] = new int[n+1];
        fib[0] = 1;
        fib[1] = 1;

        for(int i=2;i<fib.length;i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}
