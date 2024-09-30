package beispiel3.htlgkr.KlausnerL22066;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberTester {

    private static final String FILENAME = "werte.csv";

    NumberTest oddTester = (number) -> number % 2 != 0;
    NumberTest primeTester = (number) -> {
        if(number < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
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
        try(BufferedReader br = new BufferedReader(new FileReader(filename))){
            String line = br.readLine();
            int numberOfTests = Integer.parseInt(line);
            for(int i = 0; i < numberOfTests; i++){
                line = br.readLine();
                String[] parts = line.split(",");
                int number = Integer.parseInt(parts[1]);
                switch (Integer.parseInt(parts[0])){
                    case 1:
                        if(oddTester.testNumber(number)){
                            System.out.println("ODD");
                        }else{
                            System.out.println("EVEN");
                        }
                        break;
                    case 2:
                        if(primeTester.testNumber(number)){
                            System.out.println("PRIME");
                        }else{
                            System.out.println("NO PRIME");
                        }
                        break;
                    case 3:
                        if(palindromeTester.testNumber(number)){
                            System.out.println("PALINDROME");
                        }else{
                            System.out.println("NO PALINDROME");
                        }
                        break;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
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

    public static void main(String[] args) {
        NumberTester nt = new NumberTester(FILENAME);
    }
}
