/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class StoringGuestList {
      private ArrayList<String> GuestCollection = new ArrayList<>();

    public ArrayList<String> getGuestCollection() {
        return GuestCollection;
    }

    public void setGuestCollection(ArrayList<String> collection) {
        this.GuestCollection = collection;
    }
    
    public void addNameToList(String sName){
        GuestCollection.add(sName);
    }
      
      
    public void readCollection2() throws Exception {

        File f = new File("Guests.dat");

        if (f.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(f));) {
                GuestCollection = (ArrayList<String>) ois.readObject();
            } catch (Exception e) {
                System.out.println("Unable to load the collection.");
            }
        }
    }
    
    
    public void storeCollection() throws Exception {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(new File("Guests.dat")));) {
            oos.writeObject(GuestCollection);
        } catch (Exception e) {
            throw new Exception("Unable to save the updates to the collection.");
        }
    }
}
