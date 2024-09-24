package beispiel3.htlgkr.KlausnerL22066;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class NumberTester {

    NumberTest oddTester = (number) -> number % 2 != 0;
    NumberTest primeTester = (number) -> {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    };

    NumberTest palindromeTester = (number) -> {
        String numberString = Integer.toString(number);
        String reverseString = "";
        for(int i = numberString.length(); i > 0; i--){
            reverseString += numberString.charAt(i-1);
        }
        return numberString.equals(reverseString);
    };

    public NumberTester(String filename){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            int numberOfTests = Integer.parseInt(reader.readLine());
            for(int i = 0; i < numberOfTests; i++){
                String[] parts = reader.readLine().split(",");
                int number = Integer.parseInt(parts[2]);
                switch(Integer.parseInt(parts[0])){
                    case 1:
                        if(oddTester.testNumber(number)){
                            System.out.println("ODD");
                        } else {
                            System.out.println("EVEN");
                        }
                        break;
                    case 2:
                        if(primeTester.testNumber(number)){
                            System.out.println("PRIME");
                        } else {
                            System.out.println("NO PRIME");
                        }
                    case 3:
                        if(palindromeTester.testNumber(number)){
                            System.out.println("PALINDROME");
                        } else {
                            System.out.println("NO PALINDROME");
                        }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }
}
