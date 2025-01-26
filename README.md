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
```

---

## **2. Interview Questions**

### **General Questions**
1. **Can you explain your Pizza Bill Generator project?**
   - Answer with the project description, objectives, and key features.

2. **What OOP concepts have you used in this project?**
   - Encapsulation: Used private fields and provided getters/setters.
   - Inheritance: Potential for extending classes like `Item`.
   - Polymorphism: Overloaded methods (e.g., multiple constructors if required).
   - Abstraction: Abstract common behaviors (if applicable).

3. **What challenges did you face during development?**
   - Handling dynamic inputs.
   - Managing collections like `ArrayList`.
   - Ensuring the bill calculation is accurate.

---

### **Code-Specific Questions**
1. **Why did you use an ArrayList for pizzas and toppings?**
   - `ArrayList` provides dynamic resizing and is efficient for adding/removing items.

2. **How does the `calculateTotal()` method work?**
   - Iterates over all pizzas and toppings, summing up their prices to get the total bill.

3. **Can you explain the `toString()` method in your classes?**
   - It provides a user-friendly string representation for printing pizza and topping details.

4. **How would you handle discounts or tax calculations?**
   - Introduce a new method or class to manage discounts and taxes, ensuring modularity.

---

### **Advanced Questions**
1. **How can you improve the scalability of this project?**
   - Add a GUI using JavaFX or Swing.
   - Save order data to a database.
   - Add JSON/XML support for input/output.

2. **Can you implement file handling for saving the bill?**
   - Use `FileWriter` in Java to save the bill to a `.txt` file.

3. **What is the time complexity of your `calculateTotal()` method?**
   - \(O(n)\), where \(n\) is the total number of pizzas and toppings.

4. **How would you implement real-time updates for orders?**
   - Use multithreading or integrate a live database.

---

### **Behavioral Questions**
1. **How did you manage your time while developing this project?**
2. **What did you learn from this project?**
3. **How do you ensure the code is clean and maintainable?**

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
