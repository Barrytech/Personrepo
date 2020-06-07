/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class ClassDataApp {
    public static void main (String[] args){
        int maxSize = 100;
        ClassDataArray arr;
        arr = new ClassDataArray(maxSize);
        
        arr.insert("Evans", "West", 24);
        arr.insert("Smith", "Lorraine", 19);
        arr.insert("Yee", "Tom", 22);
        arr.insert("Adams", "Grace", 19);
        arr.insert("Murphy", "Grace", 20);
        arr.insert("Barry", "Abdoul", 19);
        arr.insert("Campo", "Ian", 28);
        arr.insert("Cook", "Tim", 51);
        arr.insert("Li", "Jet", 53);
        arr.insert("Siluwa", "Timothy", 31);
        
        arr.displayarr();
        
        //lets search someone
        String searchkey = "Murphy";
        Person found;
        found = arr.find(searchkey);
        if(found != null){
            System.out.println(" found ");
            found.displayPerson();
        }
        else{
            System.out.println(" Can't find " + searchkey);
        }
        
        System.out.println(" Deleting Smith, Li, Yee");
        arr.delete("Smith");
        arr.delete("Li");
        arr.delete("Yee");
        
        arr.displayarr();
        
         
    }
}
