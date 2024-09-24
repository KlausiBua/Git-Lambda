package beispiel3.htlgkr.KlausnerL22066;

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

    public NumberTester(String filename){

    }

    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }
}
