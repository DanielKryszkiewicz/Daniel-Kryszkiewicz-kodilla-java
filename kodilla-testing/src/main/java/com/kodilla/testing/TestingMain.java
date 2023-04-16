package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int addResult = calculator.add(5,5);
        int subtractResult = calculator.subtract(5, 5);

        if(addResult == 10) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        if(subtractResult == 0){
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }
    }
}