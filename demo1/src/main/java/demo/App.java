package demo;

/**
 * Hello world!
 *
 */
public class App 
{

    public Integer fibonacci(int num){
        //fib(0) = 0 return 0
        if(num ==0){
            return 0;
        }
        //fib(1) = 1 return 1
        else if(num == 1){
            return 1;
        }
        else{
            // fib(n) = fib(n-1)+fib(n-2)
            return  fibonacci(num-1) + fibonacci(num-2);
        }
        
        
        
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
