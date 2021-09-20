# sofe3650-assign1
## Ontario Tech University 
### SOFE 3650U Software Design and Architecture Activity #1 
Completed for Dr. Ramiro Liscano

_Group 23: Adris Azimi, Abida Choudhury, Daniel Gohara Kamel, Jessica Leishman_
# Table of Contents
- [## Important Notes and Running Instructions](https://github.com/jessica-leishman/sofe3650-assign1#important-notes-and-running-instructions-1)
- ## Assignment Outline and Planning
    - [Assignment Overview](https://github.com/jessica-leishman/sofe3650-assign1#assignment-overview)
    - [Diagrams Folder](https://github.com/jessica-leishman/sofe3650-assign1/tree/main/Diagram)
    - [FactoryPatternDriver Results/Output Screenshot (png)](https://github.com/jessica-leishman/sofe3650-assign1/blob/main/TestDriverOutput.png)
    - [Limitations](https://github.com/jessica-leishman/sofe3650-assign1#limitations)

- [## Code](https://github.com/jessica-leishman/sofe3650-assign1/tree/main/Code)
    - ### Factories
        - [Abstract factory class ProductFactory.java](https://github.com/jessica-leishman/sofe3650-assign1/blob/main/Code/ProductFactory.java)
        - [ElectronicsFactory.java](https://github.com/jessica-leishman/sofe3650-assign1/blob/main/Code/ElectronicsFactory.java)
        - [ClothesFactory.java](https://github.com/jessica-leishman/sofe3650-assign1/blob/main/Code/ClothesFactory.java)
    - ### Products
        - [Interface class Product.java](https://github.com/jessica-leishman/sofe3650-assign1/blob/main/Code/Product.java)
        - [Phone.java](https://github.com/jessica-leishman/sofe3650-assign1/blob/main/Code/Phone.java)
        - [Tablet.java](https://github.com/jessica-leishman/sofe3650-assign1/blob/main/Code/Tablet.java)
        - [Shirt.java](https://github.com/jessica-leishman/sofe3650-assign1/blob/main/Code/Shirt.java)
        - [Pants.java](https://github.com/jessica-leishman/sofe3650-assign1/blob/main/Code/Pants.java)

# Important Notes and Running Instructions
In order to utilize the TestDriver driver program, it must be placed in the code folder with alongside the source code and prices.csv. This program must be run from the same folder.
# Assignment Overview
This program uses abstract factories to create products for inventory, and sets the price of the product.  The price of the product is read from a csv file of product names and prices.

Upon construction, each product parses through the `prices.csv` to determine it's appropriate price and name attribute.

The FactoryPatternDriver class is used to test the program. It creates two different factory types, ElectronicsFactory and ClothesFactory.  Each produces two different products with an associated price as outlined in the csv file.

## UML Diagram
![png image of the UML diagram designed in visio](https://github.com/jessica-leishman/sofe3650-assign1/blob/main/Diagram/UML_Diagram.png)
[Diagrams folder for alternative file formats](https://github.com/jessica-leishman/sofe3650-assign1/tree/main/Diagram)

## Output Screenshot
![png screencap of the project output](https://github.com/jessica-leishman/sofe3650-assign1/blob/main/TestDriverOutput.png)

## Limitations
The product names are case sensistive for the csv, thus to minimize error all capital letters were used.
