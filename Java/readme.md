# Java Collection Framework

Java's Collection Framework provides a set of interfaces and classes to store and manipulate groups of data as a single unit. The framework consists of various types of collections such as lists, sets, queues, maps, and others. Here is a structured overview of all the main collection interfaces and classes available, along with their key functions and code snippets.

* * *

### 1\. **List Interface**

*   **Description**: An ordered collection (also known as a sequence). Lists can contain duplicate elements.
*   **Implementations**: `ArrayList`, `LinkedList`, `Vector`, `Stack`

#### **Key Methods**

*   `add(E e)`: Adds an element to the list.
*   `get(int index)`: Returns the element at the specified position.
*   `remove(int index)`: Removes the element at the specified position.
*   `size()`: Returns the number of elements in the list.

```java
List<String> list = new ArrayList<>();
list.add("Apple");      // Add an element
list.add("Banana"); 
System.out.println(list.get(0));  // Access element at index 0
list.remove(1);         // Remove element at index 1
System.out.println(list.size());  // Get size of list
```

* * *

### 2\. **Set Interface**

*   **Description**: A collection that contains no duplicate elements.
*   **Implementations**: `HashSet`, `LinkedHashSet`, `TreeSet`

#### **Key Methods**

*   `add(E e)`: Adds an element to the set if it's not already present.
*   `remove(Object o)`: Removes a specific element.
*   `contains(Object o)`: Checks if a specific element is present.
*   `size()`: Returns the number of elements in the set.

```java
Set<String> set = new HashSet<>();
set.add("Apple"); 
set.add("Banana"); 
set.add("Apple");    // Duplicate, won't be added
System.out.println(set.contains("Banana"));  // Check if element is present
set.remove("Apple");  // Remove an element
System.out.println(set.size());  // Get size of set
```

* * *

### 3\. **Queue Interface**

*   **Description**: A collection designed for holding elements prior to processing. Queues typically follow a first-in-first-out (FIFO) order.
*   **Implementations**: `PriorityQueue`, `LinkedList`

#### **Key Methods**

*   `offer(E e)`: Inserts the specified element into the queue.
*   `poll()`: Retrieves and removes the head of the queue.
*   `peek()`: Retrieves but does not remove the head of the queue.

```java
Queue<String> queue = new LinkedList<>();
queue.offer("Task1");  // Insert element into queue
queue.offer("Task2"); 
System.out.println(queue.peek());  // Get head without removing
queue.poll();  // Retrieve and remove head
System.out.println(queue.size());  // Get size of queue
```

* * *

### 4\. **Deque Interface**

*   **Description**: A double-ended queue that supports insertion and removal at both ends.
*   **Implementations**: `ArrayDeque`, `LinkedList`

#### **Key Methods**

*   `addFirst(E e)`: Inserts the element at the front.
*   `addLast(E e)`: Inserts the element at the end.
*   `removeFirst()`: Removes the first element.
*   `removeLast()`: Removes the last element.

```java
Deque<String> deque = new ArrayDeque<>();
deque.addFirst("First");  // Add at the front
deque.addLast("Last");    // Add at the end
System.out.println(deque.removeFirst());  // Remove first element
System.out.println(deque.removeLast());   // Remove last element
```

* * *

### 5\. **Map Interface**

*   **Description**: An object that maps keys to values, with no duplicate keys allowed.
*   **Implementations**: `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`

#### **Key Methods**

*   `put(K key, V value)`: Associates the specified value with the specified key.
*   `get(Object key)`: Returns the value mapped to the key.
*   `remove(Object key)`: Removes the mapping for a key.
*   `keySet()`: Returns a set of the keys contained in the map.

```java
Map<String, Integer> map = new HashMap<>();
map.put("Apple", 1);    // Add key-value pair
map.put("Banana", 2); 
System.out.println(map.get("Apple"));  // Retrieve value for key
map.remove("Banana");   // Remove key-value pair
System.out.println(map.keySet());  // Get all keys
```

* * *

### 6\. **Stack Class**

*   **Description**: A subclass of `Vector` that follows the last-in-first-out (LIFO) order.
*   **Implementation**: `Stack`

#### **Key Methods**

*   `push(E e)`: Pushes an element onto the stack.
*   `pop()`: Removes the object at the top of the stack.
*   `peek()`: Looks at the object at the top without removing it.

```java
Stack<String> stack = new Stack<>();
stack.push("First");  // Push element to stack
stack.push("Second"); 
System.out.println(stack.peek());  // Peek at the top element
stack.pop();  // Pop the top element
System.out.println(stack.size());  // Get size of stack
```

* * *

### 7\. **SortedSet Interface**

*   **Description**: A `Set` that maintains its elements in ascending order.
*   **Implementation**: `TreeSet`

#### **Key Methods**

*   `first()`: Returns the first (lowest) element.
*   `last()`: Returns the last (highest) element.
*   `subSet(E fromElement, E toElement)`: Returns a range of elements.

```java
SortedSet<String> sortedSet = new TreeSet<>();
sortedSet.add("Banana"); 
sortedSet.add("Apple"); 
sortedSet.add("Mango"); 
System.out.println(sortedSet.first());  // Get first element
System.out.println(sortedSet.last());   // Get last element
```

* * *

### 8\. **SortedMap Interface**

*   **Description**: A `Map` that maintains its mappings in ascending key order.
*   **Implementation**: `TreeMap`

#### **Key Methods**

*   `firstKey()`: Returns the first (lowest) key.
*   `lastKey()`: Returns the last (highest) key.
*   `subMap(K fromKey, K toKey)`: Returns a portion of the map whose keys range from `fromKey` to `toKey`.

```java
SortedMap<String, Integer> sortedMap = new TreeMap<>();
sortedMap.put("Apple", 1); 
sortedMap.put("Banana", 2); 
sortedMap.put("Mango", 3); 
System.out.println(sortedMap.firstKey());  // Get first key
System.out.println(sortedMap.lastKey());   // Get last key
```

* * *

This is a structured overview of the main collection frameworks available in Java, including their key methods and examples.

# `Java List Interface`

The **`List`** interface in Java is part of the `java.util` package and represents an ordered collection of elements. Lists can contain duplicate elements, and they allow access to elements based on their position (index).

#### **Classes Implementing List Interface:**

1.  **`ArrayList`** - Resizable array implementation.
2.  **`LinkedList`** - Doubly linked list implementation.
3.  **`Vector`** - Synchronized resizable array.
4.  **`Stack`** - A LIFO stack, subclass of `Vector`.

Below is a full breakdown of these classes with their key methods and full examples.

* * *

### 1\. **`ArrayList`**

*   **Description**: A resizable array implementation of the `List` interface. It allows fast random access, but slower insertions and deletions compared to a `LinkedList` because shifting may be required.

#### **Common Methods of `ArrayList`**

*   `add(E e)`: Adds an element to the list.
*   `get(int index)`: Retrieves the element at the specified position.
*   `set(int index, E element)`: Replaces the element at the specified position.
*   `remove(int index)`: Removes the element at the specified position.
*   `size()`: Returns the number of elements.
*   `isEmpty()`: Checks if the list is empty.
*   `contains(Object o)`: Checks if the list contains the specified element.

```java
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        // Add elements to ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Get element at index 1
        System.out.println("Element at index 1: " + arrayList.get(1));  // Output: Banana

        // Set a new value at index 2
        arrayList.set(2, "Orange");

        // Check if the list contains "Apple"
        System.out.println("Contains Apple? " + arrayList.contains("Apple"));  // Output: true

        // Remove element at index 0
        arrayList.remove(0);

        // Get the size of the list
        System.out.println("Size of ArrayList: " + arrayList.size());  // Output: 2

        // Iterate over ArrayList
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}
```

### 2. `LinkedList`

**Description**: A doubly linked list implementation of the List interface. It provides better performance for insertion and deletion operations compared to ArrayList, especially in the middle of the list.

#### **Common Methods of LinkedList**
- `add(E e)`: Adds an element at the end of the list.
- `addFirst(E e)`: Adds an element at the beginning of the list.
- `addLast(E e)`: Adds an element at the end (same as `add`).
- `removeFirst()`: Removes the first element.
- `removeLast()`: Removes the last element.
- `getFirst()`: Retrieves the first element.
- `getLast()`: Retrieves the last element.
- `size()`: Returns the number of elements.

```java
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        // Add elements to LinkedList
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Horse");

        // Add element at the beginning
        ((LinkedList<String>) linkedList).addFirst("Elephant");

        // Get the first and last elements
        System.out.println("First element: " + ((LinkedList<String>) linkedList).getFirst());
        System.out.println("Last element: " + ((LinkedList<String>) linkedList).getLast());

        // Remove the first element
        ((LinkedList<String>) linkedList).removeFirst();

        // Remove the last element
        ((LinkedList<String>) linkedList).removeLast();

        // Get the size of the list
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Iterate over LinkedList
        for (String animal : linkedList) {
            System.out.println(animal);
        }
    }
}
```

### 3. `Vector`

**Description**: A synchronized, resizable array. It is very similar to ArrayList but has synchronized methods, making it thread-safe.

## **Common Methods of Vector**

- `add(E e)`: Adds an element to the vector.
- `get(int index)`: Retrieves the element at the specified position.
- `remove(int index)`: Removes the element at the specified position.
- `size()`: Returns the number of elements.
- `capacity()`: Returns the current capacity of the vector.

```java
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Add elements to Vector
        vector.add("Car");
        vector.add("Bus");
        vector.add("Bike");

        // Get element at index 2
        System.out.println("Element at index 2: " + vector.get(2));  // Output: Bike

        // Remove element at index 1
        vector.remove(1);

        // Get size and capacity of the Vector
        System.out.println("Size of Vector: " + vector.size());  // Output: 2
        System.out.println("Capacity of Vector: " + vector.capacity());  // Capacity can vary

        // Iterate over Vector
        for (String vehicle : vector) {
            System.out.println(vehicle);
        }
    }
}
```
### 4. `Stack`

**Description**: A subclass of Vector that implements a LIFO (Last In First Out) stack. It is synchronized and thread-safe.

## **Common Methods of Stack**

- `push(E e)`: Pushes an element onto the stack.
- `pop()`: Removes and returns the element at the top of the stack.
- `peek()`: Returns the element at the top without removing it.
- `isEmpty()`: Checks if the stack is empty.
- `search(Object o)`: Returns the 1-based position of the element in the stack.

```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements onto the Stack
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        // Peek the top element
        System.out.println("Top element: " + stack.peek());  // Output: Third

        // Pop the top element
        System.out.println("Popped element: " + stack.pop());  // Output: Third

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());  // Output: false

        // Search for an element
        System.out.println("Position of 'First': " + stack.search("First"));  // Output: 1

        // Get size of the stack
        System.out.println("Size of Stack: " + stack.size());
    }
}
```







---
---
---
---

# Types of Interfaces in Java

In Java, there are several types of interfaces that you can define and use. Here are the main types, along with simple examples for each:

1. **Standard Interface**: Contains method declarations.
2. **Functional Interface**: Contains exactly one abstract method; can be used with lambda expressions.
3. **Marker Interface**: No methods; signals a property to the compiler or runtime.
4. **Tagging Interface**: Similar to marker interfaces; used for metadata.
5. **Default Interface**: Allows method definitions with default implementations.

## 1. Standard Interface

A regular interface can declare methods that need to be implemented by any class that chooses to implement the interface.

**Example:**

```java
interface Animal { 
    void makeSound(); // Method declaration 
}  
class Dog implements Animal { 
    @Override 
    public void makeSound() { 
        System.out.println("Bark"); 
    } 
}
```

## 2. Functional Interface
A functional interface is an interface that contains exactly one abstract method. These interfaces can be instantiated with lambda expressions or method references.

**Example 1:**

```java
@FunctionalInterface 
interface Mapper<T, R> { 
    R apply(T input); // Single abstract method 
}  

public class Main { 
    public static void main(String[] args) { 
        Mapper<Integer, Integer> square = x -> x * x; // Lambda expression 
        System.out.println(square.apply(5)); // Output: 25 
    } 
}
```

**Example 2:**

```java
import java.util.Arrays;

// Step 1: Define a functional interface
@FunctionalInterface
interface Mapper<T, R> {
    R map(T input);
}

// Step 2: Implement the custom map function
public class Mappers {
    public static <T, R> R[] customMap(T[] inputArray, Mapper<T, R> mapper, R[] outputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            outputArray[i] = mapper.map(inputArray[i]);
        }
        return outputArray;
    }

    public static void main(String[] args) {
        Integer[] numbers = { 1, 2, 3, 4 };
        Integer[] squares = new Integer[numbers.length];

        // Step 3: Use the custom map function
        customMap(numbers, x -> x * x, squares);

        // Output the result
        System.out.println(Arrays.toString(squares)); // Output: [1, 4, 9, 16]
    }
}

```

## 3. Marker Interface

A **marker interface** is an interface that does not contain any methods or fields. It is used to signal to the Java runtime or the compiler that a class possesses a certain property.

## Example

```java
interface Serializable {
    // No methods
}

class Person implements Serializable {
    // Person class is serializable
}
```

## 4. Tagging Interface

Similar to a marker interface, a tagging interface is used to provide metadata about a class. It doesn’t add behavior but indicates that the class has some capability.

## Example

```java
interface Cloneable {
    // No methods
}

class MyClass implements Cloneable {
    // MyClass can be cloned
}
```


## 5. Default Interface

Java 8 introduced default methods in interfaces, which allow you to define methods with a body in the interface itself. Classes that implement the interface can use these default methods or override them.
## Example

```java
interface Vehicle {
    void start(); // Abstract method

    default void honk() { // Default method
        System.out.println("Honking!");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}
```

---


# Differences Between `int` and `Integer` in Java

You can use `int` instead of `Integer` in Java, but there are important differences between the two:

## Key Differences

1. **Type**:
    - `int` is a **primitive type**. It holds the actual integer value directly.
    - `Integer` is a **wrapper class**. It is an object that contains a single `int` value and provides utility methods to work with integers.

2. **Nullability**:
    - `int` cannot be null. It always holds a value (0 by default if not initialized).
    - `Integer` can be null, which can be useful in situations where you want to represent the absence of a value.

3. **Autoboxing and Unboxing**:
    - Java provides autoboxing (automatic conversion from `int` to `Integer`) and unboxing (automatic conversion from `Integer` to `int`).
    - For example, you can assign an `int` to an `Integer` variable, and Java will automatically convert it.

## Example Usage

Here’s how you can use both `int` and `Integer` in your code:

### Using `int`:
```java
int sum = 0;
int[] numbers = {1, 2, 3, 4};
for (int num : numbers) {
    sum += num;
}
System.out.println(sum); // Output: 10
```

### Using `Integer`:
```java
Integer sum = 0; // Using Integer instead of int
Integer[] numbers = {1, 2, 3, 4};
for (Integer num : numbers) {
    sum += num; // Autoboxing takes care of converting int to Integer
}
System.out.println(sum); // Output: 10
```

## When to Use Which

- Use **`int`** when you are sure you will always have a value and want better performance since primitive types are more memory-efficient.
- Use **`Integer`** ## Key Characteristics of Streams
- **Not a Data Structure**: A stream does not store data; it represents a view of data that can be processed.
- **Pipelines**: Streams can be composed into a pipeline of operations. You can chain operations such as `filter()`, `map()`, `reduce()`, and more.
- **Laziness**: Stream operations are lazy. Intermediate operations are not executed until a terminal operation is invoked.
- **Parallel Processing**: Streams can be processed in parallel using the `parallelStream()` method.
- **Functional Style**: Streams promote a functional programming style, allowing you to pass behavior (like functions) as parameters.




---

## Using Stream
A Stream is a sequence of elements that can be processed in a functional style. Streams allow you to perform operations on collections of data (like lists, sets, or arrays) in a declarative way, focusing on what to do rather than how to do it. They were introduced in Java 8 as part of the `java.util.stream` package.

```java
import java.util.Arrays;  

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        Integer[] squares = Arrays.stream(numbers)
                                  .map(x -> x * x)
                                  .toArray(Integer[]::new);
        System.out.println(Arrays.toString(squares)); // Output: [1, 4, 9, 16]
    }
}
```


# Creating a Stream
You can create a stream from various data sources, including collections, arrays, and I/O channels. For instance, using `Arrays.stream()` is a common way to create a stream from an array.

## Example of Arrays.stream()
Here's how you can use `Arrays.stream()` to create a stream from an array and perform operations on it:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Create a stream from the array and compute the sum of squares
        int sumOfSquares = Arrays.stream(numbers) // Create a stream from the array
                                 .map(x -> x * x) // Square each number
                                 .sum(); // Sum the squared values

        System.out.println(sumOfSquares); // Output: 55
    }
}
```

### Explanation of the Example
- **Creating a Stream**: `Arrays.stream(numbers)` creates a stream of integers from the `numbers` array.
- **Mapping**: The `map(x -> x * x)` operation transforms each element in the stream by squaring it.
- **Summing**: The `sum()` method computes the total of the squared values.

## Common Stream Operations
### Intermediate Operations:
- `filter()`: Filters elements based on a predicate.
- `map()`: Transforms elements into another form.
- `distinct()`: Removes duplicate elements.
- `sorted()`: Sorts the elements.

### Terminal Operations:
- `collect()`: Collects the elements into a collection (like a List).
- `forEach()`: Performs an action for each element.
- `reduce()`: Reduces the elements to a single value.when you need to represent the absence of a value (null) or when working with collections (like `List<Integer>`) that cannot hold primitive types.


## Key Characteristics of Streams
- **Not a Data Structure**: A stream does not store data; it represents a view of data that can be processed.
- **Pipelines**: Streams can be composed into a pipeline of operations. You can chain operations such as `filter()`, `map()`, `reduce()`, and more.
- **Laziness**: Stream operations are lazy. Intermediate operations are not executed until a terminal operation is invoked.
- **Parallel Processing**: Streams can be processed in parallel using the `parallelStream()` method.
- **Functional Style**: Streams promote a functional programming style, allowing you to pass behavior (like functions) as parameters.

## Creating a Stream
You can create a stream from various data sources, including collections, arrays, and I/O channels. For instance, using `Arrays.stream()` is a common way to create a stream from an array.

## Example of Arrays.stream()
Here's how you can use `Arrays.stream()` to create a stream from an array and perform operations on it:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Create a stream from the array and compute the sum of squares
        int sumOfSquares = Arrays.stream(numbers) // Create a stream from the array
                                 .map(x -> x * x) // Square each number
                                 .sum(); // Sum the squared values

        System.out.println(sumOfSquares); // Output: 55
    }
}
```

### Explanation of the Example
- **Creating a Stream**: `Arrays.stream(numbers)` creates a stream of integers from the `numbers` array.
- **Mapping**: The `map(x -> x * x)` operation transforms each element in the stream by squaring it.
- **Summing**: The `sum()` method computes the total of the squared values.

## Common Stream Operations
### Intermediate Operations:
- `filter()`: Filters elements based on a predicate.
- `map()`: Transforms elements into another form.
- `distinct()`: Removes duplicate elements.
- `sorted()`: Sorts the elements.

### Terminal Operations:
- `collect()`: Collects the elements into a collection (like a List).
- `forEach()`: Performs an action for each element.
- `reduce()`: Reduces the elements to a single value.


### More operations

### `Distinct() - Removes Duplicates`
```java
import java.util.stream.Collectors;

List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5);
List<Integer> distinctNumbers = numbers.stream()
                                       .distinct()
                                       .collect(Collectors.toList());
System.out.println("Distinct Numbers: " + distinctNumbers);
```
### Output
```
Distinct Numbers: [1, 2, 3, 4, 5]
```

### `Sorted() - Removes Duplicates`
```java
import java.util.stream.Collectors;

List<Integer> numbers = Arrays.asList(5, 1, 3, 9, 2);
List<Integer> sortedNumbers = numbers.stream()
                                     .sorted()
                                     .collect(Collectors.toList());
System.out.println("Sorted Numbers: " + sortedNumbers);
```

### Output
```
Sorted Numbers: [1, 2, 3, 5, 9]
```


### `Collect() - Collects the elements into a collection (like a List)`
```java
import java.util.stream.Collectors;

List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice");
Set<String> uniqueNames = names.stream()
                               .collect(Collectors.toSet());
System.out.println("Unique Names: " + uniqueNames);
```
### Output
```
Unique Names: [Bob, Alice, Charlie]
```


# `Other Collector Functions`

A comprehensive overview of the functions provided by the `Collectors` class in Java, which is part of the `java.util.stream` package. These collectors allow you to accumulate the elements of a stream into various types of collections and formats.

## 1. **Basic Collectors**

* **`toList()`**:
    * Collects the elements of the stream into a `List`.
    * Example:
    ```java
    List<String> list = stream.collect(Collectors.toList());
    ```

* **`toSet()`**:
    * Collects the elements of the stream into a `Set`, removing duplicates.
    * Example:
    ```java
    Set<String> set = stream.collect(Collectors.toSet());
    ```

* **`toMap()`**:
    * Collects the elements into a `Map` using specified key and value mappings.
    * Example:
    ```java
    Map<Integer, String> map = stream.collect(Collectors.toMap(String::length, Function.identity()));
    ```

## 2. **Joining Collectors**

* **`joining()`**:
    * Concatenates the elements of the stream into a single `String`.
    * Example:
    ```java
    String result = stream.collect(Collectors.joining(", "));
    ```

* **`joining(CharSequence delimiter)`**:
    * Concatenates the elements with a specified delimiter.
    * Example:
    ```java
    String result = stream.collect(Collectors.joining(", "));
    ```

* **`joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)`**:
    * Concatenates with a delimiter, prefix, and suffix.
    * Example:
    ```java
    String result = stream.collect(Collectors.joining(", ", "[", "]"));
    ```

## 3. **Summarization Collectors**

* **`counting()`**:
    * Counts the number of elements in the stream.
    * Example:
    ```java
    long count = stream.collect(Collectors.counting());
    ```

* **`summarizingInt()`**:
    * Collects statistics, such as count, sum, min, average, and max, for an `int` field.
    * Example:
    ```java
    IntSummaryStatistics stats = stream.collect(Collectors.summarizingInt(String::length));
    ```

* **`summarizingDouble()`**:
    * Similar to `summarizingInt()`, but for `double` fields.
    * Example:
    ```java
    DoubleSummaryStatistics stats = stream.collect(Collectors.summarizingDouble(Double::parseDouble));
    ```

* **`summarizingLong()`**:
    * Similar to `summarizingInt()`, but for `long` fields.
    * Example:
    ```java
    LongSummaryStatistics stats = stream.collect(Collectors.summarizingLong(Long::parseLong));
    ```

## 4. **Aggregation Collectors**

* **`reducing()`**:
    * Performs a reduction on the elements of the stream using an associative accumulation function.
    * Example:
    ```java
    Optional<String> concatenated = stream.collect(Collectors.reducing((s1, s2) -> s1 + s2));
    ```

* **`reducing(T identity, BinaryOperator)`**:
    * Performs a reduction with an identity value and an associative function.
    * Example:
    ```java
    String result = stream.collect(Collectors.reducing("", String::concat));
    ```

## 5. **Partitioning Collectors**

* **`partitioningBy()`**:
    * Partitions the elements of the stream into two groups based on a predicate.
    * Example:
    ```java
    Map<Boolean, List<String>> partitioned = stream.collect(Collectors.partitioningBy(s -> s.length() > 3));
    ```

## 6. **Grouping Collectors**

* **`groupingBy()`**:
    * Groups the elements of the stream by a classifier function.
    * Example:
    ```java
    Map<Integer, List<String>> grouped = stream.collect(Collectors.groupingBy(String::length));
    ```

* **`groupingBy(Function, Collector)`**:
    * Groups by a classifier function and applies a downstream collector.
    * Example:
    ```java
    Map<Integer, Long> groupedCount = stream.collect(Collectors.groupingBy(String::length, Collectors.counting()));
    ```

## 7. **Mapping Collectors**

* **`mapping()`**:
    * Maps the elements before accumulating them.
    * Example:
    ```java
    List<Integer> lengths = stream.collect(Collectors.mapping(String::length, Collectors.toList()));
    ```

## 8. **Custom Collectors**

* You can create your own collector using the `Collector` interface, allowing for highly customized accumulation strategies.

## Summary

The `Collectors` class provides a rich set of functionalities to transform and gather stream data into various collection types or formats. These collectors can help you efficiently process and manipulate data in Java applications.


---

# `String Functions and Operations in Java`

Here's a comprehensive list of string functions and operations in Java, including methods for manipulation, comparison, searching, and conversion, along with brief descriptions:

## 1. String Creation
- **Using String Literal**: 
  ```java
  String str = "Hello";
  ```
- **Using `new` Keyword**: 
  ```java
  String str = new String("Hello");
  ```

## 2. Length and Character Access
- **`length()`**: Returns the length of the string.
  ```java
  int len = str.length();
  ```
- **`charAt(int index)`**: Returns the character at the specified index.
  ```java
  char ch = str.charAt(0); // 'H'
  ```

## 3. Substring Operations
- **`substring(int beginIndex)`**: Returns a substring from the specified index to the end.
  ```java
  String subStr = str.substring(2); // "llo"
  ```
- **`substring(int beginIndex, int endIndex)`**: Returns a substring from the specified range.
  ```java
  String subStr = str.substring(0, 2); // "He"
  ```

## 4. String Manipulation
- **`concat(String str)`**: Concatenates the specified string to the end.
  ```java
  String newStr = str.concat(" World"); // "Hello World"
  ```
- **`trim()`**: Removes leading and trailing whitespace.
  ```java
  String trimmed = str.trim();
  ```
- **`replace(char oldChar, char newChar)`**: Replaces occurrences of a character.
  ```java
  String replaced = str.replace('l', 'p'); // "Heppo"
  ```
- **`replace(CharSequence target, CharSequence replacement)`**: Replaces occurrences of a sequence.
  ```java
  String replaced = str.replace("Hello", "Hi"); // "Hi"
  ```
- **`toLowerCase()`**: Converts all characters to lowercase.
  ```java
  String lower = str.toLowerCase(); // "hello"
  ```
- **`toUpperCase()`**: Converts all characters to uppercase.
  ```java
  String upper = str.toUpperCase(); // "HELLO"
  ```

## 5. Searching
- **`indexOf(char ch)`**: Returns the index of the first occurrence of the specified character.
  ```java
  int index = str.indexOf('l'); // 2
  ```
- **`indexOf(String str)`**: Returns the index of the first occurrence of the specified substring.
  ```java
  int index = str.indexOf("ll"); // 2
  ```
- **`lastIndexOf(char ch)`**: Returns the index of the last occurrence of the specified character.
  ```java
  int lastIndex = str.lastIndexOf('l'); // 3
  ```
- **`lastIndexOf(String str)`**: Returns the index of the last occurrence of the specified substring.
  ```java
  int lastIndex = str.lastIndexOf("l"); // 3
  ```
- **`contains(CharSequence sequence)`**: Checks if the string contains the specified sequence.
  ```java
  boolean hasSubstr = str.contains("lo"); // true
  ```

## 6. String Comparison
- **`equals(Object anObject)`**: Compares two strings for equality.
  ```java
  boolean isEqual = str.equals("Hello"); // true
  ```
- **`equalsIgnoreCase(String anotherString)`**: Compares two strings, ignoring case considerations.
  ```java
  boolean isEqual = str.equalsIgnoreCase("hello"); // true
  ```
- **`compareTo(String anotherString)`**: Compares two strings lexicographically.
  ```java
  int result = str.compareTo("Hello"); // 0
  ```
- **`compareToIgnoreCase(String str)`**: Compares two strings lexicographically, ignoring case.
  ```java
  int result = str.compareToIgnoreCase("hello"); // 0
  ```

## 7. String Splitting
- **`split(String regex)`**: Splits the string around matches of the given regular expression.
  ```java
  String[] parts = str.split(" "); // ["Hello"]
  ```
- **`split(String regex, int limit)`**: Splits the string, limiting the number of splits.
  ```java
  String[] parts = str.split(" ", 2); // ["Hello"]
  ```

## 8. Conversion
- **`toCharArray()`**: Converts the string to a new character array.
  ```java
  char[] charArray = str.toCharArray();
  ```
- **`valueOf(Object obj)`**: Returns the string representation of the object.
  ```java
  String strObj = String.valueOf(123); // "123"
  ```

## 9. Formatting
- **`format(String format, Object... args)`**: Returns a formatted string using the specified format string and arguments.
  ```java
  String formatted = String.format("Hello %s", "World"); // "Hello World"
  ```

## 10. String Joining
- **`join(CharSequence delimiter, CharSequence... elements)`**: Joins the provided elements into a single string with the specified delimiter.
  ```java
  String joined = String.join(", ", "a", "b", "c"); // "a, b, c"
  ```

## 11. StringBuilder and StringBuffer
- **`StringBuilder` and `StringBuffer`**: Used for mutable strings; allow for modification without creating new string objects.
  ```java
  StringBuilder sb = new StringBuilder("Hello");
  sb.append(" World"); // "Hello World"
  ```

## 12. Regular Expressions
- **`matches(String regex)`**: Checks if the string matches the given regular expression.
  ```java
  boolean matches = str.matches("Hello.*"); // true
  ```

## 13. Conversion to Other Data Types
- **Storing in Collections**: 
  - **List**: 
    ```java
    List<String> list = new ArrayList<>();
    list.add(str);
    ```
  - **Set**: 
    ```java
    Set<String> set = new HashSet<>();
    set.add(str);
    ```

## Summary
This list covers the essential functions and operations you can perform on strings in Java. Strings are immutable in Java, meaning that any modifications create a new string instance, which is important to keep in mind when working with them.


---

# Logic Section
- `Logic` -  Split the timestamp string "1:10:20" into hours, minutes, and seconds

```java
public class Main {
    public static void main(String[] args) {
        String timestamp = "1:10:20";
        String[] timeParts = timestamp.split(":");
        
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int seconds = Integer.parseInt(timeParts[2]);
        
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
```
Or

```java
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        // time stamp should be in the following format only;
        String timestamp = "01:10:20";
        
        try {
            LocalTime time = LocalTime.parse(timestamp);
            int hours = time.getHour();
            int minutes = time.getMinute();
            int seconds = time.getSecond();
            
            System.out.println("Hours: " + hours);
            System.out.println("Minutes: " + minutes);
            System.out.println("Seconds: " + seconds);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid time format: " + e.getMessage());
        }
    }
}
```


