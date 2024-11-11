
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

## `Logic` -  Split the timestamp string "1:10:20" into hours, minutes, and seconds

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


`this is example` - $
\Large H(S) = - p_{yes} \log_2(p_{yes}) - p_{no} \log_2(p_{no})
$



# **`End Of File`**
