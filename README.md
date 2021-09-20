# sofe3650-assign1
## Ontario Tech University 
### SOFE 3650U Software Design and Architecture Activity #1 
Completed for Dr. Ramiro Liscano

_Group 23: Adris Azimi, Abida Choudhury, Daniel Gohara Kamel, Jessica Leishman_

## Assignment Overview
This program uses abstract factories to create products for inventory, and sets the price of the product.  The price of the product is read from a csv file of product names and prices.

Upon construction, each product parses through the `prices.csv` to determine it's appropriate price and name attribute.

The FactoryPatternDriver class is used to test the program. It creates two different factory types, ElectronicsFactory and ClothesFactory.  Each produces two different products with an associated price as outlined in the csv file.

## UML Diagram
![png image of the UML diagram designed in visio (needs updated link)](https://github.com/jessica-leishman/sofe3650-assign1/blob/main/Diagram/UML_Diagram.png)
[Diagrams folder for alternative file formats](https://github.com/jessica-leishman/sofe3650-assign1/tree/main/Diagram)

## Limitations
The product names are case sensistive for the csv, thus to minimize error all capital letters were used.
