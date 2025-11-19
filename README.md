# Math Series Calculator

A simple Java Swing app that calculates sums of common series:

- 1 + 2 + 3 + ... + n
- 1 + 8 + 27 + ... + n^3
- 1/3 + 2/5 + ... + n/(2n+1)
- 1/2! + 2/4! + ... + n/(2n)!

## Requirements
- JDK 21 (Temurin recommended)
- Maven 3.9+

## Run (without Maven)
```powershell
# From this folder
javac math_series_calculator.java
java math_series_calculator
```

## Build and run (Maven)
```powershell
# From this folder
mvn -DskipTests package
java -jar target/math-series-calculator-1.0.0.jar
```

## Notes
- Input validated (cancellable dialogs, n must be >= 1).
- Factorial computed iteratively to avoid recursion limits.
- Outputs formatted with appropriate precision.
- Line endings normalized via `.gitattributes` for cross-platform consistency.
