# TMPS
## Topic: Creational Design Patterns
#### Author: Osmătescu Antonina FAF-192
## Indtroduction:<br>
In software engineering, the creational design patterns are the general solutions that deal with object creation, trying to create objects 
in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. 
Creational design patterns solve this problem by optimizing, hiding or controlling the object creation.
Some examples of this kind of design patterns are:<br>
-Singleton<br>
-Builder<br>
-Prototype<br>
-Object Pooling<br>
-Factory Method<br>
-Abstract Factory
## Implementation:
Were implemented the following creational design patterns: Abstract Factory, Factory Method, Singleton and Builder with the emphasis on the objects of type Furniture: 
Chair, Table, Sofa. Type Furniture contains 3 attributes, get and set methods and toString, which is used for output.
Singleton design pattern was implemented in CyberPunkFurnitureFactory, ModernFurnitureFactory and ArtDecoFurnitureFactory classes.
For that a static attribute was used, for example:<br><br>
private static ArtDecoFurnitureFactory artDecoFurnitureFactory;<br>
private static CyberPunkFurnitureFactory cyberPunkFurnitureFactory;<br>
private static ModerFurnitureFactory moderFurnitureFactory;<br><br>
Then the constructor was declared as private:<br>

private ArtDecoFurnitureFactory () {}<br>
private CyberPunkFurnitureFactory() {}<br>
private ModerFurnitureFactory() {}<br><br>

So that the class could be instantiated only from getInstance() method:<br>

public static ModerFurnitureFactory getModerFurnitureFactory() {<br>
        if (moderFurnitureFactory == null)<br>
            synchronized (ModerFurnitureFactory.class) {<br>
                moderFurnitureFactory = new ModerFurnitureFactory();<br>
            }<br>
        return moderFurnitureFactory;<br>
    }<br><br>
    
The Builder design pattern ensures that a program can create different objects by the same creational process. 
In the laboratory work, the factory is chosen by the style of furniture (Art Deco, Modern, CyberPunk) and then in the coresponding factory is chosen a builder class. The creation methods are implemented in Director class.

The factory methods used in the laboratory work are in Builder package, FurnitureBuilder interface. There are multiple classes which implement the interface (ChairBuilder, SofaBuilder, TableBuilder). Then based on the type parameter it is chosen one of them.

## Results:
The output is represented as following:<br>

![image](https://user-images.githubusercontent.com/71122604/135731748-7b6c6a75-233c-41c2-8d72-6cab86f855b3.png)

