/*  SOFE 3650U Assignment 1
    Course Group 23:
    Adris Azimi, Abida Choudhury, 
    Daniel Gohara Kamel, Jessica Leishman */


public class FactoryPatternDriver {
    public static void main (String[] args){
    // get Electronics Factory
    ElectronicsFactory testElec = new ElectronicsFactory();
    
    // Create productA from Electronics factory
    Product prod1 = testElec.createProductA();
    System.out.print("Product name: " + prod1.getName() + " ");
    System.out.println("Product price: $" + prod1.getPrice());
    
    // Create productB from Electronics factory
    Product prod2 = testElec.createProductB();
    System.out.print("Product name: " + prod2.getName() + " ");
    System.out.println("Product price: $" + prod2.getPrice());

    //get Clothes Factory
    ClothesFactory testClothes = new ClothesFactory();

        // Create productA from clothes factory
        Product prod3 = testClothes.createProductA();
        System.out.print("Product name: " + prod3.getName() + " ");
        System.out.println("Product price: $" + prod3.getPrice());
        
        // Create productB from clothes factory
        Product prod4 = testClothes.createProductB();
        System.out.print("Product name: " + prod4.getName() + " ");
        System.out.println("Product price: $" + prod4.getPrice());
    }
}
