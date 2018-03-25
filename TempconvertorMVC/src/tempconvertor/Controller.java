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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Hp
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Controller  {
    private View theView;
    private Model theModel;
    public Controller( View theView, Model theModel){
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addCalculationListener(new CalculateListener());
       this.theView.subCalculationListener(new SubCalculate());
        
    }

    class CalculateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            float celicius, harneneite=0;
            try{
                celicius = theView.getFirstNumber();
               
                theModel.toFarheneite(celicius);
                
                
               theView.setCalcSolution(theModel.getCalculationValue());
            }
            catch(NumberFormatException ex){
                    theView.displayErrorMessage("you need to enter a number");
                    }
           
       

    }
    }
    
    class SubCalculate implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            float celicius, harneneite=0;
            try{
                celicius = theView.getFirstNumber();
               
                theModel.toCelicius(harneneite);
                
                
               theView.setCalcSolution(theModel.getCalculationValue());
            }
            catch(NumberFormatException ex){
                    theView.displayErrorMessage("you need to enter a number");
                    }
           
       

    }
    }
}