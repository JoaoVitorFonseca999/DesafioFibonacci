/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;


/**
 *
 * @author 2020.1.08.003
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        BigNum fib[] = new BigNum[1000];

        fib[0] = new BigNum("1");
        fib[1] = new BigNum("1");

        for(int i = 2; i < 480; i++){
            fib[i] = new BigNum("0");
            fib[i] = BigNum.SumBigNumber(fib[i-1], fib[i-2]);
        }

        int x = 0;
        // while(!(fib[x] == null)) {
        //     System.out.println(fib[x].toString() + "  - Digitos: "+ fib[x].GetSize());
        //     x++;
        // }

        //entrada de dados
        BigNum a = new BigNum("0");
        BigNum b = new BigNum("0");
        
        Scanner input = new Scanner(System.in);
    

        do{
            //primeiro
            a = new BigNum(input.next());
            //segundo
            b = new BigNum(input.next());

            // if(BigNum.IsBig(a, b)){
            //     System.out.println("a > b");
            //     break;
            // }
            // else if(BigNum.IsBig(b, a)){
            //     System.out.println("b > a");
            // }
            // else{
            //     System.out.println("a = b");
            
            // }

            if(a.GetSize() == 1 && a.GetDigits()[0] == 0 && b.GetSize() == 1 && b.GetDigits()[0] == 0){
                break;
            }
            int count = 0;
            for(int i = 1; i < 480; i++){
                if(BigNum.IsBig(fib[i], a) && BigNum.IsBig(b, fib[i]) || fib[i].equals(a) || fib[i].equals(b)){
                    count++;
                }
            }
            System.out.println(count);
        } while(true);
    }
    
}
