/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorydpat_tp029483;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Aidosmf TP029483
 */
public class ProductFactory {
    public Product makeProduct(String newProductType) throws IOException{
        
        Product newProduct = null;
        
        if(newProductType.equals("1")){
            return new ShirtProduct();
            
        } else 
            
        if(newProductType.equals("2")){
            
            return new SneakerProduct();
            
        } else 
            
        if(newProductType.equals("3")){
            
            return new ShortProduct();
            
        } else return null;
    }
}
