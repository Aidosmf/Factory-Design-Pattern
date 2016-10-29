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
public abstract class Product {
    // Admin inputs for sell    
    private String productName;
    private double price;
    
    // Factory generates for product    
    private String companyName;
    private String category;
    private String material;
    private String season;
    private String seller;
    private double code;
    

    public String getProductName(){ return productName;}
    public void setProductName(String newProductName) {productName = newProductName; }
    
    public double getPrice(){ return price;}
    public void setPrice(double newPrice) {price = newPrice; }
    
    public String getCompanyName(){ return companyName;}
    public void setCompanyName(String newCompanyName) {companyName = newCompanyName; } 
    
    public String getCategory(){ return category;}
    public void setCategory(String newCategory) {category = newCategory; }
    
    public String getMaterial(){ return material;}
    public void setMaterial(String newMaterial) {material = newMaterial; }
    
    public String getSeason(){ return season;}
    public void setSeason(String newSeason) {season = newSeason; }
    
    public String getSeller(){ return seller;}
    public void setSeller(String newSeller) {seller = newSeller; }
    
    public double getCode(){ return code;}
    public void setCode(double newCode) {code = newCode; }
    
    
    public void resultMessage(){
        System.out.println(getProductName() + " has succesfully published in the system for sell");
    }
    
    public void ProductDetails(){
        System.out.println(getProductName() +"'s detailes:" +  "\n Price - " + getPrice() + "\n Company Name - " + getCompanyName() + "\n Category - " + getCategory() + "\n Material - " + getMaterial()  + "\n Season - " + getSeason() + "\n Seller - " + getSeller() + "\n Code - " + getCode());
    }
    
    
}
