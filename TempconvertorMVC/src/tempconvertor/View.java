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
import java.awt.event.ActionListener;
import javax.swing.*;


  


public class View extends JFrame {
    private JTextField input = new JTextField(10);
    
   
    private JLabel calcSolution = new JLabel("");
    private JButton calculateButton = new JButton("celicius to  farhaneite");
      private JButton calculatecelicius = new JButton("harhaneite to  celicius");
  
     
  public  View(){
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);
        calcPanel.add(input);
        
        
         
       
       calcPanel.add(calculatecelicius);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);
       
        this.add(calcPanel);
        
        
       
    }
    public int getFirstNumber(){
        return Integer.parseInt(input.getText());
        
    }
   
    public int getCalcSolution(){
        return Integer.parseInt(calcSolution.getText());
        
    }
    public void setCalcSolution(double solution){
        calcSolution.setText(Double.toString(solution));
        
    }
    void addCalculationListener(ActionListener listenerForCalcButton){
        calculateButton.addActionListener(listenerForCalcButton);
    
}
     void subCalculationListener(ActionListener listenerForCalcButton){
        calculatecelicius.addActionListener(listenerForCalcButton);
    
}
     
    
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }

   
}
