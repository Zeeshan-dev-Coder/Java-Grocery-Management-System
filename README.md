# 🛒 Grocery Management System (Java)

This project is a simple *Grocery Management System* implemented in Java.  
It demonstrates key *Object-Oriented Programming (OOP)* concepts such as *classes, inheritance, polymorphism, encapsulation, and abstraction*.

---

## 📂 Project Structure

src/ └── com/upgrade/gcm/ ├── Main.java                # Entry point of the program ├── models/                  # Data Models (Products) │   ├── GroceryItem.java │   ├── Fruit.java │   ├── Vegetable.java │   └── DairyProduct.java ├── services/                # Service Layer │   ├── InventoryService.java │   └── InventoryServiceImpl.java └── utils/                   # Utilities └── DataLoad.java

---

## ✨ Features
- Add and manage grocery items (Fruits, Vegetables, Dairy Products, etc.)
- Demonstrates *Encapsulation* using private fields and getters/setters.
- Implements *Inheritance* (e.g., Fruit, Vegetable, and DairyProduct extend GroceryItem).
- Uses *Polymorphism* to handle different product types uniformly.
- Service layer (InventoryService) and implementation (InventoryServiceImpl) for clean separation of logic.
- Utility class (DataLoad) to preload sample data.

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/java-grocery-management-system.git

2. Navigate to project folder:

cd java-grocery-management-system/src


3. Compile the code:

javac com/upgrade/gcm/Main.java


4. Run the program:

java com.upgrade.gcm.Main




---

📖 OOP Concepts Used

Encapsulation → Private fields with getters & setters.

Inheritance → Specific product types (Fruit, Vegetable, DairyProduct) extend GroceryItem.

Polymorphism → Overridden methods allow handling multiple product types.

Abstraction → Service layer (InventoryService) defines behavior, implemented by InventoryServiceImpl.



---

🔮 Future Improvements

Add a user-friendly menu system for CRUD operations.

Support for persistent storage (e.g., database or file I/O).

Advanced search & filter functionality.


👨‍💻 Created By Mohd Zeeshan

