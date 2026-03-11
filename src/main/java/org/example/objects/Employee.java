package org.example.objects;
// Encapsulation : Mechanism to hide the data from the outside world. Achieve it using private access specifier
public class Employee {
    private  long employeeId; // instance variables  // update a new variable or read of variable
    private String name; // instance variables
    private String project; // instance variables

//    public Employee() {
//        this.employeeId = 0;
//        this.name = null;
//        this.project = null;
//    }

    // wrapper around private properties are created through public methods
    // Wrapper method around properties or attributes called as getter and Setter
     public  long getEmployeeId()
     { return this.employeeId;}


     /*public void setEmployeeId(long employeeId){
         this.employeeId = employeeId;
     }*/


     public void setName(String name){
         if(name != null)
         {
           this.name = name;
         }
     }

    public String getName() {
        return name;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project){
        if(project != null && project.length() < 15) {
            this.project = project;
        }
     }

    public Employee(long employeeId, String name, String project) {
        this.employeeId = employeeId;
        this.name = name;
        this.project = project;
    }

    /**
     * toString() - returns the string representation of object properties
      * @return String
     */
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", project='" + project + '\'' +
                '}';
    }
}

