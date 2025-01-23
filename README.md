Here’s a **short flow** of how data moves through the layers in the **Employee Management System** project:

---

### **1. Add Employee (Create Operation)**

1. **Controller Layer**:  
   - The user sends a request to add an employee.
   - `EmployeeController` receives the request and calls the **Service Layer** to process it.

2. **Service Layer**:  
   - `EmployeeService` receives the request from the controller.
   - It calls the **DAO Layer** to add the employee to the database.

3. **DAO Layer**:  
   - `EmployeeDAO` executes the SQL query to insert the employee's data into the database.

4. **Database**:  
   - The database stores the employee data.

---

### **2. Get All Employees (Read Operation)**

1. **Controller Layer**:  
   - The user requests to see all employees.
   - `EmployeeController` calls the **Service Layer** to fetch the data.

2. **Service Layer**:  
   - `EmployeeService` calls the **DAO Layer** to retrieve all employee data.

3. **DAO Layer**:  
   - `EmployeeDAO` executes a query to fetch all employees from the database and returns the list of employees.

4. **Controller Layer**:  
   - `EmployeeController` receives the employee data from the DAO Layer and sends it to the **Presentation Layer** (could be the console or a web page).

---

### **Flow Summary**:

- **Add Employee**:  
  `EmployeeController` → `EmployeeService` → `EmployeeDAO` → **Database**.

- **Get All Employees**:  
  `EmployeeController` → `EmployeeService` → `EmployeeDAO` → **Database** → `EmployeeController` → **Presentation Layer**.

---

This flow shows how data moves from the presentation layer to the database and back. The controller acts as the mediator, and the service layer contains the business logic, while the DAO layer directly interacts with the database.
