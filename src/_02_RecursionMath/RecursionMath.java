package _02_RecursionMath;

public class RecursionMath {

    public static int recursiveMultiplication(int number, int times) {
        // If times is 1 
    	if (times == 1) {
			return number;
		}else if (times == 0) {
			return 0;
		}else {
			int newNum = number + recursiveMultiplication(number, times-1);
			return newNum;
		}
            // Return number 
        // Else return number + recursionMultiplication(number, times-1)
    }

    // Try this one on your own! 
    // Hint: if numberToDivideBy is bigger than number,
    //       you can't divide anymore
    public static int recursiveDivision(int number, int numberToDivideBy) {
        if (numberToDivideBy == 1) {
        	return number;
		} else if (numberToDivideBy>number) {
			return number;
		} else {
			int newNum = (number)/(numberToDivideBy);
			return newNum;
		}
    }

    // Try this one on your own!
    public static int recursivePower(int number, int power) {
        if (power == 1) {
			return number;
		}else if (power == 0) {
			return 1;
		}else {
			int newNum = number * recursivePower(number, power-1);
			return newNum;
		}
    }
}
