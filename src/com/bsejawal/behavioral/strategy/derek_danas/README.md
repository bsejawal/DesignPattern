# Strategy Design Pattern
Define a family of algorithms, encapsulate each one, and make them interchangeable, The Strategy Pattern lets the algorithm vary indenpendently from clients that use it.

   ### When to Use the Strategy Pattern?
    - When you want to define a class that will have one behavior that is similar to other behaviors in a list.
        - I want the class object to be able to choose from
            - Not flying
            - Fly with Wings
            - Fly Super Fast
    - When you need to use one of several behaviors dynamically
    - Often reduces long lists of conditionals
    - Avoids dupblicate code
    - Keeps class changes from forcing other class changes
    - Can hide complicated / secret code from the user
    - Negative: Increased Number of Objects / Classes 
