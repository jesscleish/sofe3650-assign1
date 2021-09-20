/*  SOFE 3650U Assignment 1
    Course Group 23:
    Adris Azimi, Abida Choudhury, 
    Daniel Gohara Kamel, Jessica Leishman */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Tablet implements Product {
    private double price; // creates class attribute
    private String productName; // creates product name attribute

    public Tablet(){

        int tabletIndex;
        ArrayList<String> pricesArray = new ArrayList<String>(); // Arraylist to hold prices
        
        try{
            File pricesFile = new File("prices.csv");
            Scanner pricesReader = new Scanner(pricesFile).useDelimiter(",|\\R");
           
            while (pricesReader.hasNext()) { // uses prices reader to parse each comma separated value into ArrayList
                pricesArray.add(pricesReader.next());
            }

            pricesReader.close();
        }catch (FileNotFoundException e){
            System.out.println("File was not found.");
            e.printStackTrace();
        }
        
        // Search ArrayList for product name to identify position of price
        tabletIndex = pricesArray.indexOf("TABLET");
        productName = pricesArray.get(tabletIndex);

        tabletIndex++;
        // Assign price to object based on price array location, parsing from string to double to preserve formatting
        price = Double.parseDouble(pricesArray.get(tabletIndex));
    }
  
       
    public double getPrice(){ // gets the price of the tablet
        return this.price;
    }

    public String getName(){
        return this.productName;
    }
}
