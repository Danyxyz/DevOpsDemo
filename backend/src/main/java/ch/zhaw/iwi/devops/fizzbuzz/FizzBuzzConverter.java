package ch.zhaw.iwi.devops.fizzbuzz;

//Ich schreibe hier Kommentare
// DevOps ist ein tolles Moduel
// Sonarqube Testing 1 2 3 4...

public class FizzBuzzConverter {

    public String convert(int i) {
        if (i % 3 == 0 && i % 7 == 0) {
            return "Im Changig the Code so i can see what happens in sonarqube";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 7 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }


}
