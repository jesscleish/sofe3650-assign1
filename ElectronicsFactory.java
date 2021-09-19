/*  SOFE 3650U Assignment 1
    Course Group 23:
    Adris Azimi, Abida Choudhury, 
    Daniel Gohara Kamel, Jessica Leishman */

public class ElectronicsFactory extends ProductFactory {
    public Phone createProductA(){ // creates phone

        return new Phone();
    }

    public Tablet createProductB(){ // creates tablet

        return new Tablet();
    }
}
