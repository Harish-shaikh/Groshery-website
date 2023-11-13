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
public class ragistars {
    private String Name;
     private String Image;
    private String Mobile;
    public ragistars(){
        
    }
     public ragistars(String name,String image,String mobile){
         Name=name;Image=image;Mobile=mobile;
         
     }
     public String getName(){
         return Name;
     }
     public void SetName(String name){
         Name=name;
     }
     public String getImage(){
         return Image;
     }
     public void SetImage(String image){
         Image=image;
     }
     public String getMobie(){
         return Mobile;
     }
     public void SetMobile(String mobile){
         Mobile=mobile;
     }
     
}
