Java is an Object Oriented programming language.

Every thing in Java Code will be the OBJECTS

Objects - Real world
 - State - describe the object , properties 
 - Behavior - action 

Car is Object 
 State - car model, car make, car color, car type, gears, seat type, engine
 Behavior - applygears, start, stop, reverse

Objects - Software Applications

Ecommerce Object 
  Product, Customer, Order, Payment 
Product object 
  State (attributes) - productid, productname, description, price, instock, category
  Behavior - searchProduct, FilterProduct, AddingProduct

Domain - Ecommerce, Finance, Banking, Manfacturing

Objects are pillar for Object Oriented programming
How are Objects created in memory by runtime?
 - Objects are based on blueprint 
 - Blueprints are defined as Class in OOP

Class (Blueprint) ---> JRE ---> Objects in the memory

Class (Blueprint)
  - attributes (State)
    -    x
      -  y
  - methods (behavior)
     startX()
  -  startY()
  -  calculateCordinates()

5 Pillars of OOPS
class
object (s) - runtime instances of a class, references
Encapsulation
Inheritance
Polymorphism

Parent Class in Java API - Object


Access specifier -define the visibility of the class or method or attributes
1. default - package level visibility. within the same package a class is visible to the other classes
2. public
3. private
4. protected

class-level - default or public
To create runtime instances or object - new keyword 

() -> means call to a function (java functions reside class, hence called as methods)
new Customer();

Second access level specifier
1. static
2. final - You cannot make the class PARENT class. You can extends from final class
3. abstract

Object class methods
1. equals() and hashCode()
2. toString()

Constructor method
 - special methods 
 - They have same name as Class name
 - They are called automatically by JVM during object creation
 -   = new <class-name>() () calls the construction method
 - no return type
 - public constructor method / private constructor method
 - Overloading.. 

Overriding - creating new implementation for existing methods
toString(), equals(), hashCode() 
Overriding can be done by child classes


Overloading - can be done within the same class only.
Same method name, only number of arguments and types of arguments passed to the methods
It can be done on method return types.

public int  add(int a, int b){  return a + b}
public int add(int a, int b, int c){  return a + b + c}
public int add (int a, float b) { ....}
public void  add(int a, int b){  return a + b}


