package chapter21.pr2;


public class GetFibonacci implements Runnable{
    private int n;
    private char s;
    GetFibonacci(int n,char s){
        this.n = n;
        this.s = s;
    }

    public void run() {
        Fibonacci f = new Fibonacci();
        for (int i = 0; i < n; i++){
            System.out.println(s+":"+f.next());
        }
    }
}

class Mai{
    public static void main(String[] args) {
        char s;
        for (int i = 5; i < 10; i++){
            s = (char)('a'+ i);
            new Thread(new GetFibonacci(i,s)).start();
        }

    }
}

