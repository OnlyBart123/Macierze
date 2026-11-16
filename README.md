# Java Matrix Operations

A console-based Java utility implementing core 2D matrix algebra operations. The project demonstrates working with multidimensional arrays, static utility methods, dimension validation, and console output formatting.

## Features

- **Matrix Generation:** Dynamically creates $n \times n$ integer matrices populated with random values (`0–8`).
- **Matrix Transposition:** Computes the transpose of a square matrix (`trans`).
- **Arithmetic Operations:** Supports element-wise matrix addition (`dod`) and element-wise multiplication (`mno`) with dimension validation.
- **Determinant Calculation:** Computes matrix determinants (`wyz`) using the standard formula for $2 \times 2$ matrices and Sarrus' rule for $3 \times 3$ matrices.
- **Console Formatting:** Cleanly prints matrix states step-by-step to standard output (`druk`).

## Technologies Used

- **Java** (JDK 17+)
- **Java Standard Library** (`java.util.Random`)

## How to Run

1. Clone the repository:
   ```bash
   git clone [https://github.com/OnlyBart123/Macierze.git](https://github.com/OnlyBart123/Macierze.git)
   ```
2. Navigate to the `src` directory and compile the source file:
   ```bash
   javac Main.java
   ```
3. Run the application:
   ```bash
   java Main
   ```