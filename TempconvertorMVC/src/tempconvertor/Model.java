/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tempconvertor;

/**
 *
 * @author Hp
 */
public class Model {
     private double calculationValue;
    
    public void toFarheneite(float celicius){
        calculationValue =(1.8*celicius)+32 ;
    }
    public void toCelicius(float farheneite){
        calculationValue= 5/9*(farheneite-32);
    }
    public double getCalculationValue(){
        return calculationValue;
    }
    public void subTwoNumbers(int firstNumber,int secondNumber){
        calculationValue =firstNumber - secondNumber;
    }
    
}
