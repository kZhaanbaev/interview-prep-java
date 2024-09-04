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

