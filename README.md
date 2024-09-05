### What is Java and why is it platform-independent?
Java is a high-level, object-oriented programming language that is designed to be platform-independent, 
meaning that Java code can run on any device that has the Java Virtual Machine (JVM). 
It achieves this by compiling Java code into bytecode, which can be interpreted by the JVM on any platform, 
making Java applications portable.

### What are the main principles of Object-Oriented Programming (OOP)?
The four main principles of OOP are:
- **Encapsulation**: Wrapping the data (variables) and code (methods) together as a single unit.
- **Inheritance**: Mechanism where a new class is derived from an existing class.
- **Polymorphism**: Ability of a variable, function, or object to take on multiple forms.
- **Abstraction**: Hiding the complex implementation details and showing only the necessary features of an object.

### Explain the difference between JDK, JRE, and JVM.
- **JDK (Java Development Kit)**: A full-featured software development kit for Java that includes JRE, compilers, and tools like JavaDoc and Java Debugger.
- **JRE (Java Runtime Environment)**: Provides libraries, JVM, and other components to run applications written in Java.
- **JVM (Java Virtual Machine)**: An abstract machine that provides the runtime environment in which Java bytecode can be executed.

### What is the significance of the ‘main’ method in Java?
The main method is the entry point of any standalone Java application. It is the method that is 
first executed when a Java program runs. The signature of the main method must be public static void main(String[] args).

### What is a Constructor in Java? How is it different from a method?
###### _001_Constructor
A constructor is a block of code that initializes a newly created object. Unlike methods, constructors have the same 
name as the class and do not have a return type. Constructors are invoked implicitly when a new object is created, 
while methods must be called explicitly.

### What do you understand by a variable?
###### _002_Variables
Variable is a named memory location that can be easily referred in the program. 
The variable is used to hold the data and it can be changed during the course of the execution of the program.

Naming Conventions: In Java, variable names should follow these conventions:

	•	Start with a letter, underscore (_), or dollar sign ($).
	•	Subsequent characters can be letters, digits, underscores, or dollar signs.
	•	Should be meaningful and represent the data they hold.
	•	Use camelCase notation (e.g., totalCount, isValid).

### What if the main method is declared as private?
If you declare the main method as private, the Java Virtual Machine (JVM) will not be able to access it, 
and your program will not run as expected. </br>
The Java code will compile successfully. The compiler does not enforce any access modifier on the main method, 
it just checks for correct syntax. Therefore, declaring main as private does not cause a compilation error. </br>
When you try to run the compiled class, the JVM looks for the public static void main(String[] args) method 
to start execution. Since the main method is declared private, the JVM will not find it as an accessible entry point.

### Can I have multiple main methods in the same class?
You can have multiple methods named main within the same class, but they must differ in their parameter lists. 
This is an example of method overloading in Java. The JVM only recognizes the public static void main(String[] args) 
method as the entry point for the program. Other main methods with different parameter lists are just regular methods 
that can be called like any other method.

### Casting in Java
###### _003_Casting
Casting in Java is a way to convert a variable from one data type to another. This is a common operation in Java, 
especially when dealing with different data types in expressions or methods. There are two main types of casting 
in Java: primitive casting and reference (or object) casting.

### Methods in Java
###### _004_Methods
Methods are blocks of code designed to perform a specific task. Methods help in organizing code, promoting reusability, 
and improving readability by breaking down complex programs into simpler, more manageable pieces.

A method in Java is a collection of statements grouped together to perform an operation. 
Methods can take input in the form of parameters, execute code, and optionally return a value.

A method has several key parts:
- _Access Modifier_: Defines the visibility of the method (e.g., public, private, protected).
- _Return Type_: Specifies the data type of the value the method returns. If the method does not return a value, the return type is void.
- _Method Name_: The name of the method, which should be a verb and follow camelCase naming conventions.
- _Parameter List_: The list of parameters the method accepts, enclosed in parentheses. If the method does not accept any parameters, the parentheses are empty.
- _Method Body_: Enclosed in braces {}, contains the code that defines the action of the method.

```
accessModifier returnType methodName(parameterList) {
    // method body
}
```
Best Practices for Using Methods:

- Use Meaningful Names: Method names should be descriptive and clearly indicate the action or purpose of the method.
- Keep Methods Focused: Each method should perform a single, well-defined task.
- Limit Method Length: Long methods can be hard to understand and maintain. Break them down into smaller, reusable methods when possible.
- Use Comments: Add comments to explain complex logic or operations within a method.
- Avoid Overloading Confusion: When overloading methods, ensure that the methods have clearly distinct parameter lists to avoid ambiguity.

### Access Modifiers
###### _005_AccessModifiers
Access modifiers are keywords that set the accessibility (visibility) of classes, methods, and other members. 
They define how the members of a class can be accessed and manipulated.
Types:
* _public_
* _protected_
* _default (no keyword)_
* _private_

### If and If/Else Statements
In Java, the if statement is a fundamental control structure that allows you to make decisions in your program based on conditions. The if statement 
evaluates a boolean expression (an expression that returns true or false) and executes a block of code if the expression evaluates to true.

```
if (condition) {
    // code to be executed if condition is true
}
```

- _condition_: This is a boolean expression that evaluates to either true or false.
- _code Block_: The code inside the curly braces {} is executed only if the condition is true.

```java
public class Main {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }
    }
}
```

The **if-else statement** provides an alternative path of execution when the if condition is false. 
If the condition is true, the if block is executed; otherwise, the else block is executed.

```java
if (condition) {
    // code to be executed if condition is true
} else {
    // code to be executed if condition is false
}
```

```java
public class Main {
    public static void main(String[] args) {
        int age = 16;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
```

The **if-else ladder** is used when you have multiple conditions to check. It allows you to test multiple expressions in sequence. 
Once a condition is met (i.e., evaluates to true), the corresponding block of code is executed, and the rest of the ladder is skipped.
```java
if (condition1) {
    // code to be executed if condition1 is true
} else if (condition2) {
    // code to be executed if condition2 is true
} else if (condition3) {
    // code to be executed if condition3 is true
} else {
    // code to be executed if all conditions are false
}
```

```java
public class Main {
    public static void main(String[] args) {
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}
```

_Important Points_:

- Curly Braces {}: The curly braces {} are optional if there is only one statement to execute after the if or else. However, 
it is considered good practice to always use braces to avoid confusion and potential errors, especially when adding more statements later.
- Conditions: The condition in an if statement must be a boolean expression. For example, if (x = 10) is not valid because x = 10 
is an assignment, not a comparison. The correct condition would be if (x == 10).
- Execution Flow: Once a condition in an if-else if-else ladder is met, none of the subsequent conditions are checked.
- Nested if Statements: While you can nest if statements, deeply nested code can be hard to read and maintain. 
Consider using other control structures or refactoring the code for better readability.
- Switch Case vs. if-else: For multiple discrete values, consider using a switch statement instead of an if-else ladder 
for improved readability and performance.

### Ternary Operator
The ternary operator in Java is a concise way to perform a simple conditional operation. It is also known as the conditional operator and is the 
only operator in Java that requires three operands. The ternary operator is a shorthand form of the if-else 
statement and can be useful for simplifying code where a decision needs to be made in a single line.

```java
condition ? expressionIfTrue : expressionIfFalse;
```

- condition: A boolean expression that evaluates to true or false.
- expressionIfTrue: The expression that gets executed if the condition is true.
- expressionIfFalse: The expression that gets executed if the condition is false.

```java
public class Main {
    public static void main(String[] args) {
        int age = 18;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(eligibility);
    }
}
```

```java
public String checkSign(int number) {
    return (number >= 0) ? "Positive" : "Negative";
}
```

### Switch Statement
The switch statement is a control flow statement that allows you to execute one block of code among many choices based on 
the value of an expression. It is often used as an alternative to the if-else if-else ladder when you need to compare a 
single variable against multiple constant values. The switch statement provides a cleaner and more readable way to handle 
multiple conditions compared to multiple if-else statements, especially when dealing with a large number of potential values.

```java
switch (expression) {
    case value1:
        // code block to be executed if expression == value1
        break;
    case value2:
        // code block to be executed if expression == value2
        break;
    // more cases...
    default:
        // code block to be executed if expression doesn't match any case
}
```

- _expression_: This is a variable or expression that is evaluated once and compared with the values of each case.
- _case value_: Each case represents a potential match for the expression. If the expression matches a case value, the associated block of code runs.
- _break_: The break statement terminates the switch block and prevents the execution from falling through to the next case. 
If omitted, execution will continue to the next case (fall-through).
- _default_: This is an optional block of code that executes if none of the case values match the expression. 
It acts like the final else in an if-else if-else ladder.
```java
public class Main {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayName);
    }
}
```

Using switch Statements with Multiple Cases</br>
Sometimes, you want to execute the same block of code for multiple cases. You can achieve this by omitting break statements between the cases.
```java
public class Main {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("Good job!");
                break;
            case 'D':
                System.out.println("You passed.");
                break;
            case 'F':
                System.out.println("Better try again.");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}
```

**Enhanced switch Expressions (Java 12 and Later)**

Starting from Java 12, Java introduced an enhanced switch expression that provides more concise syntax and allows 
returning values directly from the switch expression.

```java
public class Main {
    public static void main(String[] args) {
        int day = 3;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println("The day is: " + dayName);
    }
}
```

Features of Enhanced switch Expressions:

	•	Arrow (->) Syntax: More concise than traditional case syntax.
	•	No break Needed: Each case automatically breaks after execution.
	•	Return Values: Directly assign a value from the switch expression.

### String and String manipulations
String is a widely used class that represents sequences of characters. Strings are objects in Java, 
which means they are instances of the String class. The String class provides a wealth of methods for manipulating and processing strings. 

Using a String Literals:
```java
String str1 = "Hello, World!";
```

Using new String() explicitly creates a new String object in memory, even if an identical string exists in the string pool.
```java
String str2 = new String("Hello, World!");
```

**String methods:**

length() -> Returns the length of the string (number of characters).
```java
String str = "Hello";
int length = str.length();  // Output: 5
```
charAt(int index) -> Returns the character at the specified index.
```java
String str = "Hello";
char ch = str.charAt(1);  // Output: 'e'
```

substring(int beginIndex) and substring(int beginIndex, int endIndex) -> Returns a new string that is a substring of the original string.
```java
String str = "Hello, World!";
String subStr1 = str.substring(7);        // Output: "World!"
String subStr2 = str.substring(0, 5);     // Output: "Hello"
```

indexOf(String str) and indexOf(char ch) -> Returns the index of the first occurrence of the specified substring or character. 
Returns -1 if the substring or character is not found.
```java
String str = "Hello, World!";
int index1 = str.indexOf("World");  // Output: 7
int index2 = str.indexOf('o');      // Output: 4
```

trim() -> Returns a new string with all leading and trailing whitespace removed.
```java
String str = "   Hello, World!   ";
String trimmed = str.trim();  // Output: "Hello, World!"
```

equals(Object obj) and equalsIgnoreCase(String anotherString)
- equals(Object obj): Compares the content of two strings for equality.
- equalsIgnoreCase(String anotherString): Compares two strings, ignoring case considerations.
```java
String str1 = "Hello";
String str2 = "hello";
boolean isEqual = str1.equals(str2);                // Output: false
boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);  // Output: true
```

startsWith(String prefix) and endsWith(String suffix) -> Checks if a string starts or ends with the specified prefix or suffix.
```java
String str = "Hello, World!";
boolean startsWith = str.startsWith("Hello");  // Output: true
boolean endsWith = str.endsWith("!");          // Output: true
```

### While vs do-while loop

#### While loop
A while loop is a control flow statement that allows code to be executed repeatedly based on a given boolean condition. 
The while loop will continue to execute as long as the specified condition evaluates to true. 
This makes it useful for scenarios where the number of iterations is not known beforehand and depends on dynamic conditions.

```java
while (condition) {
    // code block to be executed
}
```
- condition: A boolean expression that is evaluated before each iteration of the loop. If the condition is true, the 
code block inside the loop is executed. If the condition is false, the loop terminates.
- code Block: The statements inside the curly braces {} that are executed repeatedly as long as the condition remains true.

How the while Loop Works

- Evaluate Condition: Before each iteration, the while loop checks the condition.
- Execute Block: If the condition is true, the code inside the loop’s block is executed.
- Re-evaluate Condition: After executing the code block, the condition is checked again.
- Repeat or Terminate: If the condition is still true, the loop repeats. If the condition is false, the loop terminates, 
and the control moves to the next statement after the loop.

```java
public class Main {
    public static void main(String[] args) {
        int i = 1;  // Initialization of the counter

        while (i <= 5) {  // Condition to check
            System.out.println("Number: " + i);  // Loop body
            i++;  // Increment counter
        }
    }
}
```

#### Do-while loop
The do-while loop in Java is a variant of the while loop that executes a block of code at least once before checking 
the loop’s condition. Unlike the while loop, which checks its condition at the beginning of each iteration, the 
do-while loop checks its condition at the end. This guarantees that the code block inside the do-while loop will 
run at least once, regardless of whether the condition is initially true or false.

```java
do {
    // code block to be executed
} while (condition);
```

How the do-while Loop Works

- Execute Block: The code block inside the do is executed once initially.
- Evaluate Condition: After the code block is executed, the while condition is evaluated.
- Repeat or Terminate: If the condition is true, the loop repeats the code block. If the condition is false, the loop 
terminates, and control moves to the next statement after the loop.

```java
public class Main {
    public static void main(String[] args) {
        int i = 1;  // Initialization of the counter

        do {
            System.out.println("Number: " + i);  // Loop body
            i++;  // Increment counter
        } while (i <= 5);  // Condition to check
    }
}
```

### For Loop
a for loop is a control flow statement that allows code to be executed repeatedly based on a boolean condition. 
It is particularly useful when you know in advance how many times you need to execute a block of code. 
The for loop provides a compact way to iterate over a range of values or through elements of a collection.

```java
for (initialization; condition; update) {
    // code block to be executed
}
```

- initialization: This step initializes the loop control variable(s). It is executed only once at the beginning of the loop.
- condition: A boolean expression that is evaluated before each iteration of the loop. If the condition is true, the 
code block inside the loop is executed. If false, the loop terminates.
- update: This step is executed after each iteration of the loop’s body. It usually updates the loop control variable to 
eventually terminate the loop.

How the for Loop Works:

- _Initialization_: The loop control variable(s) are initialized. This step is executed once, before the loop starts.
- _Condition Check_: Before each iteration, the loop checks the condition.
- _Execute Code Block_: If the condition is true, the code block inside the loop is executed.
- _Update_: After executing the code block, the loop control variable is updated.
- _Repeat or Terminate_: The process repeats until the condition becomes false.

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {  // Initialization; Condition; Update
            System.out.println("Number: " + i);  // Loop body
        }
    }
}
```

NOTE: A for loop can be made **infinite** by using an empty condition, resulting in a loop that never terminates unless there is a break statement.
```java
public class Main {
    public static void main(String[] args) {
        for (;;) {  // Infinite loop
            System.out.println("This loop will run forever.");
            break;  // Exit the loop to avoid infinite execution
        }
    }
}
```

### Enhanced for Loop (For-Each Loop)
The enhanced for loop (also known as the for-each loop) is specifically designed to iterate over arrays and collections 
like ArrayList, HashSet, etc. It provides a simpler syntax to iterate through elements without needing an index counter.

```java
for (type element : array) {
    // code block to be executed
}
```

- type: The data type of the elements in the array or collection.
- element: A variable that represents the current element in the array or collection.
- array: The array or collection to iterate over.

```java
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {  // For-each loop
            System.out.println("Number: " + number);
        }
    }
}
```

Result:
```java
Number: 1
Number: 2
Number: 3
Number: 4
Number: 5
```

**break Statement** can be used to exit the loop immediately, regardless of the loop’s condition.
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 5) {
                break;  // Stops the execution and gets out of the loop
            }
            System.out.println("Number: " + i);
        }
    }
}

Output:
Number: 1
Number: 2
Number: 3
Number: 4
```

The **continue statement** skips the current iteration of the loop and moves to the next iteration.
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // Skip the iteration when i equals 3
            }
            System.out.println("Number: " + i);
        }
    }
}

Output:
Number: 1
Number: 2
Number: 4
Number: 5
```

### Data Structures in Java
Data structures are specialized formats for organizing, processing, retrieving, and storing data. Efficient data 
structures are key to designing efficient algorithms and improving the performance of your programs. Java provides 
a rich set of built-in data structures, both as part of the core language and through the Java Collections Framework (JCF).

Common Data Structures in Java

	1.	Arrays
	2.	Linked Lists
	3.	Stacks
	4.	Queues
	5.	Hash Tables and Hash Maps
	6.	Trees
	8.	Sets

#### Arrays

An array is a collection of elements stored at contiguous memory locations. It is one of the simplest and most commonly used data structures.

_Characteristics:_
- Fixed size: The size of an array is defined when it is created and cannot be changed.
- Same elements: All elements in an array must be of the same type.
- Supports random access: Elements can be accessed directly using their index.

_Common Operations:_
- Accessing elements by index
- Modifying elements
- Iterating over elements
```java
int[] numbers = {10, 20, 30, 40, 50};
int firstNumber = numbers[0];  // Accessing the first element
numbers[2] = 100;              // Modifying the third element
```

#### Linked Lists
A linked list is a linear data structure consisting of nodes, where each node contains a data part and a reference 
(or link) to the next node in the sequence. Java provides LinkedList as part of the Java Collections Framework.

_Characteristics_:
- Dynamic size: Linked lists can grow or shrink as needed.
- Elements are not stored in connected memory locations.
- Efficient insertion and deletion: Adding or removing elements is efficient if done at the beginning or end of the list.

_Common Operations_:
- Insertion and deletion of nodes
- Searching for elements
- Traversing the list

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements
        System.out.println("First Element: " + list.get(0));

        // Removing an element
        list.remove("Banana");

        // Iterating over elements
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
```

#### Stacks
A stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle. The most recently added element is the first to be removed.

_Characteristics_:
- Allows push (insert) and pop (remove) operations.
- LIFO behavior: Elements are removed in the reverse order of their addition.
- Supports peek operation to view the top element without removing it.

_Common Operations_:
- Push: Add an element to the top of the stack.
- Pop: Remove the top element from the stack.
- Peek: View the top element without removing it.
```java
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek at the top element
        System.out.println("Top Element: " + stack.peek());  // Output: 30

        // Pop an element from the stack
        stack.pop();

        // Iterate over the stack
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
```

### Queues
A queue is a linear data structure that follows the First-In-First-Out (FIFO) principle. The first element added is the first to be removed.

_Characteristics_:
- Allows enqueue (insert) and dequeue (remove) operations.
- FIFO behavior: Elements are removed in the same order as they were added.
- Supports peek operation to view the front element without removing it.

_Common Operations_:
- Enqueue: Add an element to the end of the queue.
- Dequeue: Remove an element from the front of the queue.
- Peek: View the front element without removing it.

```java
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements
        queue.add("John");
        queue.add("Jane");
        queue.add("Jack");

        // Peek at the front element
        System.out.println("Front Element: " + queue.peek());  // Output: John

        // Dequeue an element
        queue.poll();

        // Iterate over the queue
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
```

### Hash Tables and Hash Maps
A hash table (or hash map) is a data structure that stores key-value pairs, providing fast access to values based 
on their keys. Java provides HashMap as part of the Java Collections Framework.

_Characteristics_:
- Stores elements in key-value pairs.
- Provides fast lookups, insertions, and deletions (average time complexity is O(1)).
- Allows null keys and values (in HashMap).

_Common Operations_:
- Put: Insert a key-value pair into the map.
- Get: Retrieve the value associated with a key.
- Remove: Remove a key-value pair from the map.

```java
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Put key-value pairs into the map
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Get a value by key
        System.out.println("Value for key 'Apple': " + map.get("Apple"));  // Output: 10

        // Remove a key-value pair
        map.remove("Banana");

        // Iterate over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
```

### Mutable vs Immutable objects in Java

The terms mutable and immutable refer to whether an object’s state can be changed after it is created.

	•	Mutable objects: Objects whose state or data can be changed after creation.
	•	Immutable objects: Objects whose state or data cannot be changed after creation.

**Immutable Objects**

An immutable object is an object whose state cannot be modified after it is created. Any attempt to change the object 
results in the creation of a new object, leaving the original object unchanged.

In Java, the most common example of an immutable class is the String class. Once a String object is created, it 
cannot be changed. Any operation that appears to modify a string (like concatenation) actually creates a new String object.

_Key Characteristics of Immutable Objects:_

	1.	No State Change: Once the object is created, its state (data) cannot be altered.
	2.	Thread-Safe: Immutable objects are inherently thread-safe because their state cannot change. They can be shared between multiple threads without synchronization.
	3.	Final Fields: Immutable objects usually have all fields declared as final, meaning they cannot be reassigned once initialized.
	4.	New Object Creation: Any operation that would modify the object instead creates a new object.

Examples of Immutable Classes:

	•	String
	•	Wrapper classes like Integer, Double, Boolean
	•	LocalDate, LocalTime, and other classes in the java.time package

```java
public class ImmutableExample {
    public static void main(String[] args) {
        String str = "Hello";
        
        // This operation doesn't modify 'str' but creates a new string
        str = str.concat(" World");
        
        System.out.println(str);  // Output: "Hello World"
    }
}
```
In the above example:
- The string str originally holds "Hello".
- The concat() method doesn’t change the original string but returns a new String object "Hello World".
- The reference str now points to the new object.

**Mutable Objects**

A mutable object is an object whose state can be changed after it is created. This means that the fields (data) of the 
object can be modified, added to, or removed without needing to create a new object.

Many built-in Java classes are mutable, such as ArrayList, HashMap, StringBuilder, and user-defined classes with setter methods.

_Key Characteristics of Mutable Objects:_

	1.	State Change: Mutable objects can have their state (data) changed after creation.
	2.	Not Thread-Safe: Mutable objects are not inherently thread-safe, meaning that if multiple threads modify an object simultaneously, data inconsistency can occur unless proper synchronization is used.
	3.	Setter Methods: Mutable objects typically have setter methods that allow the modification of their fields.

StringBuilder example:
```java
public class MutableExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        // Modifying the StringBuilder object in place
        sb.append(" World");
        
        System.out.println(sb);  // Output: "Hello World"
    }
}
```
StringBuffer example:
```java
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // Append operation
        sb.append(" World!");
        System.out.println(sb);  // Output: Hello World!

        // Insert operation
        sb.insert(5, " Java");
        System.out.println(sb);  // Output: Hello Java World!

        // Delete operation
        sb.delete(5, 10);
        System.out.println(sb);  // Output: Hello World!

        // Reverse operation
        sb.reverse();
        System.out.println(sb);  // Output: !dlroW olleH
    }
}
```

### StringBuilder vs StringBuffer

Both StringBuilder and StringBuffer are classes used to create and manipulate mutable strings. They are similar in 
many ways, but they have key differences related to thread safety and performance.

| StringBuilder | StringBuffer |
|-------------- |:------------ |
|Not thread-safe (no synchronization).|Thread-safe (methods are synchronized).|
|Faster (better for single-threaded applications).|Slower (due to synchronization overhead).|
|Use when thread safety is not a concern.|Use when thread safety is required.|

**_When to Use StringBuilder_**
</br>
Use StringBuilder in scenarios where you are working in a single-threaded environment or when thread safety is not 
required. Since StringBuilder methods are not synchronized, it provides better performance than StringBuffer because 
there is no overhead of acquiring and releasing locks.

**_When to Use StringBuffer_**
</br>
Use StringBuffer when you are working in a multithreaded environment and need to ensure that multiple threads can 
safely access and modify the same string. The methods in StringBuffer are synchronized, which ensures thread safety 
but comes with a performance cost.

_**Performance Comparison**_
- StringBuilder is faster than StringBuffer in single-threaded programs because it doesn’t incur the overhead of synchronization.
- StringBuffer should be used when the same string may be accessed or modified by multiple threads simultaneously, ensuring thread safety.
<hr>

### OOP in Java ###

The four main principles of OOP are:

> 1.	Encapsulation
> 2.	Abstraction
> 3.	Inheritance
> 4.	Polymorphism

##### 1. Encapsulation 
**Encapsulation** is the mechanism of bundling data (variables) and methods (functions) that operate on the data into a 
single unit or class. It also involves restricting access to some of the object’s components to maintain control over 
the data, which helps protect the integrity of the object. This is typically done using access modifiers like private, 
public, and protected.

Encapsulation allows you to:

> - Hide the internal implementation details of an object.
> - Control access to the data by exposing getter and setter methods.

```java
public class Person {
    // Private fields (encapsulation)
    private String name;
    private int age;

    // Constructor to initialize fields
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```

In this example, the Person class encapsulates the name and age attributes by making them private, and provides public 
methods (getName, setName, etc.) to access and modify them.

##### 2. Abstraction

**Abstraction** is the process of hiding the implementation details and showing only the functionality to the user. 
It focuses on what an object does rather than how it does it. Abstraction can be achieved in Java using abstract 
classes and interfaces.

Abstract Classes: 
> Classes that cannot be instantiated and may contain abstract methods (methods without implementation). 
> Subclasses of abstract classes must provide the implementation for these abstract methods.

Interfaces: 
> A collection of abstract methods that a class can implement. 
> Interfaces provide complete abstraction since they do not contain any concrete methods.

```java
// Defining an interface
interface Animal {
    void sound();  // Abstract method
}

// Implementing the interface in the Dog class
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Implementing the interface in the Cat class
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();  // Output: Dog barks

        Animal cat = new Cat();
        cat.sound();  // Output: Cat meows
    }
}
```

In this example, Animal is an interface that abstracts the concept of an animal sound. The classes Dog and Cat 
implement this interface by providing their own specific implementations of the sound() method.

##### 3. Inheritance

**Inheritance** is a mechanism in OOP where one class (the subclass or derived class) inherits the fields and methods 
of another class (the superclass or base class). It allows for code reusability and helps create a hierarchical 
relationship between classes.

In Java, inheritance is achieved using the **_extends_** keyword. The subclass inherits all non-private fields and 
methods of the superclass and can add its own fields and methods or override existing ones.

```java
// Base class (Parent class)
class Animal {
    protected String name;

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Derived class (Child class)
class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    // Overriding the eat method
    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();    // Output: Buddy is eating dog food.
        dog.bark();   // Output: Buddy is barking.
    }
}
```

In this example, the Dog class inherits the name field and the eat() method from the Animal class. The Dog class 
overrides the eat() method to provide its own specific behavior and adds a new method bark().

##### 4. Polymorphism

**Polymorphism** allows one entity (such as a method or an object) to take multiple forms. It can be achieved in Java in two ways:

> 1. _**Method Overloading**_ (Compile-time Polymorphism): Allows multiple methods in the same class to have the same name 
> but different parameter lists (signature).
> 2. **_Method Overriding_** (Run-time Polymorphism): Allows a subclass to provide a specific implementation for a 
> method that is already defined in its superclass.
<hr>

### Method Overloading vs Method Overriding

Method overloading and method overriding are two ways to achieve polymorphism, but they work differently. 
They both allow methods to share the same name but have different purposes, behaviors, and rules for how they are implemented.

#### **Method Overloading**

Method overloading allows a class to have multiple methods with the same name but different parameter lists. 
It is an example of compile-time polymorphism (or static polymorphism), meaning that the method to be called is 
determined at compile time based on the method signature.

Rules for Method Overloading:

> - Methods must have the same name.
> - Methods must have different parameters (either in number, type, or order of parameters).
> - Methods can have different return types.
> - Methods can have different access modifiers and exception handling.

```java
class Calculator {
    // Overloaded methods with different parameter types
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded methods with different numbers of parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.add(10, 20));       // Calls add(int, int), Output: 30
        System.out.println(calc.add(10.5, 20.5));   // Calls add(double, double), Output: 31.0
        System.out.println(calc.add(1, 2, 3));      // Calls add(int, int, int), Output: 6
    }
}
```

In this example, the add() method is overloaded with different parameter types and numbers. Depending on the arguments 
passed, the appropriate method is called at compile time.

#### Method Overriding

Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its 
parent class. It is an example of run-time polymorphism (or dynamic polymorphism), meaning that the method to be called 
is determined at runtime based on the type of the object.

Rules for Method Overriding:

> - The method in the subclass must have the same name, same parameter list, and same return type 
> (or a covariant return type) as the method in the parent class.
> - The overriding method cannot have a more restrictive access modifier than the overridden method 
> (e.g., if the parent method is public, the overridden method must also be public).
> - The overriding method can throw fewer or no exceptions, but not more checked exceptions than the parent method.
> - Only instance methods can be overridden, not static or final methods.
> - The @Override annotation is optional but recommended to ensure that the method is correctly overriding a method from the parent class.

```java
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method in the Dog class
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();  // Polymorphism: Animal reference, Dog object
        
        animal.sound();  // Calls Animal's sound method, Output: Animal makes a sound
        dog.sound();     // Calls Dog's sound method, Output: Dog barks
    }
}
```

In this example, the Dog class overrides the sound() method of the Animal class. The method to be executed depends on 
the object type at runtime, demonstrating runtime polymorphism.

**_Conclusion_**

- Method overloading is used when you want the same method to perform different tasks based on different parameter 
types or numbers. It is a compile-time feature and provides flexibility for multiple use cases within the same class.
- Method overriding is used when you want to redefine a method in a subclass to give it a specific behavior. It is a 
runtime feature that supports polymorphism and allows the subclass to provide a specific implementation for a method 
already defined in the parent class.

<hr>

## Exceptions

**Exceptions** are events that disrupt the normal flow of the program’s execution. They are objects that represent an 
error or an unexpected event. Exceptions provide a way to transfer control from one part of a program to another and 
handle errors or other exceptional conditions that occur during runtime.

Java uses an exception-handling mechanism that allows developers/sdets to handle errors gracefully without crashing 
the program. It also encourages writing robust code that can handle unexpected scenarios.

#### Types of Exceptions in Java
Java has a rich hierarchy of exceptions, and they can be categorized into three main types:

> 1. Checked Exceptions (Compile-time exceptions)
> 2. Unchecked Exceptions (Runtime exceptions)
> 3. Errors

#### 1. Checked Exceptions

Checked exceptions are exceptions that are checked by the compiler at compile-time. These are typically external factors 
beyond the program’s control, such as file I/O operations or database access. If a method throws a checked exception, 
the calling method must handle it using a try-catch block or declare it in the method signature using the **throws** keyword.

Common Examples of Checked Exceptions:

	•	IOException
	•	SQLException
	•	FileNotFoundException
	•	ClassNotFoundException
Example:
###### _006_Exceptions

#### 2. Unchecked Exceptions

Unchecked exceptions are exceptions that are not checked by the compiler at compile-time. They occur during runtime, 
and handling them is optional. These exceptions typically indicate programming bugs or logical errors such as division 
by zero or accessing an invalid array index. Unchecked exceptions are subclasses of RuntimeException.

Common Examples of Unchecked Exceptions:

	•	NullPointerException
	•	ArrayIndexOutOfBoundsException
	•	ArithmeticException
	•	IllegalArgumentException

#### 3. Errors

Errors represent serious problems that are usually outside the control of the program, such as system failures or 
resource exhaustion. They are subclasses of Error and are not meant to be caught or handled by the application. 
Examples include stack overflow errors and out-of-memory errors. Errors are generally unrecoverable and indicate 
that the program should terminate.

Common Examples of Errors:

	•	OutOfMemoryError
	•	StackOverflowError
	•	VirtualMachineError

<hr>

### Exception Handling Mechanism
Java provides a structured way to handle exceptions using a combination of keywords: 
_try, catch, finally, throw,_ and _throws_.

#### 1. try-catch Block

A try-catch block is used to handle exceptions. The code that may throw an exception is placed inside the try block, 
and the catch block handles the exception.
```java
try {
    // Code that may throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
}
```

```java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }
}
```

#### 2. finally Block

The finally block is optional and is used to execute code that must run regardless of whether an exception was thrown 
or not. It is commonly used to release resources like file handles, database connections, or sockets.

```java
try {
    // Code that may throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
} finally {
    // Code that always executes, even if an exception occurs
}
```

```java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
```

#### 3. throw Keyword
The throw keyword is used to explicitly throw an exception. It is often used in custom exception handling.

```java
throw new ExceptionType("Error message");
```

```java
public class Main {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }

        System.out.println("Age is valid.");
    }
}
```
In this example, an IllegalArgumentException is explicitly thrown if the age is less than 18.

#### 4. throws Keyword
The throws keyword is used in method signatures to indicate that the method might throw one or more exceptions. This 
is commonly used for checked exceptions, and the caller of the method is responsible for handling the exception.

```java
public void methodName() throws ExceptionType1, ExceptionType2 {
    // Method code
}
```

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void readFile() throws FileNotFoundException {
        File file = new File("non_existent_file.txt");
        Scanner reader = new Scanner(file);
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
```
In this example, the readFile() method declares that it throws a FileNotFoundException, and the caller (main method) 
is responsible for handling the exception.

#### Exception Hierarchy in Java

All exceptions and errors in Java are subclasses of the Throwable class. The Throwable class has two main subclasses:

> 1. _Exception_: This class is used for exceptional conditions that applications might want to catch. It has two main categories:
>	- Checked Exceptions: Subclasses of Exception (except RuntimeException).
>	- Unchecked Exceptions: Subclasses of RuntimeException.
> 2. _Error_: Errors indicate serious problems that a reasonable application should not try to catch, such as OutOfMemoryError or StackOverflowError.

<hr>

### Top Java Coding Interview Questions for SDET
https://beknazarsuranchiyev.medium.com/top-17-java-coding-interview-questions-for-sdet-a978754eb078

1. String reverse
2. Array reverse
3. Reverse words
4. Prime numbers
5. String palindrome
6. Number palindrome
7. Max/Min number from an array
8. Find the second min/max number from an array
9. Swap values of two variables
10. Two-string anagram
11. Remove duplicate letters from a string
12. Count how many times each letter was repeated in a sentence/word
13. FizzBuzz
14. Even or Odd number
15. Sum of two
16. The fibonacci
17. Balanced String
18. Sort an array without using sort methods