package exerciseFivePointOneOne;
//(Find the Smallest Value) Write an application that finds the smallest of several integers.
//        Assume that the first value read specifies the number of values to input from the user.

public class SmallestInteger {
    private int number;
    private int smallestNumber;


    public void setNumber(int number) {
       this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void findSmallestNumber(int firstNumber, int secondNumber, int thirdNumber, int fourthNUmber, int fifthNUmber) {
        smallestNumber = firstNumber;
        for(int i = 0; i < fifthNUmber; i++){
            if(secondNumber < smallestNumber){
                smallestNumber = secondNumber;
            }
            if(thirdNumber < smallestNumber){
                smallestNumber = thirdNumber;
            }
            if(fourthNUmber < smallestNumber){
                smallestNumber = fourthNUmber;
            }
            if(fifthNUmber < smallestNumber){
                smallestNumber = fourthNUmber;
            }
        }

    }


    public int getSmallestNumber() {
        return smallestNumber;
    }
}
