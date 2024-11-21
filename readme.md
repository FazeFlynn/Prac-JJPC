
# Splitting a String with Space (" ") Delimiter and Storing It into an Array

### JavaScript:
```javascript
let numbers = ['1', '2', '3', '4'];
let squares = numbers.map(x => x * x);  // Output: [1, 4, 9, 16]
console.log(typeof squares)
```

#### Output
```
numbers = Array(4) ["1", "2", "3", "4"]
squares = Array(4) [1, 4, 9, 16]
"object"
```


### Java:
```java
String mystr = "hello this is java and idk";
String[] arr = mystr.split(" ");
System.out.println(arr instanceof Object);
Arrays.toString(arr)
```

#### Output
```
true
[hello, this, is, java, and, idk]
```

### Python:
```python
arr = list("Hello")

print(arr)
print(type(arr))
```
#### Output
```
['H', 'e', 'l', 'l', 'o']
<class 'list'>
```
<!-- 
#### C++ (using `istringstream`):
```cpp
std::istringstream iss(str);
std::vector<std::string> arr((std::istream_iterator<std::string>(iss)), std::istream_iterator<std::string>());
``` -->

---

# Storing the Characters of "Hello" in a Character Array

### JavaScript:
```javascript
let arr = "Hello".split('');
```

### Java:
```java
char[] arr = "Hello".toCharArray();
```

### Python:
```python
arr = list("Hello")
```

### C++:
```cpp
char arr[] = "Hello";
```

---

## Explanation for `arr = list("Hello")` in Python
In Python, the statement `arr = list("Hello")` is converting the string `"Hello"` into a list of characters.

### Breakdown:
- **`"Hello"`**: This is a string, which is essentially a sequence of characters.
- **`list()`**: This is a function in Python that converts the given iterable (like a string) into a list, where each element becomes a separate item in the list.

### What Happens:
- The string `"Hello"` is treated as a sequence of characters (`'H'`, `'e'`, `'l'`, `'l'`, `'o'`).
- The `list()` function breaks this sequence into its individual characters and places each character into a list.

After running this, `arr` will look like this:
```python
['H', 'e', 'l', 'l', 'o']
```

### Example:
```python
arr = list("Hello")
print(arr)
# Output: ['H', 'e', 'l', 'l', 'o']
```

This stores each character of `"Hello"` as a separate element in the list `arr`.


# Map, Filter and Reduce

### 1. **map**

**JavaScript:** The `map()` function creates a new array by applying a provided function to every element in the calling array.

```javascript
const numbers = [1, 2, 3, 4];
const squares = numbers.map(x => x * x);
console.log(squares); // Output: [1, 4, 9, 16]
```

**Java:** In Java, you can use streams to achieve similar functionality.

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

**Python:** You can use the built-in `map()` function.

```python
numbers = [1, 2, 3, 4]
squares = list(map(lambda x: x * x, numbers))
print(squares)  # Output: [1, 4, 9, 16]
```

<!-- **C++:** You can use the `<algorithm>` header with `std::transform()`.

```cpp
#include <iostream>
#include <vector>
#include <algorithm> 

int main() {
    std::vector<int> numbers = {1, 2, 3, 4};
    std::vector<int> squares(numbers.size()); 

    std::transform(numbers.begin(), numbers.end(), squares.begin(), [](int x) { return x * x; }); 

    for (int square : squares) {
        std::cout << square << " "; // Output: 1 4 9 16
    }
    return 0;
}
``` -->

---

### 2. **filter**

**JavaScript:** The `filter()` function creates a new array with all elements that pass the test implemented by the provided function.

```javascript
const numbers = [1, 2, 3, 4, 5];
const evens = numbers.filter(x => x % 2 === 0);
console.log(evens); // Output: [2, 4]
```

**Java:** Using streams in Java, you can filter elements similarly.

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors; 

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evens = numbers.stream()
                                      .filter(x -> x % 2 == 0)
                                      .collect(Collectors.toList());
        System.out.println(evens); // Output: [2, 4]
    }
}
```

**Python:** You can use the built-in `filter()` function.

```python
numbers = [1, 2, 3, 4, 5]
evens = list(filter(lambda x: x % 2 == 0, numbers))
print(evens)  # Output: [2, 4]
```

<!-- **C++:** You can use the `<algorithm>` header with `std::copy_if()`.

```cpp
#include <iostream>
#include <vector>
#include <algorithm> 

int main() {
    std::vector<int> numbers = {1, 2, 3, 4, 5};
    std::vector<int> evens; 

    std::copy_if(numbers.begin(), numbers.end(), std::back_inserter(evens), [](int x) { return x % 2 == 0; }); 

    for (int even : evens) {
        std::cout << even << " "; // Output: 2 4
    }
    return 0;
} 
```
-->

---

### 3. **reduce**

**JavaScript:** The `reduce()` function executes a reducer function on each element of the array, resulting in a single output value.

```javascript
const numbers = [1, 2, 3, 4];
const sum = numbers.reduce((acc, x) => acc + x, 0);
console.log(sum); // Output: 10
```

**Java:** Using streams, you can achieve similar functionality.

```java
import java.util.Arrays; 

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        int sum = Arrays.stream(numbers).reduce(0, (acc, x) -> acc + x);
        System.out.println(sum); // Output: 10
    }
}
```

**Python:** You can use the `functools.reduce()` function.

```python
from functools import reduce  

numbers = [1, 2, 3, 4]
sum = reduce(lambda acc, x: acc + x, numbers, 0)
print(sum)  # Output: 10
```

<!-- **C++:** You can use the `<numeric>` header with `std::accumulate()`.

```cpp
#include <iostream>
#include <vector>
#include <numeric> 

int main() {
    std::vector<int> numbers = {1, 2, 3, 4};
    int sum = std::accumulate(numbers.begin(), numbers.end(), 0);
    std::cout << sum; // Output: 10
    return 0;
}
``` -->

---

### Summary

- **map**: Transforms each element in an array.
- **filter**: Selects elements based on a condition.
- **reduce**: Reduces the array to a single value based on a specified operation.

These functions are integral to functional programming paradigms and are widely used in data manipulation across different programming languages.


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
    import java.util.Arrays;
    import java.util.List;
    import java.util.Map;
    import java.util.function.Function;
    import java.util.stream.Collectors;

    List<String> names = Arrays.asList("Alice", "Bob", "Charliesa", "id", "Even");
    // Map<Integer, String> map = names.stream().collect(Collectors.toMap(String::length, Function.identity())); // this will only work when value are not duplicate, keys should be unique
    Map<Integer, String> map = names.stream().collect(Collectors.toMap(String::length, Function.identity(),      // Value: the string itself
    (existing, replacement) -> existing)); // Keep the existing value if there is a duplicate
    ```
    Output
    ```
    {2=id, 3=Bob, 4=Even, 5=Alice, 9=Charliesa}
    ```


## 2. **Joining Collectors**

* **`joining()`**:
    * Concatenates the elements of the stream into a single `String`.
    * Example:
    ```java
    import java.util.Arrays;  
    import java.util.List;  
    import java.util.stream.Collectors;
    
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice");        
    String result = names.stream().collect(Collectors.joining("-"));
    ```

    `Output`
    ```
    Alice-Bob-Charlie-Alice
    ```

* **`joining(CharSequence delimiter)`**:
    * Concatenates the elements with a specified delimiter.
    * Example:
    ```java
    import java.util.Arrays;  
    import java.util.List;  
    import java.util.stream.Collectors;

    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice");        
    String result = names.stream().collect(Collectors.joining("-"));
    ```

* **`joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)`**:
    * Concatenates with a delimiter, prefix, and suffix.
    * Example:
    ```java
    String result = stream().collect(Collectors.joining(", ", "[", "]"));
    ```

## 3. **Summarization Collectors**

* **`counting()`**:
    * Counts the number of elements in the stream.
    * Example:
    ```java
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice");        
    long count = names.stream().collect(Collectors.counting());
    // Output - 4 
    ```



    `and`
    ```java
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "David", "Bob", "Alice");
    // Count the number of occurrences of each name using the counting() collector
    Map<String, Long> nameCount = names.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
    // Print the count of each name
    nameCount.forEach((name, count) -> System.out.println("Name: " + name + ", Count: " + count));
    ```
    Output

    ```
    Name: Bob, Count: 2
    Name: Alice, Count: 3
    Name: Charlie, Count: 1
    Name: David, Count: 1
    ```


* **`summarizingInt()`**:
    * Collects statistics, such as count, sum, min, average, and max, for an `int` field.
    * Example:
    ```java
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice");        
    IntSummaryStatistics stats = names.stream().collect(Collectors.summarizingInt(String::length));
    //Output - IntSummaryStatistics{count=4, sum=20, min=3, average=5.000000, max=7}
    ```
    `and`
    ```java
    Integer[] num = {1,2,3,4,5};
    List<Integer> nums = Arrays.asList(num);
    IntSummaryStatistics stats = nums.stream().collect(Collectors.summarizingInt(Integer::intValue));
    ```

* **`summarizingDouble()`**:
    * Similar to `summarizingInt()`, but for `double` fields.
    * Example:
    ```java
    Double[] num = {1.23,2.32,3.34,4.23,5.56};
    List<Double> nums = Arrays.asList(num);
    DoubleSummaryStatistics stats = nums.stream().collect(Collectors.summarizingDouble(Double::doubleValue));
    ```

* **`summarizingLong()`**:
    * Similar to `summarizingInt()`, but for `long` fields.
    * Example:
    ```java
    LongSummaryStatistics stats = stream().collect(Collectors.summarizingLong(Long::parseLong));
    ```

## 4. **Aggregation Collectors**

* **`reducing()`**:
    * Performs a reduction on the elements of the stream using an associative accumulation function.
    * Example:
    ```java
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice");
    Optional<String> concatenated = names.stream().collect(Collectors.reducing((s1, s2) -> s1 + s2));
    concatenated.ifPresent(result -> System.out.println("Concatenated String: " + result));
    // Output - Concatenated String: AliceBobCharlieAlice
    ```
    `for int`
    ```java
    List<Integer> nums = Arrays.asList(1,2,3,4,5);
    Optional<Integer> concatenated = nums.stream().collect(Collectors.reducing((s1, s2) -> s1  + s2));
    concatenated.ifPresent(result -> System.out.println("Concatenated String: " + result));
    ```


* **`reducing(T identity, BinaryOperator)`**:
    * Performs a reduction with an identity value and an associative function.
    * Example:
    ```java
    String result = names.stream().collect(Collectors.reducing("", String::concat));
    ```

## 5. **Partitioning Collectors**

* **`partitioningBy()`**:
    * Partitions the elements of the stream into two groups based on a predicate.
    * Example:
    ```java
    Map<Boolean, List<String>> partitioned = stream().collect(Collectors.partitioningBy(s -> s.length() > 3));
    ```

## 6. **Grouping Collectors**

* **`groupingBy()`**:
    * Groups the elements of the stream by a classifier function.
    * Example:
    ```java
    Map<Integer, List<String>> grouped = stream().collect(Collectors.groupingBy(String::length));
    ```

* **`groupingBy(Function, Collector)`**:
    * Groups by a classifier function and applies a downstream collector.
    * Example:
    ```java
    import java.util.Arrays;
    import java.util.List;
    import java.util.Map;
    import java.util.stream.Collectors;

    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
    // Grouping by the length of the string and counting occurrences
    Map<Integer, Long> groupedCount = names.stream()
            .collect(Collectors.groupingBy(String::length, Collectors.counting()));
    groupedCount.forEach((length, count) -> 
    System.out.println("Length: " + length + ", Count: " + count));
    ```
    Output
    ```
    Length: 3, Count: 2
    Length: 5, Count: 2
    Length: 7, Count: 1
    ```
    


## 7. **Mapping Collectors**

* **`mapping()`**:
    * Maps the elements before accumulating them.
    * Example:
    ```java
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
    List<Integer> lengths = names.stream().collect(Collectors.mapping(String::length, Collectors.toList()));
    ```

## 8. **Custom Collectors**

* You can create your own collector using the `Collector` interface, allowing for highly customized accumulation strategies.

## Summary

The `Collectors` class provides a rich set of functionalities to transform and gather stream data into various collection types or formats. These collectors can help you efficiently process and manipulate data in Java applications.




# Java Collection Declaration Examples

## `Lists`

### 1. Using `ArrayList`
```java
List<String> arrayList = new ArrayList<>();
List<String> arrayListWithValues = new ArrayList<>(Arrays.asList("A", "B", "C"));
```

### 2. Using `LinkedList`
```java
List<String> linkedList = new LinkedList<>();
List<String> linkedListWithValues = new LinkedList<>(Arrays.asList("A", "B", "C"));
```

### 3. Using `List.of` (Immutable List in Java 9+)
```java
List<String> immutableList = List.of("A", "B", "C");
```

### 4. Using `Arrays.asList` (Fixed-size List backed by an Array)
```java
List<String> fixedSizeList = Arrays.asList("A", "B", "C");
```

---

## `Sets`

### 1. Using `HashSet`
```java
Set<String> hashSet = new HashSet<>();
Set<String> hashSetWithValues = new HashSet<>(Arrays.asList("A", "B", "C"));
```

### 2. Using `LinkedHashSet`
```java
Set<String> linkedHashSet = new LinkedHashSet<>();
Set<String> linkedHashSetWithValues = new LinkedHashSet<>(Arrays.asList("A", "B", "C"));
```

### 3. Using `TreeSet` (Sorted Set)
```java
Set<String> treeSet = new TreeSet<>();
Set<String> treeSetWithValues = new TreeSet<>(Arrays.asList("A", "B", "C"));
```

### 4. Using `Set.of` (Immutable Set in Java 9+)
```java
Set<String> immutableSet = Set.of("A", "B", "C");
```

---

## `Maps`

### 1. Using `HashMap`
```java
Map<Integer, String> hashMap = new HashMap<>();
Map<Integer, String> hashMapWithValues = new HashMap<>(Map.of(1, "A", 2, "B", 3, "C"));
```

### 2. Using `LinkedHashMap`
```java
Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
Map<Integer, String> linkedHashMapWithValues = new LinkedHashMap<>(Map.of(1, "A", 2, "B", 3, "C"));
```

### 3. Using `TreeMap` (Sorted Map)
```java
Map<Integer, String> treeMap = new TreeMap<>();
Map<Integer, String> treeMapWithValues = new TreeMap<>(Map.of(1, "A", 2, "B", 3, "C"));
```

### 4. Using `Map.of` (Immutable Map in Java 9+)
```java
Map<Integer, String> immutableMap = Map.of(1, "A", 2, "B", 3, "C");
```

### 5. Using `Map.ofEntries` for Larger Maps (Java 9+)
```java
Map<Integer, String> largeImmutableMap = Map.ofEntries(
    Map.entry(1, "A"),
    Map.entry(2, "B"),
    Map.entry(3, "C"),
    Map.entry(4, "D")
);
```

---

Each of these options has specific use cases, performance characteristics, and limitations. Choose based on whether you need an ordered collection (e.g., `LinkedList`, `LinkedHashSet`), sorted collection (e.g., `TreeSet`, `TreeMap`), or immutability (e.g., `List.of`, `Map.of`).

---

## `Converting List to Set and other Collection Frameworks in Java`

```java
List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Apple");
Set<String> set = new HashSet<>(list);
System.out.println(set); // Output: [Apple, Banana, Cherry]
```

### 2. Using Java Streams (Java 8+) 
You can use the `stream()` method to convert a list to a set.

```java
List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Apple");
Set<String> set = list.stream().collect(Collectors.toSet());
System.out.println(set); // Output: [Apple, Banana, Cherry]
```
### 3. Using `Collectors.toCollection()`You can specify the type of set you want using `Collectors.toCollection()`.

```java
List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Apple");
Set<String> set = list.stream().collect(Collectors.toCollection(HashSet::new));
System.out.println(set); // Output: [Apple, Banana, Cherry]
```
### 4. Using a `TreeSet` for Sorted SetIf you want a sorted set, use `TreeSet`.

```java
List<String> list = Arrays.asList("Banana", "Apple", "Cherry", "Apple");
Set<String> set = new TreeSet<>(list);
System.out.println(set); // Output: [Apple, Banana, Cherry]
```
### 5. Using `LinkedHashSet` to Maintain OrderTo maintain the insertion order, use `LinkedHashSet`.

```java
List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Apple");
Set<String> set = new LinkedHashSet<>(list);
System.out.println(set); // Output: [Apple, Banana, Cherry]
```
### 6. Using a `for-each` Loop
Manually iterate through the list and add elements to the set.


```java
List<String> list = Arrays.asList("Apple", "Banana", "Cherry", "Apple");
Set<String> set = new HashSet<>();

for (String item : list) {
    set.add(item);
}

System.out.println(set); // Output: [Apple, Banana, Cherry]
```
---

# Priority Queues:

A **Priority Queue**  is a special type of queue in Java that orders elements based on their **natural ordering**  (for numbers, it will be smallest to largest by default) or based on a **custom comparator**  provided at the time of creation. It is part of the Java Collections Framework and implements the `Queue` interface.**Key Points:**  
1. **Heap-based Implementation:**  Priority Queue is internally implemented using a **binary heap** .
2. **Order of Elements:**  The head of the queue contains the **smallest**  element (for natural ordering) or the element with the **highest priority**  (for custom ordering).
3. **Null Elements Not Allowed:**  Priority Queue **does not permit null**  elements.
4. **Not Thread-Safe:**  It is not synchronized; if multiple threads are accessing it, consider using `PriorityBlockingQueue`.
5. **Insertion Time Complexity:**  `O(log n)` for adding elements.
6. **Access Time Complexity:**  `O(1)` for peeking the element at the head.
7. **Removal Time Complexity:**  `O(log n)` for removing elements.

**Basic Operations:**  
- `add(element)` or `offer(element)`: Insert an element into the queue.
- `peek()`: Retrieve, but do not remove, the head of the queue (returns `null` if the queue is empty).
- `poll()`: Retrieve and remove the head of the queue (returns `null` if the queue is empty).
- `remove(element)`: Remove a specific element from the queue.
- `isEmpty()`: Check if the queue is empty.
- `size()`: Get the size of the queue.

**Example 1: Basic Priority Queue (Natural Ordering)** 

```java
import java.util.PriorityQueue;

PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.add(10);
pq.add(5);
pq.add(20);
pq.add(1);

System.out.println("Priority Queue: " + pq);
// Peek the smallest element
System.out.println("Peek: " + pq.peek()); // Output: 1

// Poll (remove) the smallest element
System.out.println("Poll: " + pq.poll()); // Output: 1

System.out.println("Priority Queue after poll: " + pq);
```
**Output:** 

```yaml
Priority Queue: [1, 5, 20, 10]
Peek: 1
Poll: 1
Priority Queue after poll: [5, 10, 20]
```

**Explanation:**  
- The queue is automatically sorted in **ascending order** .
- `peek()` retrieves but does not remove the head (smallest element).
- `poll()` retrieves and removes the head.

**Example 2: Custom Ordering using Comparator (Descending Order)** 

```java
PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

pq.add(10);
pq.add(5);
pq.add(20);
pq.add(1);

System.out.println("Priority Queue: " + pq);
// Peek the largest element
System.out.println("Peek: " + pq.peek()); // Output: 20
// Poll (remove) the largest element
System.out.println("Poll: " + pq.poll()); // Output: 20

System.out.println("Priority Queue after poll: " + pq);
```
**Output:** 

```yaml
Priority Queue: [20, 10, 5, 1]
Peek: 20
Poll: 20
Priority Queue after poll: [10, 1, 5]
```
**Explanation:**  
- The queue is sorted in **descending order**  using a custom comparator (`Comparator.reverseOrder()`).
- The largest element is now the head of the queue.

**Example 3: Priority Queue with Custom Object (Task Scheduling)** 

```java
import java.util.PriorityQueue;
import java.util.Comparator;

class Task {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        // Custom comparator based on priority (lower number = higher priority)
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(Comparator.comparingInt(t -> t.priority));

        taskQueue.add(new Task("Task 1", 3));
        taskQueue.add(new Task("Task 2", 1));
        taskQueue.add(new Task("Task 3", 2));

        System.out.println("Task Queue: " + taskQueue);

        // Process tasks based on priority
        while (!taskQueue.isEmpty()) {
            System.out.println("Processing: " + taskQueue.poll());
        }
    }
}
```
**Output:** 

```arduino
Task Queue: [Task{name='Task 2', priority=1}, Task{name='Task 1', priority=3}, Task{name='Task 3', priority=2}]
Processing: Task{name='Task 2', priority=1}
Processing: Task{name='Task 3', priority=2}
Processing: Task{name='Task 1', priority=3}
```
**Explanation:**  
- A custom object `Task` is used with a priority.
- The queue processes tasks based on the priority (lower value = higher priority).

**Explanation:**  
- A custom object `Task` is used with a priority.
- The queue processes tasks based on the priority (lower value = higher priority).


**Example 4: Using `offer()` and `remove()` Methods** 

```java
import java.util.PriorityQueue;

PriorityQueue<String> pq = new PriorityQueue<>();

pq.offer("Apple");
pq.offer("Banana");
pq.offer("Cherry");

System.out.println("Priority Queue: " + pq);
// Remove a specific element
pq.remove("Banana");
System.out.println("After removing Banana: " + pq);

// Check the head element
System.out.println("Peek: " + pq.peek());

// Remove all elements
while (!pq.isEmpty()) {
    System.out.println("Poll: " + pq.poll());
}
```
**Output:** 

```yaml
Priority Queue: [Apple, Banana, Cherry]
After removing Banana: [Apple, Cherry]
Peek: Apple
Poll: Apple
Poll: Cherry
```
<!-- ================================================================================= -->

#### Difference between `.offer()` and `.add()`:

1. **Return Value:**  
    - `.offer()` returns a **boolean**  value (`true` if the element was successfully inserted, `false` otherwise).
    - `.add()` does not return a boolean; it throws an exception if the insertion fails.
 
2. **Exception Handling:**  
    - `.offer()` **does not throw an exception**  if the queue cannot accommodate the new element. Instead, it simply returns `false`.
    - `.add()` will throw an **`.add()` will throw an `IllegalStateException`**  if the queue is full (for capacity-bounded queues like `ArrayBlockingQueue`).
 
3. **Preferred Usage:**  
    - `.offer()` is generally preferred when working with queues because it follows the **fail-safe**  pattern, returning `false` instead of throwing an exception.
    - `.add()` is used when you want to enforce strict insertion behavior and be notified immediately with an exception if the operation fails.





<!-- ================================================================================= -->



**Example 5: Priority Queue with Strings (Lexicographical Order)** 

```java
import java.util.PriorityQueue;

PriorityQueue<String> pq = new PriorityQueue<>();

pq.add("Orange");
pq.add("Apple");
pq.add("Banana");

System.out.println("Priority Queue: " + pq);

// Poll elements in lexicographical order
while (!pq.isEmpty()) {
    System.out.println(pq.poll());
}
```
**Output:** 

```mathematica
Priority Queue: [Apple, Orange, Banana]
Apple
Banana
Orange
```
**Conclusion:** 
- Priority Queues are versatile and can be customized with different comparators.
- They are efficient for scenarios requiring frequent access to the smallest/largest element.
- Be cautious of the order and behavior, as it is based on either **natural ordering**  or the **custom comparator**  provided.



<!-- =============================================================================== -->

### Use Cases of Priority Queue

<details>

<summary>Scenerios and Use Cases</summary>


**Scenarios Where Priority Queues Are Beneficial**  
1. **Task Scheduling:** 
    - When tasks need to be processed based on their priority instead of their arrival order.
    - Example: Scheduling tasks in an operating system where high-priority tasks are executed before low-priority tasks.
 
2. **Event Management in Simulations:** 
    - In simulations (e.g., network packet simulation), events are processed based on their priority or time of occurrence.
    - Example: Processing network packets where urgent packets are handled first.
 
3. **Merging K Sorted Arrays/Lists:** 
    - Priority Queues are efficient for merging multiple sorted arrays/lists.
    - Example: Given multiple sorted arrays, use a priority queue to extract the smallest elements across all arrays in sorted order.
 
4. **Finding Top K Elements:** 
    - When you need to find the top K smallest or largest elements in a dataset.
    - Example: Finding the top 10 trending hashtags on Twitter.
 
5. **Shortest Path Algorithms (Graph Algorithms):** 
    - Algorithms like Dijkstra’s and Prim’s use priority queues to extract the minimum distance node.
    - Example: Calculating the shortest route in a navigation system like Google Maps.
 
6. **Load Balancing:**
    - Efficient distribution of tasks or jobs based on priority.
    - Example: Distributing incoming requests to servers based on the server's current load.
 
7. **Data Compression (Huffman Coding):** 
    - Building a Huffman Tree for data compression uses a priority queue to repeatedly merge nodes with the smallest frequency.
    - Example: Compressing files in ZIP format.
 
8. **Real-Time Systems:** 
    - Handling time-sensitive tasks where the most critical tasks must be processed first.
    - Example: Flight control systems where high-priority signals are processed immediately.
 
9. **Cache Systems:** 
    - In Least Frequently Used (LFU) cache implementations, priority queues can help manage cache eviction based on frequency.
    - Example: Caching web pages based on access frequency.
 
10. **Job Scheduling in Multi-Threaded Environments:** 
    - Priority queues help assign jobs based on their priority to available worker threads.
    - Example: Scheduling jobs in a thread pool where critical jobs are given precedence.

**Use Cases of Priority Queues** 

**1. Dijkstra's Algorithm for Shortest Path** 
In graph theory, Dijkstra’s algorithm uses a priority queue to repeatedly extract the node with the smallest tentative distance.


```java
PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(Node::getDistance));
```

**2. Event Management in a Game Engine** 
In game development, events like enemy attacks or power-ups are often prioritized based on their importance or time of occurrence.


```java
PriorityQueue<Event> eventQueue = new PriorityQueue<>(Comparator.comparingLong(Event::getTimestamp));
```
**3. Merging K Sorted Arrays** 
Using a priority queue to merge K sorted arrays by repeatedly inserting the smallest element.


```java
PriorityQueue<Element> pq = new PriorityQueue<>(Comparator.comparingInt(Element::getValue));
```
**4. Real-Time Message Processing** 
In messaging systems (e.g., RabbitMQ), priority queues ensure that high-priority messages are delivered before low-priority ones.


```java
PriorityQueue<Message> messageQueue = new PriorityQueue<>(Comparator.comparingInt(Message::getPriority));
```
**5. Job Scheduling in Print Servers** 
In a print server, print jobs can be prioritized based on their size or user priority.


```java
PriorityQueue<PrintJob> printQueue = new PriorityQueue<>(Comparator.comparingInt(PrintJob::getPriority));
```
**Summary** 
Priority Queues are useful in scenarios where data elements need to be processed in a specific order based on their priority. They are widely used in

- Graph algorithms (Dijkstra’s, Prim’s)
- Task scheduling and load balancing
- Real-time processing systems
- Data compression (Huffman Coding)
- Caching strategies (LFU)

By using Priority Queues, you can efficiently handle data elements that require prioritized access, making them a versatile and powerful data structure in many applications.


</details>


<!-- ================================================================================ -->

---

# Fomatting Strings and Numbers

## `Java`

- `1. Using String.format() for numeric padding:`

```java
int num = 5;
String padded = String.format("%03d", num);  // Pads to length 3 with "0"
System.out.println(padded);  // Output: "005"
```

- `2. For string padding using String.format():`
```java
String str = "5";
String padded = String.format("%3s", str).replace(' ', '0');
System.out.println(padded);  // Output: "005"
```

- `Padding right For Strings in java`

```java
String str = "5";
String paddedStr = String.format("%-3s", str).replace(' ', '0');
System.out.println(paddedStr);  // Output: "500"
```

- `%`: This indicates that what follows is a format specifier.
- `0`: This is the padding character. The 0 means that the number should be padded with zeros.
- `3`: This specifies the width of the output. It ensures that the resulting string will be at least 3 characters long. If the number is shorter, it will be padded with zeros on the left.
- `d`: This stands for "decimal integer." It tells String.format() that the value being formatted is an integer.

## JavaScript

- `1. The .padStart() method pads the current string with another string (repeated, if needed) until the resulting string reaches the given length.`

```javascript
const str = "5";
const padded = str.padStart(3, "0");
console.log(padded);  // Output: "005"
```

## Python

- `1. Using zfill() for zero-padding in Strings:`

```python
num = "5"
padded = num.zfill(3)
print(padded)  # Output: "005"
```

- `2. Using str.format() or f-strings for flexible padding:`

```python
num = 5
padded = "{:03}".format(num)  # Pads with zeros to length 3
print(padded)  # Output: "005"
```

- `3. Or using f-strings:`

```python
num = 5
padded = f"{num:03}"  # Pads with zeros to length 3
print(padded)  # Output: "005"
```

- `Padding Right for Strings in Python`

```python
str = "5"
padded_str = str.ljust(3, '0')
print(padded_str)  # Output: "500"
```

## `Converting Strings to Numbers`

## Java

```java
String str = "42";
int num = Integer.parseInt(str); // returns int value
System.out.println(num);  // Output: 42
```

`or`

```java
String str = "42";
Integer num = Integer.valueOf(str); // returns Integer Object
System.out.println(num);  // Output: 42
```

## Javascript

```javascript
const str = "42";
const num = Number(str);
console.log(num);  // Output: 42
```
`or`

```javascript
const str = "42";
const num = parseInt(str, 10);  // 10 is the radix for decimal
console.log(num);  // Output: 42
```

## Python
```python
str_num = "42"
num = int(str_num)
print(num)  # Output: 42
```
## `Type Casting and Conversion in java`

```java
String fname = "Faze";
String lname = "FLynn";
int age = 21;
double gpa = 1.2;
String full_name = fname + " " + lname + " " + Integer.toString(age) + " " + Double.toString(gpa) + " " + String.valueOf(age) +" " + age;
full_name;
```
```
Faze FLynn 21 1.2 21 21
```




`-----------------------------------------`
---
---


# Logic Section

- ## Logic - Achieve the Following Output:

```
Input - my name is ashwini borla
Output - ym alrob eman iniwhsa si
```

- To achieve the output, you need to reverse each word in the sentence and then reverse the entire sentence. Here's the code in Java.

### `java`
```java
String Gibberish(String str){

    String[] words = str.split(" ");
    int len = words.length;

    int left = 0;
    int right = len - 1;
    boolean wasLeft = false;

    StringBuilder result = new StringBuilder();    

    while(left <= right) {
        if (!wasLeft){
            result.append(new StringBuilder(words[left++]).reverse().toString() + " ");
            wasLeft = true;
        } else {
            result.append(new StringBuilder(words[right--]).reverse().toString() + " ");
            wasLeft = false;
        }        
    }

    return result.toString().trim();
}

String str = "my name is ashwini borla";
System.out.println(Gibberish(str));
```

#### Other Output - `borla ashwini is name my`:

- To achieve the output, you need to reverse each word in the sentence and then reverse the entire sentence. Here's the code in Java, Python, and JavaScript.

### **Java Solution**
```java
public static String reverseSentence(String sentence) {
    String[] words = sentence.split(" ");
    StringBuilder result = new StringBuilder();

    // Reverse each word and append it
    for (String word : words) {
        result.append(new StringBuilder(word).reverse()).append(" ");
    }

    // Reverse the entire sentence
    return result.reverse().toString().trim();
}

String input = "my name is ashwini borla";
System.out.println(reverseSentence(input));
```

**Output:**
```
borla ashwini is name my
```


### **Python Solution**
```python
def reverse_sentence(sentence):
    words = sentence.split()
    reversed_words = [word[::-1] for word in words]
    reversed_sentence = " ".join(reversed_words)
    return reversed_sentence[::-1]

input_string = "my name is ashwini borla"
output = reverse_sentence(input_string)
print(output)
```

**Output:**
```
borla ashwini is name my
```

### **JavaScript Solution**
```javascript
function reverseSentence(sentence) {
    const words = sentence.split(" ");
    const reversedWords = words.map(word => word.split("").reverse().join(""));
    const reversedSentence = reversedWords.join(" ").split("").reverse().join("");
    return reversedSentence;
}

const input = "my name is ashwini borla";
console.log(reverseSentence(input));
```

**Output:**
```
borla ashwini is name my
```

### **Explanation:**
1. Split the sentence into words.
2. Reverse each word individually.
3. Join the reversed words back into a sentence.
4. Reverse the entire sentence.

This approach handles the problem efficiently and ensures that the sentence and words are reversed as required.


[Want to see the question again](#java-4)
<!-- [Want to see the question again](https://github.com/FazeFlynn/Prac-JJPC/tree/main?tab=readme-ov-file#java-4) -->


<!-- ============================================================= -->
---


- ## `Logic` -  Split the timestamp string "1:10:20" into hours, minutes, and seconds

### Java
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

### JavaScript
```javascript
const timestamp = "1:10:20";
const [hours, minutes, seconds] = timestamp.split(':').map(Number);

console.log(`Hours: ${hours}`);
console.log(`Minutes: ${minutes}`);
console.log(`Seconds: ${seconds}`);
```

### Python
```python
timestamp = "1:10:20"
hours, minutes, seconds = map(int, timestamp.split(':'))

print(f"Hours: {hours}")
print(f"Minutes: {minutes}")
print(f"Seconds: {seconds}")
```

# Binary Of Numbers:

## `Javascript` - To find Binary of a number
```javascript
let num = 2;
let str = (num).toString(2).padStart(5,0);
console.log(str); // 00010
```

## `Java` - To Find Binary of a number
```java
int num = 2;
String binaryStr = Integer.toBinaryString(num);
String formatted = String.format("%5s",binaryStr).replace(" ", "0");
System.out.println(formatted); // Output: "00010"
```

## `Python` - To Find Binary of a number
```python
num = 2
binary_str = bin(num)[2:]  #  Slices off the '0b' prefix, Original - "0b10"
formatted = binary_str.zfill(5)
print(binary_str)  # Output: "00010"
```

# Binary of the Characters
### `Firsly find the ASCII value then convert the ASCII value into Binary:`

#### `Java`

```java
char character = 'A';
int asciiValue = (int) character;
String binaryString = Integer.toBinaryString(asciiValue);
System.out.println(binaryString); // Output: 1000001
```
#### `Javascript`
```javascript
let character = 'A';
let asciiValue = character.charCodeAt(0);
let binaryString = asciiValue.toString(2);
console.log(binaryString); // Output: 1000001
```
#### `Python`
```python
character = 'A'
ascii_value = ord(character)
binary_string = bin(ascii_value)[2:]  # Remove the '0b' prefix
print(binary_string)  # Output: 1000001
```

# `ASCII Values`

#### `Java`
```java
char ch = ' ';
int asciiValue = (int) ch;
asciiValue; // 32
```

#### `Javascript`
```javascript
let ch = ' ';
let asciiValue = ch.charCodeAt(0);
console.log(asciiValue);  // Output: 32
```

#### `Python`
```python
ch = ' '
ascii_value = ord(ch)
print(ascii_value)  # Output: 32
```

# ASCII Values Table of Characters:

| Character | ASCII Value |
|-----------|-------------|
| NUL       | 0           |
| SOH       | 1           |
| STX       | 2           |
| ETX       | 3           |
| EOT       | 4           |
| ENQ       | 5           |
| ACK       | 6           |
| BEL       | 7           |
| BS        | 8           |
| TAB       | 9           |
| LF        | 10          |
| VT        | 11          |
| FF        | 12          |
| CR        | 13          |
| SO        | 14          |
| SI        | 15          |
| DLE       | 16          |
| DC1       | 17          |
| DC2       | 18          |
| DC3       | 19          |
| DC4       | 20          |
| NAK       | 21          |
| SYN       | 22          |
| ETB       | 23          |
| CAN       | 24          |
| EM        | 25          |
| SUB       | 26          |
| ESC       | 27          |
| FS        | 28          |
| GS        | 29          |
| RS        | 30          |
| US        | 31          |
| SPACE     | 32          |
| !         | 33          |
| "         | 34          |
| #         | 35          |
| $         | 36          |
| %         | 37          |
| &         | 38          |
| '         | 39          |
| (         | 40          |
| )         | 41          |
| *         | 42          |
| +         | 43          |
| ,         | 44          |
| -         | 45          |
| .         | 46          |
| /         | 47          |
| 0         | 48          |
| 1         | 49          |
| 2         | 50          |
| 3         | 51          |
| 4         | 52          |
| 5         | 53          |
| 6         | 54          |
| 7         | 55          |
| 8         | 56          |
| 9         | 57          |
| :         | 58          |
| ;         | 59          |
| <         | 60          |
| =         | 61          |
| >         | 62          |
| ?         | 63          |
| @         | 64          |
| A         | 65          |
| B         | 66          |
| C         | 67          |
| D         | 68          |
| E         | 69          |
| F         | 70          |
| G         | 71          |
| H         | 72          |
| I         | 73          |
| J         | 74          |
| K         | 75          |
| L         | 76          |
| M         | 77          |
| N         | 78          |
| O         | 79          |
| P         | 80          |
| Q         | 81          |
| R         | 82          |
| S         | 83          |
| T         | 84          |
| U         | 85          |
| V         | 86          |
| W         | 87          |
| X         | 88          |
| Y         | 89          |
| Z         | 90          |
| [         | 91          |
| \         | 92          |
| ]         | 93          |
| ^         | 94          |
| _         | 95          |
| `         | 96          |
| a         | 97          |
| b         | 98          |
| c         | 99          |
| d         | 100         |
| e         | 101         |
| f         | 102         |
| g         | 103         |
| h         | 104         |
| i         | 105         |
| j         | 106         |
| k         | 107         |
| l         | 108         |
| m         | 109         |
| n         | 110         |
| o         | 111         |
| p         | 112         |
| q         | 113         |
| r         | 114         |
| s         | 115         |
| t         | 116         |
| u         | 117         |
| v         | 118         |
| w         | 119         |
| x         | 120         |
| y         | 121         |
| z         | 122         |
| {         | 123         |
| \|        | 124         |
| }         | 125         |
| ~         | 126         |
| DEL       | 127         |

---

# Default Values of All Data Types in Java:

| Data Type      | Default Value |
| -------------- | ------------- |
| `byte`         | `0`           |
| `short`        | `0`           |
| `int`          | `0`           |
| `long`         | `0L`          |
| `float`        | `0.0f`        |
| `double`       | `0.0d`        |
| `char`         | `'\u0000'` (null character) |
| `boolean`      | `false`       |
| `String` (or any object) | `null`       |

---

# Tricky Questions Section

Here are some tricky coding challenges that will help you sharpen your logical thinking and deepen your understanding of Java, Python, and JavaScript. These problems focus on various topics like string manipulation, recursion, data structures, and algorithmic challenges.

### 1. **Reverse Only Letters in a String**
Given a string, reverse only the letters while keeping the non-letter characters in their original positions.

**Example:**
- Input: `"a-bC-dEf-ghIj"`
- Output: `"j-Ih-gfE-dCba"`



### Solution: Reverse Only Letters in a String
Given a string, reverse only the alphabetic characters while keeping non-letter characters in their original positions.

### Optimized Approach:
The most efficient way to solve this problem is to use a two-pointer technique:
- One pointer starts from the beginning (`left`).
- The other pointer starts from the end (`right`).
- Swap only if both pointers point to alphabetic characters.
- Move the pointers accordingly (increment `left` and decrement `right`).

This approach has a time complexity of **O(n)**, where `n` is the length of the string, because each character is processed at most once.

### Java Solution:
```java
public static String reverseOnlyLetters(String s) {
    char[] chars = s.toCharArray();
    int left = 0, right = s.length() - 1;
    while (left < right) {
        if (!Character.isLetter(chars[left])) {
            left++;
        } else if (!Character.isLetter(chars[right])) {
            right--;
        } else {
            // Swap letters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
    return new String(chars);
}

String input = "a-bC-dEf-ghIj";
System.out.println(reverseOnlyLetters(input)); // Output: "j-Ih-gfE-dCba"
```

### JavaScript Solution:
```javascript
function reverseOnlyLetters(s) {
    const arr = s.split('');
    let left = 0, right = s.length - 1;

    while (left < right) {
        if (!/[a-zA-Z]/.test(arr[left])) {
            left++;
        } else if (!/[a-zA-Z]/.test(arr[right])) {
            right--;
        } else {
            // Swap letters
            [arr[left], arr[right]] = [arr[right], arr[left]];
            left++;
            right--;
        }
    }
    return arr.join('');
}

// Example usage:
const input = "a-bC-dEf-ghIj";
console.log(reverseOnlyLetters(input)); // Output: "j-Ih-gfE-dCba"
```

### Python Solution:
```python
def reverse_only_letters(s: str) -> str:
    chars = list(s)
    left, right = 0, len(s) - 1

    while left < right:
        if not chars[left].isalpha():
            left += 1
        elif not chars[right].isalpha():
            right -= 1
        else:
            # Swap letters
            chars[left], chars[right] = chars[right], chars[left]
            left += 1
            right -= 1

    return ''.join(chars)

# Example usage:
input_str = "a-bC-dEf-ghIj"
print(reverse_only_letters(input_str)) # Output: "j-Ih-gfE-dCba"
```

### Explanation:
1. **Two-pointer technique** ensures we process the string in a single pass, making the solution efficient.
2. **Character checks** (`isLetter`, `[a-zA-Z]`, and `isalpha()`) ensure that non-alphabetic characters remain in their original positions.
3. **Swapping** the characters using temporary variables or destructuring helps reverse the alphabetic characters.

This approach is efficient and works well for all edge cases, including strings with special characters, digits, and mixed cases.



---



### 2. **Find Longest Substring Without Repeating Characters**
Given a string, find the length of the longest substring without repeating characters.

**Example:**
- Input: `"abcabcbb"`
- Output: `3` (The answer is `"abc"`)

### 3. **Spiral Matrix**
Given a 2D array, return the elements of the array in a spiral order.

**Example:**
- Input:
  ```
  [[1, 2, 3],
   [4, 5, 6],
   [7, 8, 9]]
  ```
- Output: `[1, 2, 3, 6, 9, 8, 7, 4, 5]`

### 4. **Find Missing Number**
Given an array of integers from `1` to `n` with one number missing, find the missing number.

**Example:**
- Input: `[1, 2, 4, 5, 6]`
- Output: `3`

### 5. **Permutations of a String**
Write a program to generate all permutations of a given string.

**Example:**
- Input: `"ABC"`
- Output: `["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]`

### 6. **Merge Intervals**
Given a list of intervals, merge all overlapping intervals.

**Example:**
- Input: `[[1, 3], [2, 6], [8, 10], [15, 18]]`
- Output: `[[1, 6], [8, 10], [15, 18]]`

### 7. **Next Greater Element**
Given an array of integers, find the next greater element for each element in the array. If there is no greater element, return `-1`.

**Example:**
- Input: `[4, 5, 2, 10]`
- Output: `[5, 10, 10, -1]`

### 8. **Find the First Non-Repeating Character**
Given a string, find the first non-repeating character.

**Example:**
- Input: `"swiss"`
- Output: `"w"`

### 9. **Matrix Rotation**
Rotate a given `n x n` matrix by 90 degrees clockwise.

**Example:**
- Input:
  ```
  [[1, 2, 3],
   [4, 5, 6],
   [7, 8, 9]]
  ```
- Output:
  ```
  [[7, 4, 1],
   [8, 5, 2],
   [9, 6, 3]]
  ```

### 10. **Valid Parentheses**
Given a string containing only the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid.

**Example:**
- Input: `"()[]{}"`
- Output: `true`

- Input: `"(]"`
- Output: `false`

### 11. **Largest Rectangle in Histogram**
Given an array of integers representing the heights of bars in a histogram, find the area of the largest rectangle that can be formed.

**Example:**
- Input: `[2, 1, 5, 6, 2, 3]`
- Output: `10`

### 12. **Trapping Rain Water**
Given `n` non-negative integers representing the height of bars, find how much water can be trapped after raining.

**Example:**
- Input: `[0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]`
- Output: `6`

### 13. **Find the Longest Palindromic Substring**
Given a string, find the longest palindromic substring.

**Example:**
- Input: `"babad"`
- Output: `"bab"` or `"aba"`

### 14. **Convert Roman Numerals to Integer**
Given a Roman numeral, convert it to an integer.

**Example:**
- Input: `"IX"`
- Output: `9`

- Input: `"LVIII"`
- Output: `58`

### 15. **Generate Parentheses**
Given `n` pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

**Example:**
- Input: `n = 3`
- Output: `["((()))", "(()())", "(())()", "()(())", "()()()"]`

### 16. **Zigzag Conversion**
Convert a string into a zigzag pattern and read it row by row.

**Example:**
- Input: `"PAYPALISHIRING"`, `numRows = 3`
- Output: `"PAHNAPLSIIGYIR"`

### 17. **Reorder Log Files**
Given an array of logs, reorder the logs so that all letter-logs come before digit-logs. Letter-logs are sorted lexicographically.

**Example:**
- Input: `["dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"]`
- Output: `["let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"]`

### 18. **Word Ladder**
Given two words (`beginWord` and `endWord`) and a dictionary of words, find the length of the shortest transformation sequence.

**Example:**
- Input: `beginWord = "hit"`, `endWord = "cog"`, `wordList = ["hot", "dot", "dog", "lot", "log", "cog"]`
- Output: `5`

### 19. **Product of Array Except Self**
Given an array, return an array where each element is the product of all elements except itself.

**Example:**
- Input: `[1, 2, 3, 4]`
- Output: `[24, 12, 8, 6]`

### 20. **Find the Median of Two Sorted Arrays**
Given two sorted arrays, find the median of the combined sorted array.

**Example:**
- Input: `nums1 = [1, 3]`, `nums2 = [2]`
- Output: `2.0`


### 21. **Subarray with Given Sum**
Given an unsorted array of non-negative integers, find a subarray that adds up to a given sum.

**Example:**
- Input: `arr = [1, 4, 20, 3, 10, 5]`, `sum = 33`
- Output: Subarray `[20, 3, 10]`

### 22. **Find the Majority Element**
Given an array of integers, find the majority element (the element that appears more than `n/2` times).

**Example:**
- Input: `[3, 2, 3]`
- Output: `3`

### 23. **Count Inversions in an Array**
An inversion is a pair of elements where the first element is greater than the second element but appears before it in the array. Find the total number of inversions.

**Example:**
- Input: `[2, 4, 1, 3, 5]`
- Output: `3` (Inversions: `(2, 1)`, `(4, 1)`, `(4, 3)`)

### 24. **First Missing Positive**
Given an unsorted integer array, find the smallest missing positive integer.

**Example:**
- Input: `[3, 4, -1, 1]`
- Output: `2`

### 25. **Merge K Sorted Lists**
Given `k` sorted linked lists, merge them into one sorted linked list.

**Example:**
- Input: `lists = [[1, 4, 5], [1, 3, 4], [2, 6]]`
- Output: `[1, 1, 2, 3, 4, 4, 5, 6]`

### 26. **Game of Life**
Implement the "Game of Life," a cellular automaton where each cell lives, dies, or is born based on its neighbors.

**Example:**
- Input:
  ```
  [[0, 1, 0],
   [0, 0, 1],
   [1, 1, 1],
   [0, 0, 0]]
  ```
- Output:
  ```
  [[0, 0, 0],
   [1, 0, 1],
   [0, 1, 1],
   [0, 1, 0]]
  ```

### 27. **Largest Palindromic Subsequence**
Given a string, find the length of the longest palindromic subsequence.

**Example:**
- Input: `"bbbab"`
- Output: `4` (The subsequence is `"bbbb"`)

### 28. **Container With Most Water**
Given `n` vertical lines on a graph, find two lines that together with the x-axis form a container that holds the most water.

**Example:**
- Input: `[1, 8, 6, 2, 5, 4, 8, 3, 7]`
- Output: `49`

### 29. **Sliding Window Maximum**
Given an array and an integer `k`, find the maximum value in each sliding window of size `k`.

**Example:**
- Input: `arr = [1, 3, -1, -3, 5, 3, 6, 7]`, `k = 3`
- Output: `[3, 3, 5, 5, 6, 7]`

### 30. **Find the Longest Consecutive Sequence**
Given an unsorted array of integers, find the length of the longest consecutive sequence.

**Example:**
- Input: `[100, 4, 200, 1, 3, 2]`
- Output: `4` (The sequence is `[1, 2, 3, 4]`)

### 31. **Rotate an Array**
Given an array, rotate the array to the right by `k` steps.

**Example:**
- Input: `nums = [1, 2, 3, 4, 5, 6, 7]`, `k = 3`
- Output: `[5, 6, 7, 1, 2, 3, 4]`

### 32. **Minimum Window Substring**
Given two strings `s` and `t`, find the minimum window in `s` which contains all the characters of `t`.

**Example:**
- Input: `s = "ADOBECODEBANC"`, `t = "ABC"`
- Output: `"BANC"`

### 33. **3Sum Problem**
Find all unique triplets in an array that give the sum of zero.

**Example:**
- Input: `nums = [-1, 0, 1, 2, -1, -4]`
- Output: `[[-1, -1, 2], [-1, 0, 1]]`

### 34. **Longest Common Subsequence**
Given two strings, find the longest subsequence present in both strings.

**Example:**
- Input: `"abcde"`, `"ace"`
- Output: `3` (The subsequence is `"ace"`)

### 35. **Sudoku Solver**
Write a program to solve a Sudoku puzzle by filling the empty cells.

**Example:**
- Input:
  ```
  [["5","3",".",".","7",".",".",".","."],
   ["6",".",".","1","9","5",".",".","."],
   [".","9","8",".",".",".",".","6","."],
   ["8",".",".",".","6",".",".",".","3"],
   ["4",".",".","8",".","3",".",".","1"],
   ["7",".",".",".","2",".",".",".","6"],
   [".","6",".",".",".",".","2","8","."],
   [".",".",".","4","1","9",".",".","5"],
   [".",".",".",".","8",".",".","7","9"]]
  ```
- Output:
  ```
  [["5","3","4","6","7","8","9","1","2"],
   ["6","7","2","1","9","5","3","4","8"],
   ["1","9","8","3","4","2","5","6","7"],
   ["8","5","9","7","6","1","4","2","3"],
   ["4","2","6","8","5","3","7","9","1"],
   ["7","1","3","9","2","4","8","5","6"],
   ["9","6","1","5","3","7","2","8","4"],
   ["2","8","7","4","1","9","6","3","5"],
   ["3","4","5","2","8","6","1","7","9"]]
  ```

### 36. **Reverse Nodes in k-Group**
Given a linked list, reverse the nodes of the list `k` at a time.

**Example:**
- Input: `1 -> 2 -> 3 -> 4 -> 5`, `k = 3`
- Output: `3 -> 2 -> 1 -> 4 -> 5`

---

# Solved Questions For IntPrep

### Question 1: Write a code to reverse a number
```java
// Reverse a number
public class Main {
    public static void main(String[] args) {
        int number = 12345;
        int reversed = 0;
        
        while (number != 0) {
            int digit = number % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            number /= 10; // Remove last digit from the original number
        }
        
        System.out.println("Reversed Number: " + reversed);
    }
}
```

---

### Question 2: Write the code to find the Fibonacci series up to the nth term
```java
// Fibonacci series up to nth term
public class Main {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " "); // Print current term
            int next = a + b; // Calculate next term
            a = b;
            b = next;
        }
    }
}
```

---

### Question 3: Write code for Greatest Common Divisor
```java
// Find GCD using Euclidean algorithm
public class Main {
    public static void main(String[] args) {
        int a = 56, b = 98;
        
        while (b != 0) {
            int temp = b;
            b = a % b; // Remainder becomes the next divisor
            a = temp;
        }
        
        System.out.println("GCD: " + a);
    }
}
```

---

### Question 4: Write code for Perfect Number
```java
// Check if a number is a Perfect Number
public class Main {
    public static void main(String[] args) {
        int number = 28;
        int sum = 0;
        
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) { // Check for divisors
                sum += i;
            }
        }
        
        if (sum == number) {
            System.out.println(number + " is a Perfect Number");
        } else {
            System.out.println(number + " is not a Perfect Number");
        }
    }
}
```

---

### Question 5: Write code to Check if two strings are Anagram or not
```java
// Check if two strings are Anagrams
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = "listen", str2 = "silent";
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1); // Sort both strings
        Arrays.sort(arr2);
        
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are not Anagrams");
        }
    }
}
```

---

### Question 6: Write code to Check if the given string is a Palindrome or not
```java
// Check if a string is a Palindrome
public class Main {
    public static void main(String[] args) {
        String str = "madam";
        int left = 0, right = str.length() - 1;
        
        boolean isPalindrome = true;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        if (isPalindrome) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }
    }
}
```

---

### Question 7: Write code to Calculate frequency of characters in a string
```java
// Calculate frequency of characters
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String str = "hello";
        HashMap<Character, Integer> frequency = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1); // Increment count
        }
        
        System.out.println("Character Frequencies: " + frequency);
    }
}
```

---

### Question 8: Write code to check if two strings match where one string contains wildcard characters
```java
// String match with wildcard characters
public class Main {
    public static void main(String[] args) {
        String str = "abcdef";
        String pattern = "a*ef";
        System.out.println("Strings Match: " + isMatch(str, pattern));
    }
    
    public static boolean isMatch(String str, String pattern) {
        return str.matches(pattern.replace("*", ".*")); // Convert wildcard to regex and match
    }
}
```

---

### Question 9: Write a code for Bubble Sort
```java
// Bubble Sort implementation
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp; // Swap if out of order
                }
            }
        }
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
```

---

### Question 10: How is the Merge Sort algorithm implemented?
```java
// Merge Sort implementation
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid); // Sort left half
            mergeSort(arr, mid + 1, right); // Sort right half
            merge(arr, left, mid, right); // Merge sorted halves
        }
    }
    
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        
        for (int i = 0; i < n1; i++) leftArr[i] = arr[left + i];
        for (int i = 0; i < n2; i++) rightArr[i] = arr[mid + 1 + i];
        
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }
}
```
---

### Question 11: Write a code to check whether a given year is a leap year or not
```java
// Check Leap Year
public class Main {
    public static void main(String[] args) {
        int year = 2024;
        
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
```

---

### Question 12: Find non-repeating characters in a string
```java
// Find non-repeating characters
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String str = "swiss";
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();
        
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
```

---

### Question 13: Write a code to replace a substring in a string
```java
// Replace a substring
public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        String toReplace = "World";
        String replacement = "Java";
        
        String result = str.replace(toReplace, replacement);
        System.out.println(result);
    }
}
```

---

### Question 14: Write a code for Heap Sort
```java
// Heap Sort implementation
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        heapSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    public static void heapSort(int[] arr) {
        int n = arr.length;
        
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;
        
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}
```

---

### Question 15: Write a code to replace each element in an array by its rank in the array
```java
// Replace elements with their rank
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30};
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        HashMap<Integer, Integer> ranks = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            if (!ranks.containsKey(num)) {
                ranks.put(num, rank++);
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ranks.get(arr[i]);
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
```

---

### Question 16: Write a code to find circular rotation of an array by K positions
```java
// Circular rotation of an array
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        
        k %= arr.length; // Adjust if k > array length
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        
        System.out.println(Arrays.toString(arr));
    }
    
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
```

---

### Question 17: Write a code to find non-repeating elements in an array
```java
// Find non-repeating elements
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 4, 6, 7};
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        for (int num : arr) {
            if (freq.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }
}
```

---

### Question 18: Write a code to check for the longest palindrome in an array
```java
// Find longest palindrome in array
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {121, 344, 232, 454, 11};
        int longest = 0;
        
        for (int num : arr) {
            if (isPalindrome(num) && num > longest) {
                longest = num;
            }
        }
        
        System.out.println("Longest Palindrome: " + longest);
    }
    
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }
}
```

---

### Question 19: Write a code to find the factorial of a number
```java
// Find factorial of a number
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial: " + factorial);
    }
}
```

---

### Question 20: Write the code for Armstrong number
```java
// Check Armstrong number
public class Main {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num;
        int digits = String.valueOf(num).length();
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits); // Raise digit to the power of digits
            temp /= 10;
        }
        
        if (sum == num) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
    }
}
```

---

### Question 21: Write a program to find the sum of Natural Numbers using Recursion
```java
// Sum of Natural Numbers using Recursion
public class Main {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum: " + sumOfNaturalNumbers(n));
    }
    
    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) return 1; // Base case
        return n + sumOfNaturalNumbers(n - 1);
    }
}
```

---

### Question 22: Write a program to add Two Matrices using Multi-dimensional Array
```java
// Add Two Matrices
public class Main {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] mat2 = {{7, 8, 9}, {1, 2, 3}};
        int rows = mat1.length, cols = mat1[0].length;
        int[][] sum = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        
        for (int[] row : sum) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
```

---

### Question 23: Write a program to find the sum of Natural Numbers using Recursion
(Repeated question, same as Q21)

---

### Question 24: Write code to check if a String is palindrome or not
```java
// Check if String is Palindrome
public class Main {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str) ? "Palindrome" : "Not a Palindrome");
    }
    
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
```

---

### Question 25: Write a program for Binary to Decimal conversion
```java
// Binary to Decimal Conversion
public class Main {
    public static void main(String[] args) {
        String binary = "1011";
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }
        System.out.println("Decimal: " + decimal);
    }
}
```

---

### Question 26: Write a program to check whether a character is a vowel or consonant
```java
// Check if Character is Vowel or Consonant
public class Main {
    public static void main(String[] args) {
        char c = 'e';
        if ("AEIOUaeiou".indexOf(c) != -1) {
            System.out.println(c + " is a Vowel");
        } else {
            System.out.println(c + " is a Consonant");
        }
    }
}
```

---

### Question 27: Write a code to find an Automorphic number
```java
// Check Automorphic Number
public class Main {
    public static void main(String[] args) {
        int num = 25;
        int square = num * num;
        
        if (String.valueOf(square).endsWith(String.valueOf(num))) {
            System.out.println(num + " is an Automorphic Number");
        } else {
            System.out.println(num + " is not an Automorphic Number");
        }
    }
}
```

---

### Question 28: Write a code to Find the ASCII value of a character
```java
// Find ASCII Value of a Character
public class Main {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println("ASCII value of " + c + " is: " + (int) c);
    }
}
```

---

### Question 29: Write a code to Remove all characters from a string except alphabets
```java
// Remove all characters except alphabets
public class Main {
    public static void main(String[] args) {
        String str = "abc123!@#XYZ";
        String result = str.replaceAll("[^a-zA-Z]", "");
        System.out.println("Result: " + result);
    }
}
```

---

### Question 30: Write a code to Print the smallest element of the array
```java
// Find the Smallest Element in an Array
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};
        int smallest = arr[0];
        
        for (int num : arr) {
            if (num < smallest) smallest = num;
        }
        
        System.out.println("Smallest Element: " + smallest);
    }
}
```

---

### Question 31: Write a code to Reverse the elements of the array
```java
// Reverse Array Elements
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0, right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        
        for (int num : arr) System.out.print(num + " ");
    }
}
```

---

### Question 32: Write a code to Sort the elements of the array
```java
// Sort Array Elements
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr);
        for (int num : arr) System.out.print(num + " ");
    }
}
```

---

### Question 33: Write a code to Sort the elements of the array without `sort` method
```java
// Sort Array Without sort() Method (Bubble Sort)
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        for (int num : arr) System.out.print(num + " ");
    }
}
```

---

### Question 34: Write a code to Replace a Substring in a string
```java
// Replace Substring in String
public class Main {
    public static void main(String[] args) {
        String str = "Hello World!";
        String result = str.replace("World", "Java");
        System.out.println(result);
    }
}
```

---

### Question 35: Write a code to Remove space from a string
```java
// Remove Spaces from String
public class Main {
    public static void main(String[] args) {
        String str = "Hello World!";
        String result = str.replaceAll("\\s", "");
        System.out.println(result);
    }
}
```

---

### Question 36: Write a code to Count Inversions
```java
// Count Inversions
public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1};
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) count++;
            }
        }

        System.out.println("Inversions: " + count);
    }
}
```

---

### Question 37: Write a code to find consecutive largest subsequence
```java
// Find Consecutive Largest Subsequence
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 2, 20};
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;

        for (int num : arr) set.add(num);

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int currLen = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    currLen++;
                }

                maxLen = Math.max(maxLen, currLen);
            }
        }

        System.out.println("Longest Consecutive Sequence Length: " + maxLen);
    }
}
```

---

### Question 38: Write a Program to Find out the Sum of Digits of a Number
```java
// Sum of Digits of a Number
public class Main {
    public static void main(String[] args) {
        int num = 1234, sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of Digits: " + sum);
    }
}
```

---

### Question 39: Write a Program to Find out the Power of a Number
```java
// Power of a Number
public class Main {
    public static void main(String[] args) {
        int base = 2, exp = 3;
        int result = 1;

        while (exp > 0) {
            result *= base;
            exp--;
        }

        System.out.println("Power: " + result);
    }
}
```

---

### Question 40: Write a Program to Find out the Sum of Digits of a Number
(Repeated question, same as Q38)

---

### Question 41: Write a Program to Add Two Fractions
```java
// Add Two Fractions
public class Main {
    public static void main(String[] args) {
        int num1 = 1, den1 = 2; // Fraction 1: 1/2
        int num2 = 3, den2 = 4; // Fraction 2: 3/4

        int lcm = (den1 * den2) / gcd(den1, den2);
        int numerator = (num1 * (lcm / den1)) + (num2 * (lcm / den2));
        int gcd = gcd(numerator, lcm);

        System.out.println("Sum: " + (numerator / gcd) + "/" + (lcm / gcd));
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```

---

### Question 42: Write a Program to Find the Largest Element in an Array
```java
// Find Largest Element in Array
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 3};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
        }

        System.out.println("Largest Element: " + max);
    }
}
```

---

### Question 43: Write a Program to Find the Roots of a Quadratic Equation
```java
// Find Roots of Quadratic Equation
public class Main {
    public static void main(String[] args) {
        double a = 1, b = -7, c = 12; // Equation: x^2 - 7x + 12 = 0
        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: " + root1 + ", " + root2);
        } else {
            System.out.println("No Real Roots");
        }
    }
}
```

---

### Question 44: Write a Program to Find the Prime Factors of a Number
```java
// Find Prime Factors
public class Main {
    public static void main(String[] args) {
        int num = 56;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if (num > 1) System.out.print(num); // If num is still a prime number
    }
}
```

---

### Question 45: Write a Program to Convert Digits to Words
```java
// Convert Digits to Words
public class Main {
    public static void main(String[] args) {
        int num = 123;
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        String result = "";
        while (num > 0) {
            result = words[num % 10] + " " + result;
            num /= 10;
        }

        System.out.println("In Words: " + result.trim());
    }
}
```

---

### Question 46: Write a Program to Find the Factorial of a Number using Recursion
```java
// Factorial Using Recursion
public class Main {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial: " + factorial(num));
    }

    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }
}
```

---

### Question 47: Write a Program to Reverse an Array
```java
// Reverse an Array
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }

        for (int num : arr) System.out.print(num + " ");
    }
}
```

---

### Question 48: Write code to check if two strings match where one string contains wildcard characters
```java
// Match Strings with Wildcards
public class Main {
    public static void main(String[] args) {
        String str = "abcd";
        String pattern = "a*cd";

        System.out.println(isMatch(str, pattern));
    }

    public static boolean isMatch(String str, String pattern) {
        int s = 0, p = 0, starIdx = -1, match = 0;

        while (s < str.length()) {
            if (p < pattern.length() && (pattern.charAt(p) == '?' || pattern.charAt(p) == str.charAt(s))) {
                s++;
                p++;
            } else if (p < pattern.length() && pattern.charAt(p) == '*') {
                starIdx = p++;
                match = s;
            } else if (starIdx != -1) {
                p = starIdx + 1;
                s = ++match;
            } else {
                return false;
            }
        }

        while (p < pattern.length() && pattern.charAt(p) == '*') p++;

        return p == pattern.length();
    }
}
```

---

### Question 49: Write a Program to Find the Spiral Traversal of a Matrix
```java
// Spiral Traversal of a Matrix
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        spiralTraversal(matrix);
    }

    public static void spiralTraversal(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
```

---

### Question 50: Write a Program to Find Fibonacci Series using Recursion
```java
// Fibonacci Series Using Recursion
public class Main {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
```













---

$$
\Large \text{End Of File}
$$


## To add
```java
String result = str.replace(toReplace, replacement);

for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

  int[] sortedArr = arr.clone();


int digits = String.valueOf(num).length();


Math.pow(digit, digits);



// Binary to Decimal Conversion
public class Main {
    public static void main(String[] args) {
        String binary = "1011";
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal * 2 + (binary.charAt(i) - '0');
        }
        System.out.println("Decimal: " + decimal);
    }
}


//consonent or vowel check
char c = 'e';
if ("AEIOUaeiou".indexOf(c) != -1) {
    System.out.println(c + " is a Vowel");
} else {
    System.out.println(c + " is a Consonant");
}


String str = "abc123!@#XYZ";
String result = str.replaceAll("[^a-zA-Z]", "");


String str = "Hello World!";
String result = str.replaceAll("\\s", "");

    
    

public static int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}





// Add Two Fractions
public class Main {
    public static void main(String[] args) {
        int num1 = 1, den1 = 2; // Fraction 1: 1/2
        int num2 = 3, den2 = 4; // Fraction 2: 3/4

        int lcm = (den1 * den2) / gcd(den1, den2);
        int numerator = (num1 * (lcm / den1)) + (num2 * (lcm / den2));
        int gcd = gcd(numerator, lcm);

        System.out.println("Sum: " + (numerator / gcd) + "/" + (lcm / gcd));
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}




// Find Roots of Quadratic Equation
public class Main {
    public static void main(String[] args) {
        double a = 1, b = -7, c = 12; // Equation: x^2 - 7x + 12 = 0
        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: " + root1 + ", " + root2);
        } else {
            System.out.println("No Real Roots");
        }
    }
}


// Find Prime Factors
public class Main {
    public static void main(String[] args) {
        int num = 56;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if (num > 1) System.out.print(num); // If num is still a prime number
    }
}




return (n == 0) ? 1 : n * factorial(n - 1);







// Spiral Traversal of a Matrix
public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        spiralTraversal(matrix);
    }

    public static void spiralTraversal(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}





