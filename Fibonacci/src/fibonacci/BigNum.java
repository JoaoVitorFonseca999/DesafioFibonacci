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
public class BigNum {

    int digits[] = new int[100];
    int size;
    //constructor
    public BigNum(String stringNumber){
        size = stringNumber.length();
        for(int i = 0; i < size; i++){
            digits[i] = stringNumber.charAt(size - i - 1) - '0';
        }
    }

    public String toString(){
        String s = "";
        for(int i = size - 1; i >= 0; i--){
            s += digits[i];
        }
        return s;
    }

    public int GetSize(){
        return size;
    }
    //return the vetor of digits
    public int[] GetDigits(){
        return digits;
    }
    
    public void SetSize(int x){
        size = x;
    }
    public void SetDitits(int x, int y){
        digits[x] = y;
    }

    //function to sum two big numbers
    public static BigNum SumBigNumber(BigNum a, BigNum b){
        BigNum c = new BigNum("0");
        int carry = 0;
        int i = 0;
        int sum = 0;
        while(i < a.GetSize() || i < b.GetSize()){
            sum = a.GetDigits()[i] + b.GetDigits()[i] + carry;
            c.SetDitits(i, sum % 10);
            carry = sum / 10;
            i++;
        }
        if(carry != 0){
            c.SetDitits(i, carry);
            c.SetSize(i + 1);
        }
        else{
            c.SetSize(i);
        }
        return c;
    }

    //equals function
    public boolean equals(BigNum a){
        if(a.GetSize() != this.GetSize()){
            return false;
        }
        else{
            for(int i = 0; i < a.GetSize(); i++){
                if(a.GetDigits()[i] != this.GetDigits()[i]){
                    return false;
                }
            }
        }
        return true;
    }

    //Is Big
    public static boolean IsBig(BigNum a, BigNum b){
        if(a.GetSize() > b.GetSize()){
            return true;
        }
        else if(a.GetSize() < b.GetSize()){
            return false;
        }
        else{
            for(int i = a.GetSize() - 1; i >= 0; i--){
                if(a.GetDigits()[i] > b.GetDigits()[i]){
                    return true;
                }
                else if(a.GetDigits()[i] < b.GetDigits()[i]){
                    return false;
                }
            }
        }
        return false;
    }


}
