class Parent {
    Parent() {
        System.out.println("This is Parent class");
    }
}
 
 class Child extends Parent {
    Child() {
        System.out.println("This is Child class");
    }
}

public class ClassCast {
    public static void main(String[] args) {
        Child c1 = new Child();                         //calling parent contructor then child constructor
        Parent p1 = (Parent) c1;                        //only narrowing casting, so nothing will be printed
        
        System.out.println("--------------------");

        Parent p = new Parent();                        //creating object of Parent class, resulting in call of just parent construtor
        Child ch =(Child) p;                            //widening casting will result in ClassCastException
        
    }
}

/*
OUTPUT:
This is Parent class
This is Child class
--------------------
This is Parent class
Exception in thread "main" java.lang.ClassCastException: class Parent cannot be cast to class Child (Parent and Child are in unnamed  unnamed module of loader 'app')
        at ClassCast.main(ClassCast.java:21)


Learings:
1) This exception comes under java.lang .
2) When object of one class type is being converted into another class type, 
   then this error may occur.
3) It can be of two types:
    i) Parent class is casted to type of child class, or
    ii) casting in case of, no relation between the classes i.e., without extending the class.
*/