package exerciseTwoPointTwoFive;
//2.25 (Odd or Even) Write an application that reads an integer and determines and prints
//        whether it’s odd or even. [Hint: Use the remainder operator. An even number is a multiple of 2.
//         Any multiple of 2 leaves a remainder of 0 when divided by 2.]

public class OddOrEven {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean evenNumberChecker(int number) {
        if( number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
