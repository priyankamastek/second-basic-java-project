/**User Story
As a developer, I want to create a Customer class (Blueprint) with basic customer attributes so that customer details can be stored and accessed easily within the application’s memory.
Description. The system should provide a Customer class that represents an individual customer.
Each customer must have the following attributes (state):
id (unique identifier)
name
age
status (e.g., Active/Inactive)


Objects of this class should be created and stored in memory,
enabling the application to manage customer information during runtime.
JRE - Java APIS + JVM(Executor Service) -> Allocate memory for objects is done by JVM
*.java -> One Class defined in it
 **/
// class level - Access specifier - default (not specified anything) or public
// Scope of access specifier for class - to whom the class definition is visible
// attributes - access specifier - default, public, private, protected
// By default your custom class is a child class of java.lang.Object
package org.example.objects;

class Customer extends Object{
  // define the attributes or class-level variables
  long customerId;
  String customerName;
  int age;
  boolean status;

  // Default constructor method are added by compiler when developer does not provides it

  // constructor method - no parameter constructor
  public Customer(){
    customerId = 0;
    customerName = null;
    age = 0;
    status = false;
  }

  // Constructor method with parameters
  public Customer(long id, String name, int age){
   this.customerId = id;
   this.customerName = name;
   // this keyword refers to the current object
   this.age = age; // ambiguity issue on attribute name and parameter name
   this.status = false;
  }

  public Customer(long customerId, String name, int age, boolean status){
    this.customerId = customerId;
    this.customerName = name;
    this.age = age;
    this.status = status;
  }


  // Best Practice for toString()
  @Override
  public String toString() {
    return "Customer Object - " + customerId + " - " + customerName + " - " + age + " - " + status;
  }

  // Business Method - UpdateCustomerProfile
  // name cannot be null or name length cannot be greater than 15 characters
  // System class variables - out (console), err (console), in (inputs)
  public void updateProfile(String newName, int newAge){
    if(newName == null ||  newName.length() > 16) {
      System.err.println("Name is not as per the policy.");
    }
    else if(newAge < 14){
      System.err.println("Age is not as per the policy");
    }
    else{
        this.customerName = newName;
        this.age = newAge;
    }
   }

}
