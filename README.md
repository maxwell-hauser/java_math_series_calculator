# Math Series Calculator

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.9+-C71A36?style=flat&logo=apache-maven)
![License](https://img.shields.io/badge/License-MIT-blue?style=flat)
![Status](https://img.shields.io/badge/Status-Active-success?style=flat)

A Java Swing desktop application that calculates and displays sums of four common mathematical series with an intuitive graphical interface.

## ✨ Features

- **Sum of Natural Numbers**: 1 + 2 + 3 + ... + n
- **Sum of Cubes**: 1³ + 2³ + 3³ + ... + n³
- **Fractional Series**: 1/3 + 2/5 + 3/7 + ... + n/(2n+1)
- **Factorial Series**: 1/2! + 2/4! + 3/6! + ... + n/(2n)!
- Input validation with user-friendly dialogs
- Precise output formatting with appropriate decimal places
- Iterative factorial calculation (no recursion limits)
- Clean, responsive Swing GUI

## 📋 Requirements

- **JDK 21** (Temurin recommended)
- **Maven 3.9+**

## 🚀 Quick Start

### Using Maven (Recommended)

```powershell
# Build the project
mvn clean package

# Run the application
java -jar target/math-series-calculator-1.0.1.jar
```

### Without Maven

```powershell
# Compile
javac MathSeriesCalculator.java

# Run
java MathSeriesCalculator
```

## 📖 Usage

1. Launch the application
2. Select the series type from the dropdown menu
3. Enter a positive integer value for n
4. Click "Calculate" to see the result
5. The sum will be displayed with appropriate formatting

## 🏗️ Building from Source

```powershell
# Clone the repository
git clone https://github.com/maxwell-hauser/java_math_series_calculator.git
cd java_math_series_calculator

# Build with Maven
mvn clean install

# Run tests
mvn test
```

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Maxwell Hauser**

## 🤝 Contributing

Contributions, issues, and feature requests are welcome! Feel free to check the [issues page](https://github.com/maxwell-hauser/java_math_series_calculator/issues).
