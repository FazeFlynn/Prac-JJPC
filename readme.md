
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
### `**In Javascript you can get the binary num of any num by:- **`
```javascript
(number).toString(2)
let str = (1).toString(2)
                        .padStart(5,0)
console.log(str) // 00001
```

