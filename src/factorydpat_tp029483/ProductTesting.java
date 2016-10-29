/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorydpat_tp029483;

/**
 *
 * @author Aidosmf TP029483
 */
import java.io.IOException;
import java.util.*;

public class ProductTesting {

    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        
        ProductFactory productCategoryFactory = new ProductFactory();
        
        Product theProduct = null;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter number to choose a type: \n '1' for Shirt \n '2' for Sneaker \n '3' for Short");
        
        if(userInput.hasNextLine()){
            
            String categoryOfProduct = userInput.nextLine();
            
            theProduct = productCategoryFactory.makeProduct(categoryOfProduct);
        }
        
        if(theProduct != null){
            doProducStuff(theProduct);
        } else System.out.println("Press one of these numbers (1 / 2 / 3) to choose a type");
    }
    
    public static void doProducStuff(Product theProduct){
        theProduct.resultMessage();
        theProduct.ProductDetails();        
    }
    
}
