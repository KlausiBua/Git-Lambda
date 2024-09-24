package beispiel3.htlgkr.KlausnerL22066;

public class NumberTester {

    NumberTest oddTester = (number) -> number % 2 != 0;

    public NumberTester(String filename){

    }

    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }
}
