/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author 2020.1.08.003
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        BigNum fib[] = new BigNum[300];

        fib[0] = new BigNum("1");
        fib[1] = new BigNum("1");

        for(int i = 2; i < 100; i++){
            fib[i] = new BigNum("0");
            fib[i] = BigNum.SumBigNumber(fib[i-1], fib[i-2]);
        }

        
        for(int i = 0; i < 300; i++){
            System.out.println(fib[i].toString());
        }









    }
    
}
