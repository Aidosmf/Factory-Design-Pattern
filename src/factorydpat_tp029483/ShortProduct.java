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
public class ShortProduct extends Product{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public ShortProduct() throws IOException{ //    constructor 
        System.out.println("Enter product name: ");
        String name = reader.readLine();
        System.out.println("Enter product price: ");
        double price = Double.parseDouble(reader.readLine());
        setProductName(name);
        setPrice(price);
        setCompanyName("PUMA");
        setCategory("Clothing");
        setMaterial("Spandex");
        setSeason("Spring Wear");
        setSeller("Lazada.com");
        setCode(Math.random() * 500);
    }
}
