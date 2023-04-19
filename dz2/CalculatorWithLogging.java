package dz2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculatorWithLogging {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double num1, num2, result;
    String operator;

    try {
      FileWriter writer = new FileWriter("log.txt", true);
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

      System.out.print("Enter first number: ");
      num1 = scanner.nextDouble();

      System.out.print("Enter operator (+, -, *, /): ");
      operator = scanner.next();

      System.out.print("Enter second number: ");
      num2 = scanner.nextDouble();

      switch (operator) {
        case "+":
          result = num1 + num2;
          break;
        case "-":
          result = num1 - num2;
          break;
        case "*":
          result = num1 * num2;
          break;
        case "/":
          result = num1 / num2;
          break;
        default:
          System.out.println("Invalid operator");
          return;
      }

      System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

      String logEntry = dtf.format(LocalDateTime.now()) + " - " + num1 + " " + operator + " " + num2 + " = " + result + "\n";
      writer.write(logEntry);

      writer.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}