package ru.nsu.dolgushin.lab0802.task3.ui;

import java.util.Scanner;

import ru.nsu.dolgushin.lab0802.task3.model.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Child child = new Child(scanner.nextInt());
        child.print();
    }
}