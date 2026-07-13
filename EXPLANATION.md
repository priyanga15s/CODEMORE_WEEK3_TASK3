# Explanation of Java Concepts Used

## Objective

This program demonstrates how to create and use a **custom exception** in Java. It validates the user's age and throws an `InvalidAgeException` if the age is less than 18.

---

# 1. Custom Exception

A custom exception is a user-defined exception created by extending the `Exception` class.

Example:

```java
class InvalidAgeException extends Exception
```

This allows us to define application-specific error conditions.

---

# 2. Constructor

The constructor passes the error message to the parent `Exception` class.

```java
public InvalidAgeException(String message) {
    super(message);
}
```

The `super()` method calls the constructor of the `Exception` class.

---

# 3. throws Keyword

The `throws` keyword declares that a method may throw an exception.

```java
public static void validateAge(int age) throws InvalidAgeException
```

This informs the compiler that the method can throw an `InvalidAgeException`.

---

# 4. throw Keyword

The `throw` keyword is used to explicitly throw an exception.

```java
throw new InvalidAgeException("Age must be 18 or above.");
```

If the age is less than 18, the program creates and throws an `InvalidAgeException`.

---

# 5. try Block

The code that may generate an exception is placed inside the `try` block.

```java
try {
    validateAge(age);
}
```

---

# 6. catch Block

The `catch` block handles exceptions.

### Custom Exception

```java
catch (InvalidAgeException e)
```

Displays the custom error message.

### General Exception

```java
catch (Exception e)
```

Handles invalid input such as entering letters instead of numbers.

---

# 7. finally Block

The `finally` block always executes.

```java
finally {
    sc.close();
}
```

It is used to close the `Scanner` and release system resources.

---

# 8. Scanner Class

The `Scanner` class reads user input.

```java
Scanner sc = new Scanner(System.in);
```

Method used:

```java
nextInt()
```

Reads the user's age as an integer.

---

# Program Flow

1. Define the custom `InvalidAgeException` class.
2. Read the user's age.
3. Call the `validateAge()` method.
4. If the age is less than 18, throw an `InvalidAgeException`.
5. Catch and display the custom exception message.
6. Handle invalid input using a general exception.
7. Close the `Scanner`.
8. End the program.

---

# Java Concepts Covered

- Custom Exception
- Exception Class
- Inheritance
- Constructor
- `throw` Keyword
- `throws` Keyword
- try-catch-finally
- Scanner Class
- User Input
- Resource Management (`sc.close()`)
