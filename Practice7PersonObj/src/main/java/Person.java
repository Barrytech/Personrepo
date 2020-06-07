/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
import java.io.*;
public class Person {
    private String lastName;
    private String firstName;
    private int age;
    
            //let's write the constructor method
    public Person(String last, String first, int a){
        lastName = last;
        firstName = first;
        age  = a;
    }
    
    //let's write the display() method;
    
    public void displayPerson(){
        System.out.println("Last Name is: " + lastName + ", First Name is: " + firstName + ", Age is: " + age);
    }
    
    //let's write the getLast name method()
    public String getLast(){
        return lastName;
    }
    
    
       
}       //closes Person class



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//let's write another class for the data
class ClassDataArray{
    private Person[] a;
    private int nElems;
    
    //constructor
    public ClassDataArray(int max){
        a = new Person[max];
        nElems = 0;
    }
    
    //let's write the search and find() method
    public Person find(String searchName){
        int j;
        for(j = 0; j < nElems; j++){
            if(a[j].getLast().equals(searchName)){
                break;
            }
        if( j == nElems){
            return null;
        }
        else{
            return a[j];
        }
        }
        return null;
    }       //end find()
    
    //let's write the insert method()
    public void insert(String last, String first, int age){
        a[nElems] = new Person(last, first, age);
        nElems++;     
    }       //end insert()
    
    //let's write the delete method()
    public boolean delete(String searchName){
        int i;
        for(i = 0; i < nElems; i++){
            if (a[i].getLast().equals(searchName)){
                break;
            }
        if(i == nElems){
            return false;
        }
        else{
            for(int j=i; j<nElems; j++){
                a[j] = a[j+1];
                nElems--;
                return true;
            }
        }
        }
        return false;       
    }       //end delete method()   
    
    //let's write the display() method() after deleting
    public void displayarr(){
        System.out.println(" Here are the people objects in your array");
        for(int i = 0; i<nElems; i++){
            a[i].displayPerson();
        }       
        
    }   //end display method()
    
}       //end classDataArray



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//let's write the 