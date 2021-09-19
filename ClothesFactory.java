/*  SOFE 3650U Assignment 1
    Course Group 23:
    Adris Azimi, Abida Choudhury, 
    Daniel Gohara Kamel, Jessica Leishman */

public class ClothesFactory extends ProductFactory {
    public Product createProductA(){ // creates shirt (KEYWORD: SHIRT -> for using on textfile to get item price)
        //need to have it set the price
        return new Shirt();
    }

    public Product createProductB(){ // creates pants (KEYWORD: PANTS)
        //need to have it set the price
        return new Pants();
    }

    public void setPrice(){ // sets the price of the product using keyword to find corresponding price in text file

    }
}
