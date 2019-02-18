package com.james.Santa;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
public class SecretSanta {
    public static void main(String[] args) {
        String done = "no";
        int numberCount = 1;
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        while(!done.equals("yes")) {
            Scanner nameInput = new Scanner(System.in);
            System.out.println("Enter the " + numberCount + ending(numberCount) + " name if done type yes");
            String nextName = nameInput.nextLine();
            if (nextName.equals("yes")) {
                break;
            }
            names.add(nextName);
            Scanner emailInput = new Scanner(System.in);
            System.out.println("Enter the " + numberCount + ending(numberCount) + " email");
            String nextEmail = emailInput.nextLine();
            emails.add(nextEmail);
            numberCount++;
        }
        System.out.println(names);
        System.out.println(emails);
        ArrayList<String> shuffledNames = shuffle(names);
        ArrayList<String> shuffledEmails = shuffle(emails);
        System.out.println(shuffledNames);
        System.out.println(shuffledEmails);
        boolean same = Equal(shuffledNames, shuffledEmails)
        if ()
    }
    public static String ending(int number) {
        if (number == 1) {
            return "st";
        } else if (number == 2) {
            return "nd";
        } else if (number == 3) {
            return "rd";
        } else {
            return "th";
        }
    }
    public static ArrayList<String> shuffle(ArrayList<String> currentList) {
        ArrayList<String> shuffled = new ArrayList<>();

        int currentNumber = currentList.size() - 1;
        while(currentNumber != 0) {
            int min = 0;
            int max = currentNumber;
            int randomNumber = (int)(Math.random() * ((max-min) + 1)) + min;
            shuffled.add(currentList.remove(randomNumber));
            currentNumber--;
        }
        shuffled.add(currentList.remove(0));
        return shuffled;
    }
    public static boolean Equal(ArrayList<String> list1, ArrayList<String> list2) {
        if(list1.size ! = list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            String current1 = list1.get(i);
            String current2 = list2.get(i);
            if (!current1.equals(current2)) {
                return false;
            }
        }
        return true;
    }
}
