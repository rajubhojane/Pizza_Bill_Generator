## **1. Documentation**

### **Project Overview**
**Title**: Pizza Bill Generator  
**Description**: A Java-based mini-project using Object-Oriented Programming (OOP) concepts to create an application that generates a bill for pizza orders.  

### **Features**
- Dynamic order management for pizzas and toppings.
- Automated bill generation.
- Easy-to-use console-based interface.

### **Objectives**
- Demonstrate the use of OOP principles: Encapsulation, Inheritance, Polymorphism, and Abstraction.
- Enhance understanding of Java programming in a real-world application.

---

### **System Design**

#### **UML Class Diagram**
**Classes**:  
1. `Pizza`: Represents a pizza with attributes like type, size, and base price.  
2. `Topping`: Represents a topping with attributes like name and price.  
3. `Order`: Manages the list of pizzas and toppings, and calculates the total bill.  
4. `PizzaBillGenerator`: The entry point for user interaction.

```plaintext
Pizza                          Topping
+------------------+            +------------------+
| - type: String   |            | - name: String   |
| - size: String   |            | - price: double  |
| - basePrice: double |         +------------------+
+------------------+            | + getPrice()     |
| + getType()      |            | + toString()     |
| + getSize()      |            +------------------+
| + getBasePrice() |
| + toString()     |
+------------------+

                        Order
                +---------------------+
                | - pizzas: List<Pizza> |
                | - toppings: List<Topping> |
                +---------------------+
                | + addPizza()        |
                | + addTopping()      |
                | + calculateTotal()  |
                | + toString()        |
                +---------------------+

               PizzaBillGenerator (Main)
                +---------------------+
                | + main()            |
                +---------------------+
```

---

### **Code Flow**
1. User is prompted to input the number of pizzas and their details.
2. User adds optional toppings.
3. The program calculates the total bill.
4. The bill is displayed to the user.

---

### **Technologies Used**
- **Programming Language**: Java
- **Tools**: Eclipse IDE or IntelliJ IDEA
- **Concepts**: OOP (Encapsulation, Inheritance, Polymorphism, Abstraction)

---

### **Sample Bill Output**
```plaintext
----- Pizza Bill -----
Veg Pizza (Medium) - ₹200.0
Non-Veg Pizza (Large) - ₹350.0
Cheese - ₹50.0
Olives - ₹40.0
----------------------
Total: ₹640.0

---

### **Possible Enhancements**
- Add **combo offers** or **preset pizza orders**.
- Implement **database integration** to store pizza and topping data.
- Build a **Graphical User Interface (GUI)**.
- Introduce **user authentication** for tracking orders.

---

## **3. Project Files and Structure**
```
D:/Placement Projects/Pizza_Bill_Generator/
│
├── src/
│   ├── com/
│       └── pizza/
│           ├── Pizza.java
│           ├── Topping.java
│           ├── Order.java
│           └── PizzaBillGenerator.java
│
├── docs/
│   ├── ProjectOverview.txt
│   ├── UMLDiagram.png
│   ├── SampleOutput.txt
│   └── InterviewQuestions.txt
│
└── README.md
