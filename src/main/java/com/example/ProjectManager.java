package com.example;

public class ProjectManager {
    public static double calculateDiscount(double originalPrice, double discountPercent) {
       if (originalPrice <= 0 || discountPercent < 0 || discountPercent > 100) {
           throw new IllegalArgumentException("Invalid input values.");
       }
       double discountAmount = (originalPrice * discountPercent) / 100;
       return originalPrice - discountAmount;
   }


   public static void main(String[] args) {
       double originalPrice = 150.0;
       double discountPercent = 20.0;
       double finalPrice = calculateDiscount(originalPrice, discountPercent);
       System.out.println("Final price after discount: $" + finalPrice);
   }
}

