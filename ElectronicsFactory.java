/*  SOFE 3650U Assignment 1
    Course Group 23:
    Adris Azimi, Abida Choudhury, 
    Daniel Gohara Kamel, Jessica Leishman */

public class ElectronicsFactory extends ProductFactory {
    public Product createProductA(){ // creates phone (KEYWORD: PHONE -> for using on textfile to get item price)
        //need to have it set the price
        return new Phone();
    }

    public Product createProductB(){ // creates tablet (KEYWORD: TABLE)
        //constructor to create table#
        //need to have it set the price
        return new Tablet();
    }

    public void setPrice(){ // sets the price of the product using keyword to find corresponding price in text file

    }
}
