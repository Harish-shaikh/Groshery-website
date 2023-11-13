/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author harish shaikh
 */
public class Addproduct {
    private String Name;
    private String Category;
    private String Detail;
    private String Price;
    private String Image;
    
    public Addproduct(String name,String category,String detail,String price,String image){
        Name=name;Category=category;Detail=detail;Price=price;Image=image;
        
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name=name;
    }
    public String getImage(){
        return Image;
    }
    public void setImage(String image){
        Image=image;
    }
    public String getDetail(){
        return Detail;
    }
    public void setDetail(String detail){
        Detail=detail;
    }
    public String getPrice(){
        return Price;
    }
    public void setPrice(String price){
        Price=price;
    }
    public String getCategory(){
        return Category;
    }
    public void setCategory(String category){
        Category=category;
    }
    
            
    
}
