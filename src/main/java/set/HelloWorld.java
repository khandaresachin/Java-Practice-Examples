package batch2;

public class HelloWorld {

    public static void main(String args[]){

        System.out.println("Hello World ! This is first java program");

        // Creating objects in java
        NoModifier noModifier; // just a declaration of the object, with this java won't be
                            // allocating the memory to the object
        noModifier = new NoModifier();

        NoModifier noModifier1 = new NoModifier();  // with new keyword java allocate the memory to
                    // the object and also called the constructor of the class.
    }
}


/*

    Packages:
        Package in java is a mechanism to encapsulate group of  classes, sub-packages and interfaces.
        Packages are used for :
            - Preventing naming conflicts:
                for example in batch2 package we can't create another HelloWorld class. But we can create
                it in some other packages.
            - Provides controlled access: protected and default have package level access control.
            - Packages can  be considered as data encapsulation (or data-hiding).
            - All we need to do is put related classes into packages. After that, we can simply write
            an import class statement from existing packages and use it in a program.

            A package is a container of group of a related classes where some of the classes are
            accessible are exposed and others are kept for internal purpose.


            Two type of packages:
                - User defined packages
                - In Build Packages

        User defined package:
            These are packages that are defined by the user/developer.
            Example:
                package myPackage;
                class A{

                }
            We should always create packages with lower case and give the meaningful names.

       In Build Package:
            These packages consist of a large number of classes which are part of Java API.
            Some of the commonly used packages are:
                1. java.lang:
                    the default package from in build packages.
                    Contains language support classes. (for example classes which defined primitive
                    data types and mathe operations)
               2. java.io:
                    This consist of classes related to input and output.
               3. java.util:
                    Contains utility classes which implements data structures and collections also
                    Date time API
               4. java.net:
                    Contains the classes related to networking.
               5. java.awt:
                    Contains classes related to graphical user interface like buttons, labels, menus
                    etc.
               6. java.applet:
                    Contains the classes for creating applets.


    Note: To use any of the in build packages in program we need use - import class statement so that
    it will be clear to programmer as well as while compilation there won't be any error because
    we are already declare the import statement to convey from where we are using the class.


    Class :
        is the blueprint which are create to encapsulate the data members and member functions.
        Its encapsulation example which combines the data members and member functions into a one.

        Syntax:
            <access-specifiers> class <name-of-class>{
                    // data-members

                    // member-functions
            }

       example:
           public class HelloWorld{

                int number;

                public void display(){
                    // body of function
                }
           }

    Access Specifiers/Modifiers:
        We can use the modifiers with class, data members and member functions.
        We don't need to use (:) after modifiers as we did in C++.

        - public
        - private
        - protected
        - default(no mention to declare explicitly)



                Default         private         protected       public

same class          yes             yes              yes           yes

same package        yes             No               yes           yes

different-package    No             No               yes           yes
subclass

different-package    No             No               No            yes
none- subclass


*****************************************************************************

    Understanding the main method in Java

    public static void main(String args[]){

    }

    public:  access modifier, which denotes the method is accessible with use of public.
            Method is accessible to execute by compiler.
    static: The members which are declared as static are class level members. Nothing but those
            members are common for all objects .
            - static are visible or accessible before creating the object of class.

    void:  It returns nothing from the method.

    main: the keyword which denotes the main method. its reserved keyword.
    String args[]: The parameters/arguments for the main method. Which are declared to provide the
            commandline arguments in java.



 */