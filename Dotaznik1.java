/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dotaznik1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Student
 */
public class Dotaznik1 {

    /**
     * @param args the command line arguments
     */
    
    //funkce na zad�v�n� �daj� o osob�ch
    public static byte [] zadejUdaje (byte [] aPole) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nov� z�znam:");
        
        System.out.println("Pohlav� (M/�)?");
        pom = sc.NextLine();
        
        
        while (true) {
        
            
            System.out.println("P�eje� si pokra�ovat v zad�v�n� (A/N)?");
            
            if
        }
        
        
        return aPole;
    }
    
    public static byte[] nactiObjekt () throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("storage.dat");
            ObjectInputStream iis = new ObjectInputStream(fis);
            byte[] newAPole = (byte[]) iis.readObject();
            return newAPole;
    }
    
    public static void zapisObjekt (byte[] aPole) throws FileNotFoundException, IOException {
        FileOutputStream fos = new FileOutputStream("storage.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(aPole);///
    }        
    
    public static void main(String[] args) {
        //Vytvoreni promennych a pole 1000 osob MIRKA (pole bytu, po 8 bitu)
        byte [] aPole = new byte [1000];
        
        //Naplneni - pohlavi,prijem,stav, mesiac narodenia DAVID
        
        //vypis -MIRKA
        
        //serializace a deserializace - David
        //prov�st na�ten� u� na za��tku (v�. obalen� try + catch)?
        try {
         zapisObjekt(aPole); 
         //prov�st deserializaci + na�ten� a n�jak vytisknout?
            

        } catch (Exception e) {

        }
    }
    
    public static void identifikace () {
    
    
    } 
    
    
    public static void vypis (byte[] aPole) { 
        

    System.out.println("pohlavi: ");
    System.out.println("prijem: ");
    System.out.println("mesic narozeni: ");
    System.out.println("stav: ");


}
}
